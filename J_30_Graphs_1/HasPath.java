package J_30_Graphs_1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class HasPath{
    public static Boolean haspath_BF(int arr[][], int s , int d)
    {
        if(s >= arr.length || d >= arr.length)
        {
            return false;
        }
        if(s == d || arr[s][d] == 1)
        {
            return true;
        }
        boolean isvisited[] = new boolean[arr.length];
        return helper_BF(arr,isvisited, s, d);
    }
    public static Boolean helper_BF(int arr[][], boolean isvisited[], int currentvertex, int destinationvertex)
    {
        isvisited[currentvertex] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(currentvertex);
        while(!q.isEmpty())
        {
            currentvertex = q.poll();
            for(int i = 0; i< arr.length; i++)
            {
                if(arr[currentvertex][i] == 1 && !isvisited[i])
                {
                    q.add(i);
                    isvisited[i] = true;
                }
            }
        }
        return isvisited[destinationvertex];
    }
    public static Boolean haspath_DF(int arr[][], int s, int d)
    {
        if(s >= arr.length || d >= arr.length)
        {
            return false;
        }
        if(s == d || arr[s][d] == 1)
        {
            return true;
        }
        boolean isvisited[] = new boolean[arr.length];
        return helper(arr,isvisited, s, d);
    }
    public static Boolean helper(int arr[][], boolean isvisited[], int currentvertex, int destinationvertex)
    {
        if(currentvertex == destinationvertex)
        {
            return true;
        }
        isvisited[currentvertex] = true;
        boolean ispath = false;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[currentvertex][i] == 0 && !isvisited[i])
            {
                ispath = helper(arr, isvisited, i, destinationvertex);
            }
            if(ispath)
            {
                break;
            }
        }
        return ispath;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int arr[][] = new int[v][v];
		for(int i = 0; i<e; i++)
		{
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			arr[v1][v2] = 1 ;
			arr[v2][v1] = 1 ;
		}
		int source = s.nextInt();
		int destination = s.nextInt();
		System.out.print(haspath_DF(arr, source, destination));
        s.close();
    }
}
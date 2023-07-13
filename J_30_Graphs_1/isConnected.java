package J_30_Graphs_1;

import java.util.*;

public class isConnected {
    public static Boolean isconnected(int arr[][])
    {
        boolean isvisited[] = new boolean[arr.length];
        BF_traversal(arr, isvisited);
        Boolean ans = true;
        for(Boolean i : isvisited)
        {
            if(i)
            {
                continue;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static void BF_traversal(int arr[][], boolean isvisited[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        isvisited[0]= true;
        while(!q.isEmpty())
        {
            int currentvertex = q.poll();
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[currentvertex][i] == 1 && !isvisited[i])
                {
                    q.add(i);
                    isvisited[i] = true;
                }
            }
        }
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
        System.out.println(isconnected(arr));
        s.close();
    }
}
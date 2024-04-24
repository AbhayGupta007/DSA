package J_31_Graphs_2;

import java.util.*;

public class Dijkstra_Algo {
    public static void DijkstraAlgo(int arr[][], int n)
    {
        boolean isvisited[] = new boolean[n];
        int dist[] = new int[n];
        for(int i = 1; i< n; i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i<n; i++)
        {
            int minvertex = findMin(isvisited, dist);
            isvisited[minvertex] = true;
            for(int j = 0; j < n; j++)
            {
                if(arr[minvertex][j] > 0 && !isvisited[j])
                {
                    int newdist = arr[minvertex][j] + dist[minvertex];
                    if(newdist < dist[j])
                    {
                        dist[j] = newdist;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println(i + " " + dist[i]);
        }
    }

    public static int findMin(boolean isvisited[], int dist[])
    {
        int minvertex = -1;
        for(int i = 0 ; i < isvisited.length; i++)
        {
            if(!isvisited[i] && (minvertex == -1 || dist[i] < dist[minvertex]))
            {
                minvertex = i;
            }
        }
        return minvertex;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        int arr[][] = new int[v][v];
        for(int i = 0; i < e; i++)
        {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            arr[v1][v2] = weight;
            arr[v1][v2] = weight;
        }
        DijkstraAlgo(arr, v);
    }
}
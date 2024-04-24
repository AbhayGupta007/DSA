package J_31_Graphs_2;

import java.util.*;

public class Prims_Algo {
    public static int findMinvertex(boolean isvisited[], int weight[])
    {
        int minvertex = -1; 
        for(int i = 0; i < isvisited.length; i++)
        {
            if(!isvisited[i] && (minvertex == -1 || weight[i] < weight[minvertex]))
            {
                minvertex = i;
            }
        }
        return minvertex;
    }

    public static void PrimsAlgo(int adj[][], int n)
    {
        boolean isvisited[] = new boolean[n];
        int parent[] = new int[n];
        int weight[] = new int[n];
        parent[0] = -1;
        weight[0] = 0;
        for(int i = 1; i < n; i++)
        {
            weight[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < n; i++)
        {
            // Find the minimum vertex.
            int minvertex = findMinvertex(isvisited, weight);
            isvisited[minvertex] = true;

            for(int j = 0; j < n; j++)
            {
                if(adj[minvertex][j] != 0 && !isvisited[j])
                {
                    if(weight[j] > adj[minvertex][j])
                    {
                        weight[j] = adj[minvertex][j];
                        parent[j] = minvertex;
                    }
                }
            }
        }
        // Printing the final MST
        System.out.println("Final MST is : ");
        for(int i = 1; i < n; i++)
        {
            if(parent[i] > i)
            {
                System.out.println(i + " " + parent[i] + " " + weight[i]);
            }
            else
            {
                System.out.println(parent[i] + " " + i + " " + weight[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Vertices: ");
        int v = s.nextInt();
        System.out.print("Enter number of Edges: ");
        int e = s.nextInt();
        int adj[][] = new int[v][v];
        for(int i = 0; i<e; i++)
        {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            adj[v2][v1] = weight;
            adj[v1][v2] = weight;
        }
        PrimsAlgo(adj, v);
        s.close();
    }
}
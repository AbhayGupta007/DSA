package J_30_Graphs_1;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int n = s.nextInt();
        System.out.print("Enter the number of edges: ");
        int e = s.nextInt();
        int adjmatrix[][] = new int[n][n];
        for(int i = 0; i< e;)
        {
            System.out.print("Enter the vertices to create "+ (i+1) + " edge: ");
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            if(v1 < n && v2 < n)
            {
                adjmatrix[v1][v2] = 1;
                adjmatrix[v2][v1] = 1;
                i++;
            }
            else
            {
                System.out.println("Wrong intput enter again.");
            }
        }
        for(int i =0; i<n;i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(adjmatrix[i][j]+"\t");
            }
            System.out.println();
        }
        s.close();
    }
}
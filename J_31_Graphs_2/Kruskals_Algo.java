package J_31_Graphs_2;

import java.util.*;

class Edge implements Comparable<Edge>{
    int v1;
    int v2;
    int weight;
    
    public Edge(int v1, int v2, int weight)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public int compareTo(Edge o) 
    {
        return weight - o.weight;
    }
}

public class Kruskals_Algo {
    private static Edge[] KruskalsAlgorithm(Edge[] edges, int n) {
        Arrays.sort(edges);
        Edge mst[] = new Edge[n-1];
        int i = 0, count = 0;
        while(count != n-1)
        {
            Edge currentedge = edges[i++];

        }
        return mst;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        Edge edges[] = new Edge[e];
        for(int i = 0; i < e; i++)
        {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            Edge edge = new Edge(v1, v2, weight);
            edges[i] = edge;
        }
        Edge mst[] = KruskalsAlgorithm(edges, v);
        s.close();
    }
}
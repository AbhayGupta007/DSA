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
        int parent[] = new int[n];
        for(int j = 0; j<n; j++)
        {
            parent[j] = j;
        }
        int i = 0, count = 0;
        while(count != n-1)
        {
            Edge currentedge = edges[i++];
            int v1Parent = findParent(currentedge.v1, parent);
            int v2Parent = findParent(currentedge.v2, parent);
            if(v1Parent != v2Parent)
            {
                mst[count] = currentedge;
                count++;
                parent[v1Parent] = v2Parent;
            }
        }
        return mst;
    }

    // My Method.
    public static int findParent(int currentEdge, int parent[])
    {
        while(parent[currentEdge] != currentEdge)
        {
            currentEdge = parent[currentEdge];
        }
        return currentEdge;
    }
    // Coding Ninja's Method.
    public static int findParent1(int currentEdge, int parent[])
    {
        if(currentEdge == parent[currentEdge])
        {
            return currentEdge;
        }
        return findParent1(parent[currentEdge], parent);
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
        System.out.println("Your final MST is -: ");
        for(int i = 0; i < mst.length; i++)
        {
            if(mst[i].v1 > mst[i].v2)
            {
                System.out.println(mst[i].v2 +" "+ mst[i].v1 + " " + mst[i].weight);
            }
            else{
                System.out.println(mst[i].v1 +" "+ mst[i].v2 + " " + mst[i].weight);
            }
        }
        s.close();
    }
}
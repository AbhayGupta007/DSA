package J_30_Graphs_1;

import java.util.*;

public class GetPath {
    public static ArrayList<Integer> getpath_DFS(int arr[][], int s, int d) {
        if (s >= arr.length || d >= arr.length) {
            return null;
        }
        Boolean isvisited[] = new Boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            isvisited[i] = false;
        }
        return helper_DFS(arr, isvisited, s, d);
    }

    public static ArrayList<Integer> helper_DFS(int arr[][], Boolean isvisited[], int currentvertex, int destinationvertex) {
        if (currentvertex == destinationvertex) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(currentvertex);
            return ans;
        }
        isvisited[currentvertex] = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[currentvertex][i] == 1 && !isvisited[i]) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp = helper_DFS(arr, isvisited, i, destinationvertex);
                if (temp != null) {
                    temp.add(currentvertex);
                    return temp;
                }
            }
        }
        return null;
    }

    public static ArrayList<Integer> getpath_BFS(int arr[][], int s, int d) {
        if (s >= arr.length || d >= arr.length) {
            return null;
        }
        Boolean isvisited[] = new Boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            isvisited[i] = false;
        }
        return helper_BFS(arr, s, d, isvisited);
    }

    public static ArrayList<Integer> helper_BFS(int arr[][], int currentvertex, int destinationvertex, Boolean isvisited[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(currentvertex);
        isvisited[currentvertex] = true;
        map.put(currentvertex, -1);
        ArrayList<Integer> ans = new ArrayList<>();
        int temp = -1;
        while(!q.isEmpty())
        {
            currentvertex = q.poll();
            for(int i = 0; i<arr.length; i++)
            {
                if(arr[currentvertex][i] == 1 && !isvisited[i])
                {
					if(i == destinationvertex)
                	{
                    	map.put(i, currentvertex);
                    	temp = destinationvertex;
                    	break;
                	}
					else
					{
						q.add(i);
						map.put(i, currentvertex);
						isvisited[i] = true;
					}
                }
            }
			if(temp != -1)
			{
				break;
			}
        }
        while(temp != -1)
        {
            ans.add(temp);
            temp = map.get(temp);
        }
        return ans;
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
		ArrayList<Integer> ans = getpath_BFS(arr, source, destination);
		if(ans != null)
		{
			for(int i : ans)
			{
				System.out.print(i+" ");
			}
		}
        s.close();
    }
}
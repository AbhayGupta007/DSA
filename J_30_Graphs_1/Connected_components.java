package J_30_Graphs_1;

import java.util.*;

public class Connected_components {
    public static void printpath(int arr[][])
	{
		boolean isvisited[] = new boolean[arr.length];
		for(int i = 0; i< arr.length; i++)
		{
			if(!isvisited[i])
			{
				ArrayList<Integer> ans = helper_BFS(arr, i, isvisited);
				Collections.sort(ans);
				for(int j : ans)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
	public static ArrayList<Integer> helper_BFS(int arr[][], int currentvertex, boolean isvisited[])
    {
        ArrayList<Integer> ans = new ArrayList<>();
		isvisited[currentvertex] = true;
		Queue<Integer> q = new LinkedList<>();
		ans.add(currentvertex);
		q.add(currentvertex);
		while(!q.isEmpty())
		{
			currentvertex =  q.poll();
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[currentvertex][i] == 1 && !isvisited[i])
				{
					q.add(i);
					ans.add(i);
					isvisited[i] = true;
				}
			}
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
		printpath(arr);
        s.close();
	}
}
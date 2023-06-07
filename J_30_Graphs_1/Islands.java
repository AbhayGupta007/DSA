/*An island is a small piece of land surrounded by water . A group of islands is said to be connected if we can reach from any given island to any other island in the same group . Given V islands (numbered from 0 to V-1) and E connections or edges between islands. Can you count the number of connected groups of islands. */

package J_30_Graphs_1;
import java.util.*;
public class Islands {
    public static int numConnected(int[][] arr, int n) {
		boolean isvisited[] = new boolean[n];
		int count = 0;
		for(int i = 0; i<n; i++)
		{
			if(isvisited[i])
			{
				continue;
			}
			else
			{
				helper(arr, i, isvisited);
				count++;
			}
		}
		return count;
	}
	public static void helper(int arr[][], int currentvertex, boolean isvisited[])
	{
		isvisited[currentvertex] = true;
		for(int i= 0; i<arr.length; i++)
		{
			if(arr[currentvertex][i]  == 1 && !isvisited[i])
			{
				helper(arr, i, isvisited);
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
		System.out.println(numConnected(arr, v));
        s.close();
	}
}

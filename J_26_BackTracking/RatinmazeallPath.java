package J_26_BackTracking;

// import java.util.Scanner;

public class RatinmazeallPath {
    static void ratInAMaze(int maze[][]) {
		
		int path[][] = new int[maze.length][maze.length];
		helper(maze, 0, 0, path);
	}
	public static void helper(int maze[][], int i, int j, int path[][]){
		int n = path.length;
		if(i<0 || j<0 || j>=n || i>=n || maze[i][j] == 0 || path[i][j] == 1)
		{
			return;
		}
		path[i][j] = 1;
		if(i == n-1 && j == n-1 && maze[i][j] == 1)
		{
			for(int k = 0; k<n; k++)
			{
				for(int b = 0; b<n; b++)
				{
					System.out.print(path[k][b]+" ");
				}
			}
			System.out.println();
			path[i][j] = 0;
			return ;
		}
		helper(maze, i-1, j, path);
		helper(maze, i+1, j, path);
		helper(maze, i, j-1, path);
		helper(maze, i, j+1, path);
		path[i][j] = 0;
	}
    
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int maze[][] = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         maze[i][j] = s.nextInt();
        //     }
        // }
        int maze[][]={{1,1,1},{1,1,0},{0,1,1}};
        ratInAMaze(maze);
        // s.close();
    }
}

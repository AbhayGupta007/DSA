package J_26_BackTracking;

import java.util.Scanner;

public class RatinMazepath {
    public static boolean ratInAMaze(int maze[][]) {
        int n = maze.length;
        int path[][] = new int[n][n];
        return ratmaze(maze, 0, 0, path);
    }

    public static boolean ratmaze(int maze[][], int i, int j, int path[][]) {
        if (i < 0 || j >= maze.length || i >= maze.length || j < 0 || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }
        path[i][j] = 1;
        if(i == maze.length - 1 && j == maze.length - 1 && maze[i][j] == 1) {
            for(int k = 0 ; k < path.length; k++)
            {
                for(int l = 0; l < path.length; l++)
                {
                    System.out.print(path[k][l] + " ");
                }
                System.out.println();
            }
            return true;
        }
        if (ratmaze(maze, i - 1, j, path)) {
            return true;
        }
        if (ratmaze(maze, i, j + 1, path)) {
            return true;
        }
        if (ratmaze(maze, i + 1, j, path)) {
            return true;
        }
        if (ratmaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maze[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = s.nextInt();
            }
        }
        System.out.println(ratInAMaze(maze));
        s.close();
    }
}
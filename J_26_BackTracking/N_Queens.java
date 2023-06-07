package J_26_BackTracking;

import java.util.Scanner;

public class N_Queens {
    public static void placeNQueens(int n){
		int board[][] = new int[n][n];
		helper(board,0,n);
	}
	public static void helper(int board[][], int row, int n)
	{
		if(row == n)
		{
			for(int i = 0; i<n; i++)
			{
				for(int j = 0; j<n; j++)
				{
					System.out.print(board[i][j]+" ");
				}
                System.out.println();
			}
            System.out.print("************************************************************\n");
			return ;
		}
		for(int j = 0; j<n; j++)
		{
			if(issafe(board,row,j))
			{
				board[row][j] = 1;
				helper(board, row+1, n);
				board[row][j] = 0;
			}
		}
	}
	public static boolean issafe(int board[][], int row, int col){
		int n = board.length;
		int i , j;
		for( i = row ; i >= 0; i--)
		{
			if(board[i][col] == 1)
			{
				return false;
			}
		}
		for( i = row,  j = col; i>=0 && j < n; i--, j++)
		{
			if(board[i][j] == 1)
			{
				return false;
			}
		}
		for( i = row,  j = col; i>=0 && j>=0; i--, j--)
		{
			if(board[i][j] == 1)
			{
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the dimensions of board: ");
        int n = s.nextInt();
        placeNQueens(n);
        s.close();
    }
}
//Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.

package J_5_Arrays_2D;

public class J12 
{
    public static void print2DArray(int input[][]) 
    {
		for(int i = 0; i<input.length; i++)
        {
        	int n = input.length - i;
            while(n>0)
            {
                for(int j = 0; j<input[0].length; j++)
            	{
                	System.out.print(input[i][j]+" ");
            	}
                System.out.println();
                n--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        print2DArray(arr);
    }
}
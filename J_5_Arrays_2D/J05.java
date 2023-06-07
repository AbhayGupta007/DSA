// This is program is to show that in an 2D array the size of the column can vary in each row.

package J_5_Arrays_2D;

public class J05 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1},{1,2},{1,2,3},{1,2,3,4}};
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j =0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
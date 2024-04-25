// Creating and printing Jagged arrays.

package J_5_Arrays_2D;

public class J08 {
    public static void main(String[] args) {
        int arr[][] = new int[5][];
        int count = 1;
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = new int[i+2];
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i].length+" ");
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j <arr[i].length; j++)
            {
                arr[i][j] = count++;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j <arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

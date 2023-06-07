// Program to find largest sum either across row or column in a 2D Matrice

package J_5_Arrays_2D;

public class J07 {
    public static void largest(int arr[][])
    {
        int row = arr.length;
        if(row == 0 )
        {
            System.out.print("row 0 "+Integer.MIN_VALUE);
            return;
        }
        int col = arr[0].length;
        int largest = Integer.MIN_VALUE;
        String str = "";
        int indexnum = 0;
        for(int i = 0; i<row; i++)
        {
            int sum = 0;
            for(int j = 0; j<col; j++)
            {
                sum += arr[i][j];
            }
            if(sum > largest)
            {
                largest = sum;
                str = "row";
                indexnum = i;
            }
        }
        for(int i = 0; i<col; i++)
        {
            int sum = 0;
            for(int j = 0; j<row; j++)
            {
                sum += arr[j][i];
            }
            if(sum > largest)
            {
                largest = sum;
                str = "col";
                indexnum = i;
            }
        }
        System.out.println(str + " " + indexnum + " " + largest);
    }
    public static void main(String[] args) {
        int arr[][] = {{6,9},{8,5},{9,2}};
        int arr2[][] = new int[0][2];

        largest(arr);
        largest(arr2);
    }
}
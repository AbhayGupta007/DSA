package J_5_Arrays_2D;

public class J06 {
    public static void main(String[] args) 
    {
        int arr[][] = {{1,4,5}, {2,3,4}, {6,9,2}};
        int  sum2 = 0;
        for(int i = 0; i < arr[0].length; i++)
        {
            int sum1 = 0;
            for(int j = 0; j<arr.length; j++)
            {
                sum1 += arr[j][i];
            }
            if(sum1>sum2)
            {
                sum2 = sum1;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(sum2);
    }
}

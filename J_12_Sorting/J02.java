package J_12_Sorting;

public class J02 {
    public static void sortzeroes(int arr[])
    {
        int j =0;
        int temp;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
                j++;
            }
        }
    }
    public static void printArray(int a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int array[] = {5 ,0, 7, 4 ,8, 1, 3, 0 ,7 ,2 ,0};
        sortzeroes(array);
        printArray(array);;
    }
}
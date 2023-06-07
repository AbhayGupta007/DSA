package J_12_Sorting;

public class sort012 {
    public static void sort012_(int arr[]){
        int nextzero = 0, nexttwo = arr.length-1;
        int temp;
        for(int i = 0; i<=nexttwo; )
        {
            if(arr[i] == 0)
            {
                temp = arr[nextzero];
                arr[nextzero] = arr[i];
                arr[i] = temp;
                nextzero++;
                i++;
            }
            else if(arr[i] == 2)
            {
                temp = arr[nexttwo];
                arr[nexttwo] = arr[i];
                arr[i] = temp;
                nexttwo--;
            }
            else{
                i++;
            }
        }
    }
    public static void printArray(int a[])
    {
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 1 ,0 ,1, 2 ,1 };
        sort012_(arr);
        printArray(arr);
    }
}

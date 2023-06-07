package J_7_OOPS.Generics.Boundedgenerics;

public class print1 {
    public static <T> void printarr(T arr[]){
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = new Integer[5];
        for(int i = 0 ; i<arr.length; i++)
        {
            arr[i] = i+1;
        }
        printarr(arr);
        System.out.println();

        String arr1[] = new String[5];
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = "a";
        }
        printarr(arr1);
        System.out.println();
    }
}

//Program to find second largest element rom given array.

package J_4_Arrays;

public class J13 {
    public static int secondLargest(int arr[])
    {
        int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
        if(arr.length<2)
        {
            return Integer.MIN_VALUE;
        }
        for(int i = 0; i<arr.length; i++)
        {
            if(l1 == arr[i])
            {
                continue;
            }
            else if(l1<arr[i])
            {
                l2 = l1;
                l1 = arr[i];
            }
            else if (l1 > arr[i])
            {
                if(l2 < arr[i])
                {
                    l2 = arr[i];
                }
            }
            if(i == arr.length-1)
            {
                return l2;
            }
            System.out.println(l1+" "+l2);
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int arr [] = {2,6,1,9,8,9,7};
        int n = secondLargest(arr);
        System.out.print(n);
    }
}
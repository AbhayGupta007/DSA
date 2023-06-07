// Program to add two arrays.
package J_4_Arrays;
public class J15 
{
    public static void addsum(int arr1[], int arr2[], int output[])
    {
        int num = 0, carry = 0;
        int k = output.length - 1;
        int i = arr1.length - 1, j = arr2.length - 1;
        while(i>=0 && j >= 0)
        {
            num = carry + arr1[i] + arr2[j];
            if(num>9)
            {
                output[k] = (num % 10);
                carry = num/10;
            }
            else
            {
                output[k] = num;
            }
            i--; j--; k--;
        }
        while(i>=0)
        {
            num = carry + arr1[i];
            if(num>9)
            {
                output[k] = (num %10);
                carry = num/10;
            }
            else
            {
                output[k] = num;
            }
            i--;k--;
        }
        while(j>=0)
        {
            num = carry + arr2[j];
            if(num>9)
            {
                output[k] = (num % 10);
                carry = num/10;
            }
            else
            {
                output[k] = num;
            }
            j--;k--;
        }
        output[k] += carry; 
    }

    public static void printArray(int a[]) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) 
    {
        int arr1[] = {6,2,4};
        int arr2[] = {9,7,6,1};
        int arr3[] = new int[1+ (Math.max(arr1.length, arr2.length))];
        addsum(arr1, arr2, arr3);
        printArray(arr3);
    }
}
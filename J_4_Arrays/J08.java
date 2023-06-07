// Program to understand what are primitive data types and how they works.
// P.S. Array is primitive data type.

package J_4_Arrays;

public class J08 
{
    public static void printarray(int array[])
    {
        for(int i =0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void increment (int input[])
    {
        System.out.println(input);
        for(int i =0; i < input.length; i++)
        {
            input[i] = input[i] + 1;
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr);
        increment(arr);
        printarray(arr);
    }
}
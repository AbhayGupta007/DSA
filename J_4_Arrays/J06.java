/*Program to print an array by taking input n from user (Method -1)
if n = 5
array = 1 3 5 4 2

if n = 7
array = 1 3 5 7 6 4 2

if n = 8
array = 1 3 5 7 8 6 4 2

and so on :-
*/
package J_4_Arrays;

import java.util.Scanner;

public class J06 {

    public static int[] array(int n)
    {
        int arr[] = new int[n];
        if(n % 2 != 0)
        {
            int a = 1;
        	for(int i = 0; i<= (n/2) ; i++)
        	{
            	arr[i] = a;
            	a+=2;
        	}
            a = n-1;
            for(int i = (n/2)+1; i<n; i++)
            {
                arr[i] = a;
                a-=2;
            }
        }
        else
        {
            int a = 1;
            for(int i = 0; i < (n/2); i++)
            {
                arr[i] = a;
                a+=2;
            }
            a=n;
            for(int i = n/2; i<n; i++)
            {
                arr[i] = a;
                a-=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in arrays: ");
        int n = s.nextInt();
        int arr1[] = array(n);
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        s.close();
    }
}

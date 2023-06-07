/*Program to print an array by taking input n from user (Method-2)
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

public class J07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int start = 0, end = n-1, i = 1;
        int arr[] = new int[n];
        while(start <= end)
        {
            arr[start] = i++;
            arr[end] = i;
            if(start == end)
            {
                arr[start] = n;
            }
            start++; end--;
            i++;
        }
        for(int j = 0; j<n; j++)
        {
            System.out.print(arr[j]+" ");
        }
        s.close();
    }
}
//Program to read an array.
package J_4_Arrays;
import java.util.Scanner;
public class J03 {
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter sizer of array: ");
        int n = s.nextInt();
        
        int arr[] = new int[n];
        for(int i =0 ; i<n; i++)
        {
            System.out.print("Enter number at index "+ (i+1) +": ");
            arr[i] = s.nextInt();
        }
        
        System.out.println();
        
        for(int i = 0; i<n; i++)
        {
            System.out.println("Element at index "+ (i+1) +" is: "+ arr[i]);
        }
        
        s.close();
    }
}
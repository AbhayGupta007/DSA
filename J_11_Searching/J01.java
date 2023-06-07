// Program for Linear Search.

package J_11_Searching;
import java.util.Scanner;
public class J01 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int arr[] = new int[n1];
        for(int i= 0; i<n1; i++)
        {
            arr[i] = s.nextInt();
        }
        boolean search = false;
        System.out.print("Enter number to search: ");
        int n2 = s.nextInt();
        for(int i = 0; i<n1 ; i++)
        {
            if(arr[i] == n2)
            {
                search = true;
                break;
            }
        }
        if(search)
        {
            System.out.println("Successfull.");
        }
        else
        {
            System.out.println("Unsuccessfull.");
        }
        s.close();
    }
}

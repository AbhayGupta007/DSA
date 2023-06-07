// Program to print all possible pairs in arrays.

package J_4_Arrays;

public class J09 {
    public static void main(String[] args) {
        int arr[] = {1,4,7,6,5};
        System.out.print("{");
        for(int i=0; i<5; i++)
        {
            for(int j = i+1; j<5; j++)
            {
                System.out.print("(" + arr[i] + "," + arr[j]+") ");
            }
        }
        System.out.print("}");
    }
}
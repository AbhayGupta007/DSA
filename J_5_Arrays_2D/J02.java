// Program to create an char array then storing alphabets in that array and finally printing the array in it's format.

package J_5_Arrays_2D;

public class J02 {
    public static void main(String[] args) {
        char arr[][] = new char[2][13];
        char ch = 'A';
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<13; j++)
            {
                arr[i][j] = ch++;
            }
        }
        for(int i = 0; i<2; i++)
        {
            System.out.print("|\t");
            for(int j =0; j<13; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("|");
        }
    }
}

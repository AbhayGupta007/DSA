// For loop kinds.

package J_1_Fundamentals;

public class J09 {
    public static void main(String[] args) 
    {     
        int n = 5;
        for (int i = 1, j = 100; i<=n && j<200; i++, j+=30)
        {
            System.out.println(i+ " "+j);
        }
    }
}
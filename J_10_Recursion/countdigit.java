package J_10_Recursion;
import java.util.Scanner;

public class countdigit {
    public static int count(int n)
    {
        if(n/10 == 0)
	{
		return 1;
	}
	return 1+ count(n/10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
        s.close();
    }
}

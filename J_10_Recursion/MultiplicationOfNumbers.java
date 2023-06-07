package J_10_Recursion;

public class MultiplicationOfNumbers {
    public static int mul(int num1, int num2)
    {
        if(num2 == 1)
        {
            return num1;
        }
        else
        {
            return num1 + mul(num1, num2-1); 
        }
    }
    public static void main(String[] args) {
        System.out.println(mul(4,3));
    }
}

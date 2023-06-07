package J_15_Stack.Questions;
import java.util.Stack;

public class stock_span {
    public static int[] stockspan(int[] arr)
    {
        int arr1[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            int j = 0;
            Stack<Integer> stack = new Stack<Integer>();
            while(j<i)
            {
                stack.push(arr[j]);
                j++;
            }
            int count = 1;
            if(stack.isEmpty())
            {
                arr1[i] = count;
            }
            else{
                while(stack.isEmpty() != true && stack.peek() < arr[i])
                {
                    stack.pop();
                    count++;
                }
                arr1[i] = count;
            }
        }
        return arr1;
    }

    public static void printarr(int a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[] args){
        int arr1[] = {60, 70, 80 ,100, 90, 75, 80, 120};
        int ss1[] = stockspan(arr1);
        printarr(ss1);
        System.out.println();
        int arr2[] = {10, 10, 10, 10, 10};
        int ss2[] = stockspan(arr2);
        printarr(ss2);
    }
}

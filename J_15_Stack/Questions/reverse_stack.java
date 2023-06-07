package J_15_Stack.Questions;
import java.util.Stack;
public class reverse_stack {
    public static void stackreverse(Stack<Integer> stack, Stack<Integer> helper)
    {
        if(stack.isEmpty())
        {
            return;
        }
        else{
            int temp = stack.pop();
            stackreverse(stack, helper);
            while(!stack.isEmpty())
            {
                helper.push(stack.pop());
            }
            stack.push(temp);
            while(!helper.isEmpty())
            {
                stack.push(helper.pop());
            }
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int arr[] = {1,2,3,4,5};
        for(int elem : arr)
        {
            stack.push(elem);
        }
        Stack<Integer> helper = new Stack<Integer>();
        stackreverse(stack, helper);

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}

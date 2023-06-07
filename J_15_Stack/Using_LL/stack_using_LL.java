package J_15_Stack.Using_LL;

import J_15_Stack.Using_Array.stackemptyexception;

public class stack_using_LL {
    public static void main(String[] args) throws stackemptyexception {
        stack_LL<Integer> stack = new stack_LL<Integer>();
        int arr[] = {5,6,1,7,9};
        for(int i : arr)
        {
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop() + " ");
        }
    }
}
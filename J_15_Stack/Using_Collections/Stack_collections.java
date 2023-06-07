package J_15_Stack.Using_Collections;

import java.util.Stack;

public class Stack_collections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        System.out.println("The size of stack is: "+stack.size()+ "\nThe element at top is: " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int arr[] = {5,6,1,7,9};
        for(int elem : arr)
        {
            stack.push(elem);
        }
        System.out.println();
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
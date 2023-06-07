package J_15_Stack.Using_Array;

public class stackuse {
    public static void main(String[] args) throws stackemptyexception, stackfullexception 
    {
        stackarray stack = new stackarray(5);
        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        int arr[] = {5,6,1,7,9};
        for(int i : arr)
        {
            stack.push(i);
        }
        System.out.println();
        stack.push(10);
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }

    }
}
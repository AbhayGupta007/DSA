package J_15_Stack.Questions;

import java.util.Scanner;

import java.util.Stack;

public class minimum_bracket_reversal {
    public static int reversalrequired(String str)
    {
        if(str.length() % 2 != 0)
        {
            return -1;
        }
        int count = 0;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '{')
            {
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == '}')
            {
                if(!stack.isEmpty() && stack.peek() == '{')
                {
                    stack.pop();
                }
                else{
                    stack.push(str.charAt(i));
                }
            }
        }
        while(!stack.isEmpty())
        {
            char c2 = stack.pop();
            char c1 = stack.pop();
            if(c1 == c2)
            {
                count++;
            }
            else{
                count+=2;
            }
        }
        return count;
    }    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reversalrequired(str)); 
        s.close();
    }
}
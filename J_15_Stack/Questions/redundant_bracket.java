package J_15_Stack.Questions;

import java.util.Stack;

public class redundant_bracket {
    public static boolean check(String str) {
        Stack<Character> stack = new Stack<Character>();
        boolean ans = true;
        int i = 0;
        while (i < str.length()) 
        {
            if (str.charAt(i) == '(' || str.charAt(i) == '{') 
            {
                stack.push(str.charAt(i++));
            } 
            else if (str.charAt(i) == '+' || str.charAt(i) == '/' || str.charAt(i) == '*' || str.charAt(i) == '-') 
            {
                stack.push(str.charAt(i++));
            }
            else if (str.charAt(i) == ')' || str.charAt(i) == '}') 
            {
                if (stack.peek() != '(' && stack.peek() != '{') 
                {
                    ans = false;
                    while(stack.peek() != '(' && stack.peek() != '{')
                    {
                        stack.pop();
                    }
                    stack.pop();
                    i++;
                }
                else if(stack.peek() == '(' || stack.peek() == '{')
                {
                    return true;
                }
            } 
            else 
            {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "(a+b)";
        String str2 = "a+(b)+c";
        String str3 = "((a+b))";
        String str4 = "(a+b*((a/c-d)))";
        System.out.println(check(str1));
        System.out.println(check(str2));
        System.out.println(check(str3));
        System.out.println(check(str4));
    }
}
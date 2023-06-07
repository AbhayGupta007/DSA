/*For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
  
Sample Input 1 :
(()()())
Sample Output 1 :
true

Sample Input 2 :
()()(()
Sample Output 2 :
false

*/
package J_15_Stack.Questions;

import java.util.Scanner;
import java.util.Stack;

public class balance_Bracket {
    public static Boolean isbalance(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
            {
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    if(str.charAt(i) == ')' && stack.peek() == '(')
                    {
                        stack.pop();
                    }
                    else if(str.charAt(i) == '}' && stack.peek() == '{')
                    {
                        stack.pop();
                    }
                    else if(str.charAt(i) == ']' && stack.peek() == '[')
                    {
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = s.nextLine();
        System.out.println(isbalance(a));
        s.close();
    }
}
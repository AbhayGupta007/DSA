package J_25_Recursion_3;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class StringSubsequence {
    public static ArrayList<String> subsequence(String str){
        if(str.length() == 0)
        {
            ArrayList<String> output = new ArrayList<>();
            output.add("");
            return output;
        }
        ArrayList<String> temp = subsequence(str.substring(1));
        ArrayList<String> output = new ArrayList<>();
        for(String i: temp)
        {
            output.add(i);
        }
        for(String i: temp)
        {
            output.add(str.charAt(0)+i);
        }
        return output;
    }
    public static void printsubsequence(String str, String in){
        if(str.length() == 0)
        {
            System.out.println(in);
            return ;
        }
        String smallstring = str.substring(1);
        printsubsequence(smallstring, in);
        printsubsequence(smallstring, in+str.charAt(0));
    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> s = subsequence(str);
        System.out.print("{");
        for(String i : s)
        {
            System.out.print(i+" ,");
        }
        System.out.print("}");
        PriorityQueue<String> q = new PriorityQueue<>();
        for(String i : s)
        {
            q.add(i);
        }
        System.out.print("\n{null");
        while(!q.isEmpty())
        {
            if(q.size() == 1)
            {
                System.out.print(q.poll());
                break;
            }
            System.out.print(q.poll()+", ");
        }
        System.out.print("}");
        printsubsequence(str, "");
    }
}
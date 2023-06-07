package J_14_LinkedList;

import java.util.Scanner;

public class printrecursive {
    public static node<Integer> takeinput1() 
    {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        node<Integer> head = null;
        node<Integer> tail = null;
        while (data != -1) {
            node<Integer> currentnode = new node<Integer>(data);
            if (head == null) {
                head = currentnode;
            } else {
                tail.next = currentnode;
            }
            tail = currentnode;
            data = s.nextInt();
        }
        s.close();
        return head;
    }
    public static void printinrecursive(node<Integer>head)
    {
        if(head == null)
        {
            return;
        }
        System.out.print(head.data+" ");
        printinrecursive(head.next);
    }
    public static void main(String[] args) {
        node<Integer> head = takeinput1();
        printinrecursive(head);
    }
}

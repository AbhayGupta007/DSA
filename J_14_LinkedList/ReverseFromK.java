package J_14_LinkedList;

import java.util.Scanner;

public class ReverseFromK{
    public static int length_LL(node<Integer> head){
        int count = 0;
        while(head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    public static node<Integer> takeinput() 
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
    public static void printlist(node<Integer> head) 
    {
        System.out.print("The link list is : ");
        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static node<Integer> reverselist(node<Integer> head)
    {
        if(head.next == null)
        {
            return head;
        }
        node<Integer> smallhead = reverselist(head.next);
        node<Integer> tail = head.next;
        tail.next = head;
        tail = tail.next;
        tail.next = null;
        return smallhead;
    }
    private static node<Integer> reversek(node<Integer> head, int k) {
        if(head == null || k == 0)
        {
            return head;
        }
        if(k >= length_LL(head)){
            return reverselist(head);
        }
        int count = 0;
        node<Integer> subhead1 = head;
        node<Integer> subhead2 = null;
        node<Integer> tail = head;
        while (count != k-1)
        {
            tail = tail.next;
            count++;
        }
        subhead2 = tail.next;
        subhead2 = reversek(subhead2, k);
        tail.next = null;
        subhead1 = reverselist(subhead1);
        tail = subhead1;
        while(tail.next !=null)
        {
            tail = tail.next;
        }
        tail.next = subhead2;
        return subhead1;
    }
    
    public static void main(String[] args) {
        node<Integer> head = takeinput();
        head = reversek(head,3);
        printlist(head);
    }
}
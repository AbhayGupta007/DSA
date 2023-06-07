package J_14_LinkedList;

import java.util.Scanner;

public class reverselist {
    public static void printlist(node<Integer> head) {
        System.out.print("The link list is : ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static node<Integer> takeinput() {
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
    
    //Method-1
    public static node<Integer> reverserecursive(node<Integer>head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        node<Integer> reversed_head = reverserecursive(head.next);
        node<Integer> tail = reversed_head;
        while(tail.next != null)
        {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return reversed_head;
    }

    //Method-2
    public static DoubleNode reversebetterrecursive(node<Integer> head)
    {
        DoubleNode ans; 
        if(head == null || head.next == null)
        {
            ans = new DoubleNode(head, head);
            // ans.head = head;
            // ans.tail = head;
            return ans;
        }
        DoubleNode smallans = reversebetterrecursive(head.next);
        smallans.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = smallans.head;
        ans.tail = head;
        return ans;
    }
    
    public static node<Integer> reversebetterlink(node<Integer>head)
    {
        DoubleNode ans = reversebetterrecursive(head);
        return ans.head;
    }
    
    //Method-3
    public static node<Integer> reversebestrecursive(node<Integer> head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        node<Integer> smallhead = reversebestrecursive(head.next);
        node<Integer> tail = head.next;
        tail.next = head;
        head.next = null;
        return smallhead;
    }
    
    //Method-4
    public static node<Integer> revIterative(node<Integer>head)
    {
        node<Integer>temp = new node<Integer>(head.data);
        temp.next = null;
        while(head.next != null)
        {
            head = head.next;
            node<Integer> currentnode = new node<Integer>(head.data);
            currentnode.next = temp;
            temp = currentnode;
        }
        return temp;
    }
    
    public static void main(String[] args) {
        node<Integer> head = takeinput();
        printlist(head);
        printlist(reversebestrecursive(head));;
    }
}
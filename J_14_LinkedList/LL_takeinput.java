package J_14_LinkedList;

import java.util.Scanner;

public class LL_takeinput {
    // Method -1 O(n)
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

    // Method -2 O(n^2)
    /*
     * public static node<Integer> takeinput2()
     * {
     * Scanner s = new Scanner(System.in);
     * int data = s.nextInt();
     * node<Integer> head = null;
     * while(data != -1)
     * {
     * node<Integer> currentnode = new node<Integer>(data);
     * if(head == null)
     * {
     * head = currentnode;
     * }
     * else
     * {
     * node<Integer> tail = head;
     * while(tail.next != null)
     * {
     * tail = tail.next;
     * }
     * tail.next = currentnode;
     * }
     * data = s.nextInt();
     * }
     * s.close();
     * return head;
     * }
     */

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

    public static int lengthoflist(node<Integer> head)
    {
        int count = 0; 
        while (head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }

    public static node<Integer> insert(node<Integer> head, int pos, int data) 
    {
        node<Integer> currentnode = new node<Integer>(data);
        if (pos == 0) 
        {
            currentnode.next = head;
            head = currentnode;
        }
        else if(pos <= lengthoflist(head))
        {
            node<Integer> prev = head;
            int count = 0;
            while (count != pos - 1) {
                prev = prev.next;
                count++;
            }
            currentnode.next = prev.next;
            prev.next = currentnode;
        }
        else if(pos == lengthoflist(head))
        {
            node<Integer> tail = head;
            while (tail.next != null) 
            {
                tail = tail.next;
            }
            tail.next = currentnode;
        }
        return head;
    }

    public static void main(String[] args) {
        node<Integer> head = takeinput1();
        printlist(head);
        node<Integer> head1 = insert(head, 2, 3);
        printlist(head1);
    }
}
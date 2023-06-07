package J_14_LinkedList;

import java.util.Scanner;

public class mergeSort_LL {
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
    
    public static node<Integer> midpoint(node<Integer> head)
    {
        node<Integer> slow = head, fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static node<Integer> merge(node<Integer>head1, node<Integer>head2)
    {
        if(head1 == null)
        {
            return head2;
        }
        if(head2 == null)
        {
            return head1;
        }

        node<Integer> head3 = null;
        node<Integer> tail = null;
        //For first node.
        if(head1.data <= head2.data)
        {
            head3 = head1;
            tail = head1;
            head1 = head1.next;
        }
        else{
            head3 = head2;
            tail = head2;
            head2 = head2.next;
        }
        //For rest nodes.
        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                tail.next = head1;
                tail = head1;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                tail = head2;
                head2 = head2.next;
            }
        }
        //For nodes which are left unhandled.
        if(head1 != null)
        {
            tail.next = head1;
        }
        if(head2 != null)
        {
            tail.next = head2;
        }
        return head3;
    }

    public static node<Integer> mergesort(node<Integer> head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        node<Integer> head1 = head;
        node<Integer> head2 = midpoint(head1).next;
        midpoint(head).next = null;

        head = merge(mergesort(head1), mergesort(head2));
        return head;
    }
    public static void main(String[] args) {
        node<Integer> head= takeinput();
        printlist(head);
        head = mergesort(head);
        printlist(head);
    }
}
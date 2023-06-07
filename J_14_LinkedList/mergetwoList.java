package J_14_LinkedList;

import java.util.Scanner;

public class mergetwoList {
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

    public static void main(String[] args) {
        System.out.print("Enter list 1: ");
        node<Integer> head1 = takeinput();
        System.out.print("Enter list 2: ");
        node<Integer> head2 = takeinput();
        printlist(head1);
        printlist(head2);
        head1 = merge(head1, head2);
        System.out.print("Merged list is: ");
        printlist(head1);
    }
}
package J_14_LinkedList;

import java.util.Scanner;

public class EvenAfterOdd {
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
    
    public static node<Integer> evenodd(node<Integer> head)
    {
        if (head==null || head.next==null)
        {
            return head;
        }
        node<Integer>oddhead = null, oddtail = null, evenhead = null, eventail = null;
        while(head != null)
        {
            if(head.data % 2 == 0)
            {
                if(evenhead == null)
                {
                    evenhead = head;
                    eventail = head;
                }
                else
                {
                    eventail.next = head;
                    eventail = eventail.next;
                }
            }
            else{
                if(oddhead == null)
                {
                    oddhead = head;
                    oddtail = head;
                }
                else
                {
                    oddtail.next = head;
                    oddtail = oddtail.next;
                }
            }
            head = head.next;
        }
        if(oddhead == null)
        {
            return evenhead;
        }
        else
        {
            oddtail.next = evenhead;
        }
        if(evenhead != null)
        {
            eventail.next = null;
        }
        return oddhead;
    }
    
    public static void main(String[] args) {
        node<Integer> head = takeinput();
        printlist(head);
        head = evenodd(head);
        printlist(head);
    }
}

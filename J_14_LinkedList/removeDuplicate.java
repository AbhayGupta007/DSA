package J_14_LinkedList;

import java.util.Scanner;

public class removeDuplicate {
    public static void printlist(node<Integer> head) {
        System.out.print("The link list is : ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static int lengthoflist(node<Integer> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static node<Integer> takeinput1() {
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

    public static node<Integer> removedup(node<Integer>head)
    {
        if (head==null || head.next==null)
        {
            return head;
        }
        node<Integer> newhead = head;
        while(newhead.next != null)
        {
            if(newhead.data.equals(newhead.next.data))
            {
                newhead.next = newhead.next.next;
            }
            else{
                newhead = newhead.next;
            }
        }
     	return head;
    }
    public static void main(String[] args) {
        node<Integer> head = takeinput1(); 
        printlist(head);
        node<Integer> newlist = removedup(head);
        printlist(newlist);
    }
}
/*
        node<Integer> uniqueNode=head.next,node=head;
        while (uniqueNode!=null)
        {
            if (!(uniqueNode.data).equals(node.data))
            {
                node.next=uniqueNode;
                node=node.next; 
            }
            uniqueNode=uniqueNode.next;
        }
        node.next=uniqueNode; */
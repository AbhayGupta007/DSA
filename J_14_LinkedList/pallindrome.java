package J_14_LinkedList;

import java.util.Scanner;

public class pallindrome {
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
    public static node<Integer> rev(node<Integer>head)
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
    public static boolean ispallindrome(node<Integer>head)
    {
        if(head == null || head.next == null)
		{
			return true;
		}
        node<Integer> reversednode = rev(head);
        while(head.next != null)
        {
            if(head.data == reversednode.data)
            {
                head = head.next;
                reversednode = reversednode.next;
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        node<Integer> head=takeinput1();
        System.out.println(ispallindrome(head));
    }
}

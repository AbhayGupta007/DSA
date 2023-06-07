package J_14_LinkedList;

import java.util.Scanner;

public class deletenode {
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
    public static node<Integer> delete(node<Integer>head, int pos)
    {
        if(pos == 0)
        {
            return head.next;
        }
        else if(pos < lengthoflist(head)-1)
        { 
            node<Integer> prevnode = head;
            node<Integer> nextnode = head;
            int count = 0;
            while(count != pos-1)
            {
                prevnode = prevnode.next;
                count++;
            }
            count = 0;
            while(count != pos+1)
            {
                nextnode = nextnode.next;
                count++;
            }
            prevnode.next = nextnode;
        }
        else if(pos >= lengthoflist(head) ){
            return head;
        }
        else if(pos == lengthoflist(head)-1){
            node<Integer> tail = head;
            int count = 0;
            while(count != pos-1)
            {
                tail = tail.next;
                count++;
            }
            tail.next = null;
        }
        return head;
    }
    public static void main(String[] args) {
        node<Integer> head = takeinput1();
        printlist(head);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter which node you want to delete: ");
        int n = s.nextInt();
        node<Integer> head1 = delete(head, n-1);
        printlist(head1);
        s.close();
    }
}
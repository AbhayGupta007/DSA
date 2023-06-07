package J_14_LinkedList;

import java.util.Scanner;

public class Delete_N_Node {
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
    public static node<Integer> skipMdeleteN(node<Integer> head, int M, int N) {
		node<Integer> temp = head;
        if(head == null || head.next == null)
        {
            return head;
        }
        if(M == 0)
        {
            return null;
        }
        if(N == 0)
        {
            return head;
        }
        while(temp != null)
        {
            for(int i = 0; i < M-1 && temp != null; i++)
            {
                temp = temp.next;
            }
            if(temp == null)
            {
                break;
            }
            for(int i = 0; i<N && temp.next != null; i++)
            {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
	}
    public static void main(String[] args) {
        node<Integer> head = takeinput();
        printlist(head);
        head = skipMdeleteN(head, 2 , 3);
        printlist(head);
    }
}
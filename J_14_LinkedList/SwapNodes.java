package J_14_LinkedList;

import java.util.Scanner;

public class SwapNodes {
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
    public static node<Integer>swap(node<Integer> head, int m, int n)
    {
        if(head == null || head.next == null || m == n)
        {
            return head;
        }
        int temp = 0;
        node<Integer> tempi = head;
        node<Integer> tempj = head;
        if(tempi != null && tempj != null)
        {
            for(int i = 0; i < m-1 ; i++)
            {
                tempi = tempi.next;
            }
            for(int j = 0; j < n -1; j++)
            {
                tempj = tempj.next;
            }
            temp = tempi.data;
            tempi.data = tempj.data;
            tempj.data = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        node<Integer> head = takeinput();
        printlist(head);
        head = swap(head, 2,3);
        printlist(head);
    }
}
// 1 2 3 4 5
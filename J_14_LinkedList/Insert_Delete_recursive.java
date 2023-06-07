package J_14_LinkedList;

import java.util.Scanner;

public class Insert_Delete_recursive {
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
    
    public static node<Integer> insert(node<Integer> head, int data, int n)
    {
        if(head == null && n > 0)
        {
            return head;
        }
        if(n == 0)
        {
            node<Integer> temp = new node<Integer>(data);
            temp.next = head;
            return temp;
        }
        else
        {
            head.next = insert(head.next, data, n-1);
            return head;
        }
    }
    
    public static node<Integer> delete(node<Integer>head, int n)
    {
        if(head == null)
        {
            return head;
        }
        if(n == 0)
        {
            return head.next;
        }
        else{
            head.next = delete(head.next, n-1);
        }
        return head;
    }
    
    
    public static void main(String[] args) {
        node<Integer> head = takeinput();
        node<Integer> list = insert(head,20, 3);
        printlist(list);
        node<Integer> originallist = delete(list, 3);
        printlist(originallist);
    }
}
package J_14_LinkedList;

import java.util.Scanner;

public class nextnumber 
{
    public static node<Integer> takeinput()
    {
        node<Integer> head = null;
        node<Integer> tail = null;
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while(num!= -1)
        {
            node<Integer> currnode = new node<Integer>(num);
            if(head == null)
            {
                head = currnode;
            }
            else{
                tail.next = currnode;
            }
            tail = currnode;
            num = s.nextInt();
        }
        s.close();
        return head;
    }
    public static void print(node<Integer> head){
        while(head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static node<Integer> reverse(node<Integer> head)
    {
        node<Integer> current = head;
        node<Integer> prev = null;
        while(current != null)
        {
            node<Integer> temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static node<Integer> nextnum(node<Integer> head){
        if(head == null || head.next == null)
        {
            return head;
        }
        head = reverse(head);
        node<Integer> temptail = head;
        temptail.data++;
        while(temptail.next != null)
        {
            if(temptail.data > 9)
            {
                temptail.data -= 10;
                temptail = temptail.next;
                temptail.data++;
            }
            else{
                break;
            }
        }
        if(temptail.next == null && temptail.data >9)
        {
            temptail.data -= 10;
            node<Integer> newnode = new node<Integer>(1);
            temptail.next = newnode;
        }
        head = reverse(head);
        return head;
    }
    public static void main(String[] args) 
    {
        node<Integer> head = takeinput();
        print(head);
        node<Integer> rev = nextnum(head);
        System.out.println();
        print(rev);
    }
    // System.out.println();
    // head = nextnum(head);
    // print(head);
}
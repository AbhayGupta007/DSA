package J_14_LinkedList;

import java.util.Scanner;

public class bubblesort {
    public static int lengthLL(node<Integer> head)
    {
        int count = 0;
        while(head != null)
        {
            head = head.next;
            count++;
        }
        return count;
    }
    public static node<Integer> takeinput()
    {
        Scanner s = new Scanner(System.in);
        node<Integer> head = null;
        node<Integer> tail = null;
        int a = s.nextInt();
        while(a != -1)
        {
            node<Integer> currentnode = new node<Integer>(a);
            if(head == null)
            {
                head = currentnode;
            }
            else
            {
                tail.next = currentnode;    
            }
            tail = currentnode;
            a = s.nextInt();
        }
        s.close();
        return head;
    }
    public static void print(node<Integer> head){
        if(head.next == null)
        {
            System.out.print(head.data+" ");
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static node<Integer> sort(node<Integer> head)
    {
        int count1 = lengthLL(head) - 1;
        while(count1 > 0)
        {
            node<Integer> tempnode = head;
            int count2 = 0;
            while(count2 < count1)
            {
                if(tempnode.data > tempnode.next.data)
                {
                    int temp = tempnode.data;
                    tempnode.data = tempnode.next.data;
                    tempnode.next.data = temp;
                }
                tempnode = tempnode.next;
                count2++;
            }
            count1--;
        }
        return head;
    }
    public static void main(String[] args) {
        node<Integer> head = takeinput();
        print(head);System.out.println();
        System.out.println("Length is : "+lengthLL(head));
        head = sort(head);
        print(head);
    }
}

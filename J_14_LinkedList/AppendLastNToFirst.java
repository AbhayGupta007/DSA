// You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.

package J_14_LinkedList;

import java.util.Scanner;

public class AppendLastNToFirst {
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
        while (head != null) 
        {
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

    public static node<Integer> rotate(node<Integer> head, int n) {
        if (n > lengthoflist(head) || lengthoflist(head) == 0 || n == 0) {
            return head;
        } else {
            n = lengthoflist(head) - n;
            node<Integer> temp = head;
            int count = 0;
            while (count != n) {
                temp = temp.next;
                count++;
            }
            count = 0;
            node<Integer> headtail = head;
            while (count != n - 1) {
                headtail = headtail.next;
                count++;
            }
            headtail.next = null;
            node<Integer> temptail = temp;
            while (temptail.next != null) {
                temptail = temptail.next;
            }
            temptail.next = head;
            return temp;
        }
    }

    public static void main(String[] args) {
        node<Integer> head = takeinput1();
        printlist(head);
        node<Integer> rotated = rotate(head, 2);
        printlist(rotated);
    }
}
package test;

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.HashMap;
import java.util.LinkedList;
import J_17_BinaryTree.BinaryTreeNode;

public class test {

    public static node<Integer> takeinput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        node<Integer> head = null;
        node<Integer> tail = null;
        while (n != -1) {
            node<Integer> currentnode = new node<Integer>(n);
            if (head == null) {
                head = currentnode;
            } else {
                tail.next = currentnode;
            }
            tail = currentnode;
            n = s.nextInt();
        }
        s.close();
        return head;
    }

    public static void print(node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int length_LL(node<Integer> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static node<Integer> insertnode(node<Integer> head, int pos, int data) {
        node<Integer> currnode = new node<Integer>(data);
        if (pos == 0) {
            currnode.next = head;
            head = currnode;
        } else if (pos < length_LL(head)) {
            int count = 1;
            node<Integer> tail = head;
            while (count != pos - 1) {
                tail = tail.next;
                count++;
            }
            currnode.next = tail.next;
            tail.next = currnode;
        } else if (pos == length_LL(head)) {
            node<Integer> tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = currnode;
        }
        return head;
    }

    public static void printrecur(node<Integer> head) {
        if (head == null) {
            return;
        } else if (head.next == null) {
            System.out.print(head.data + " ");
            return;
        } else {
            System.out.print(head.data + " ");
            printrecur(head.next);
        }
    }

    public static long dec_to_bin() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int num = s.nextInt();
        long dec = 0, remainder = 0;
        int i = 1;
        while (num != 0) {
            remainder = num % 2;
            dec = dec + (remainder * i);
            i = i * 10;
            num = num / 2;
        }
        s.close();
        return dec;
    }

    public static long bin_to_dec() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        long num = s.nextInt();
        long dec = 0, remainder = 0;
        int i = 1;
        while (num != 0) {
            remainder = num % 10;
            dec = dec + (remainder * i);
            i = i * 2;
            num = num / 10;
        }
        s.close();
        return dec;
    }

    public static node<Integer> mergelist(node<Integer> a, node<Integer> b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        node<Integer> head = null;
        node<Integer> tail = null;
        if (a.data >= b.data) {
            head = b;
            tail = b;
            b = b.next;
        } else {
            head = a;
            tail = a;
            a = a.next;
        }
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a != null) {
            tail.next = a;
        }
        if (b != null) {
            tail.next = b;
        }
        return head;
    }

    public static node<Integer> lastNfirst(node<Integer> head, int n) {
        node<Integer> newhead = null;
        node<Integer> tail = head;
        n = length_LL(newhead) - n;
        int count = 0;
        while (count < n) {
            tail = tail.next;
        }
        newhead = tail.next;
        tail.next = null;
        tail = newhead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        return newhead;
    }

    public static int[] stockspan(int arr[]) {
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Stack<Integer> stack = new Stack<Integer>();
            int j = 0;
            while (j < i) {
                stack.push(arr[j]);
                j++;
            }
            int count = 1;
            if (stack.isEmpty()) {
                arr1[i] = count;
            } else {
                while (!stack.isEmpty() && stack.peek() < arr[i]) {
                    stack.pop();
                    count++;
                }
                arr1[i] = count;
            }
        }
        return arr1;
    }

    public static void maxboundary() {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        while (cases != 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            char arr[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Enter at a[" + (i) + "][" + (j) + "]: ");
                    arr[i][j] = s.next().charAt(0);
                }
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == '#') {
                        count++;
                    }
                }
                if (max < count) {
                    max = count;
                }
            }
            System.out.print(max);
            cases--;
        }
        s.close();
    }

    public static node<Integer> reverselist(node<Integer> head) {
        if (head.next == null) {
            return head;
        }
        node<Integer> smallhead = reverselist(head.next);
        node<Integer> tail = head.next;
        tail.next = head;
        tail = tail.next;
        tail.next = null;
        return smallhead;
    }

    public static void printlevelwisebinarytreen(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingchildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingchildren.add(root);
        pendingchildren.add(null);
        while (!pendingchildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingchildren.poll();
            if (front == null) {
                System.out.println();
                pendingchildren.poll();
                pendingchildren.add(null);
            } else {
                System.out.print(front.data + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!!..");
    }
}
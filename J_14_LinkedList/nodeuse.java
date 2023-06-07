package J_14_LinkedList;

public class nodeuse {
    public static node<Integer> createlinklist()
    {
        node<Integer> n1 = new node<Integer>(10);
        node<Integer> n2 = new node<Integer>(20);
        node<Integer> n3 = new node<Integer>(30);
        node<Integer> n4 = new node<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
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
    public static void printlinklist(node<Integer> head)
    {
        node<Integer> temp = head;
        System.out.print("Linked list is: ");
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        node<Integer> n1 = new node<Integer>(100);
        System.out.println(n1.data + " " + n1.next);
 
        node<Integer> head = createlinklist();
        System.out.println(head.data+" " + head.next);
        System.out.println(head.next.data + " "+ head.next.next);

        node <Integer> a1 = new node<Integer>(15);
        a1.next = new node <Integer> (25);
        a1.next.next = new node<Integer>(35);
        a1.next.next.next = new node<Integer>(45);
        a1.next.next.next.next = new node<Integer>(55);

        printlinklist(head);
        printlinklist(head.next);
        printlinklist(a1);

        System.out.println("Length of the list is : " + lengthoflist(a1));
    }
}
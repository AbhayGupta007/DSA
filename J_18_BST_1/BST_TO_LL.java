package J_18_BST_1;
import J_14_LinkedList.node;
import J_17_BinaryTree.BinaryTreeNode;
public class BST_TO_LL {
    public static void printll(node<Integer> head)
    {
        if(head == null)
        {
            return;
        }
        System.out.print("The linked list is: ");
        while(head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static node<Integer> buildLL(BinaryTreeNode<Integer> root){
        if(root == null)
        {
            return null;
        }
        node<Integer> lhead = buildLL(root.left);    
        node<Integer> rhead = buildLL(root.right);
        node<Integer> rootnode = new node<Integer>(root.data);
        rootnode.next = rhead;
        if(lhead == null)
        {
            return rootnode;
        }
        else
        {
            node<Integer> ltail = lhead;
            while(ltail.next != null)
            {
                ltail = ltail.next;
            }
            ltail.next = rootnode;
            return lhead;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the elements in such a way that it follows BST property.");
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        node<Integer> head = buildLL(root);
        printll(head);
    }
}
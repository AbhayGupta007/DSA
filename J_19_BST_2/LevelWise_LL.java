package J_19_BST_2;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import J_17_BinaryTree.BinaryTreeNode;
import J_14_LinkedList.node;

public class LevelWise_LL {
    public static ArrayList<node<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		if(root == null )
		{
			return null;
		}
		ArrayList<node<Integer>> arr = new ArrayList<node<Integer>>();
		Queue<BinaryTreeNode<Integer>> pendingchildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingchildren.add(root);
		pendingchildren.add(null);
		while(!pendingchildren.isEmpty())
		{
			BinaryTreeNode<Integer>front = pendingchildren.poll();
			if(front != null)
			{
				node<Integer> head = new node<Integer>(front.data);
				node<Integer> tail = head;
				arr.add(head);
				if(front.left != null)
				{
					pendingchildren.add(front.left);
				}
				if(front.right != null)
				{
					pendingchildren.add(front.right);
				}
				front = pendingchildren.poll();
				while(front != null)
				{
					node<Integer> currnode = new node<Integer>(front.data);
					tail.next = currnode;
					tail = currnode;
					if(front.left != null)
					{
						pendingchildren.add(front.left);
					}
					if(front.right != null)
					{
						pendingchildren.add(front.right);
					}
					front = pendingchildren.poll();
				}
				pendingchildren.add(null);
			}
		}
		return arr;
	}
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        BinaryTreeNode.printlevelwisebetter(root);
        ArrayList<node<Integer>> arr = constructLinkedListForEachLevel(root);
        for(int i = 0; i < arr.size(); i++)
        {
            node<Integer> head = arr.get(i);
            while(head != null)
            {
                System.out.print(head.data+" ");
                head = head.next;
            }
            System.out.println();
        }
    }
}
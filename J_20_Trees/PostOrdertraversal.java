package J_20_Trees;

public class PostOrdertraversal {
    public static void printPostOrder(GenericTree<Integer> root){
		if(root == null)
		{
			return ;
		}
		for(GenericTree<Integer> i : root.children)
		{
			printPostOrder(i);
		}
		System.out.print(root.data+" ");
	}
}

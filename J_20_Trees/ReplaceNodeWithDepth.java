package J_20_Trees;

public class ReplaceNodeWithDepth {
    public static void replaceWithDepthValue(GenericTree<Integer> root){
		if(root == null)
		{
			return ;
		}
		int depth = 0;
		helper(root, depth);
	}
	public static void helper(GenericTree<Integer> root, int depth)
	{
		if(root == null)
		{
			return;
		}
		root.data = depth;
		depth++;
		for(GenericTree<Integer> child : root.children)
		{
			helper(child, depth);
		}
	}
}

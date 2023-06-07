package J_20_Trees;

public class NodeHavingMaxSum {
    public static int max = Integer.MIN_VALUE;
	public static GenericTree<Integer> ans;
	public static GenericTree<Integer> maxSumNode(GenericTree<Integer> root){
		help(root);
		return ans;
	}
	public static void help(GenericTree<Integer> root)
	{
		if(root == null)
		{
			return ;
		}
		int result = 0;
		int childsum = 0;
		for(GenericTree<Integer> child : root.children)
		{
			childsum += child.data;
		}
		result = root.data + childsum;
		if(max < result)
		{
			max = result;
			ans = root;
		}
		for(GenericTree<Integer> child : root.children)
		{
			help(child);
		}
	}
}

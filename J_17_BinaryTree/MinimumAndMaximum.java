package J_17_BinaryTree;

class Pair<T,U>{
    T minimum;
    U maximum;
    public Pair(T min, U max){
        this.minimum = min;
        this.maximum = max;
    }
}
public class MinimumAndMaximum {
    public static int minNumber(BinaryTreeNode<Integer> root){
		if(root == null)
		{
			return Integer.MAX_VALUE;
		}	
		int leftmin = minNumber(root.left); 
		int rightmin = minNumber(root.right); 
		int min = Math.min(root.data, Math.min(leftmin, rightmin));
		return min;
	}
	public static int maxnumber(BinaryTreeNode<Integer> root) {
		if(root == null)
		{
			return Integer.MIN_VALUE;
		}
		int leftmax = maxnumber(root.left);
		int rightmax = maxnumber(root.right);
		int max = Math.max(root.data, Math.max(leftmax, rightmax));
		return max;
	}
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
		int Min = minNumber(root);
		int Max = maxnumber(root);
		Pair<Integer,Integer> ans = new Pair<Integer,Integer>(Min,Max);
		return ans;
	}
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        BinaryTreeNode.printlevelwisedetailed(root);
        Pair<Integer,Integer> ans = getMinAndMax(root);
        System.out.print(ans.maximum+" "+ans.minimum);
    }
}

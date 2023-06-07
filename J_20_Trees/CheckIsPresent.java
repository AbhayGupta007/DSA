package J_20_Trees;

public class CheckIsPresent {
    public static boolean checkIfContainsX(GenericTree<Integer> root, int x){
		if(root == null)
		{
			return false;
		}
		if(root.data == x)
		{
			return true;
		}
		for(GenericTree<Integer> child : root.children)
		{
			boolean ispresent = checkIfContainsX(child, x);
			if(ispresent)
			{
				return true;
			}
		}
		return false;
	}
}
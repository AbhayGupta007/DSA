package J_20_Trees;
import java.util.LinkedList;
import java.util.Queue;

public class NumberofGreaterNodes {
    public static int numNodeGreater(GenericTree<Integer> root,int x){
		if(root == null)
		{
			return 0;
		}
		int count = 0;
		Queue<GenericTree<Integer>> q = new LinkedList<>();
		q.add(root);
		Queue<GenericTree<Integer>> cq = new LinkedList<>();
		while(!q.isEmpty())
		{
			root = q.poll();
			if(root.data > x)
			{
				count++;
			}
			for(GenericTree<Integer> child : root.children)
			{
				cq.add(child);
			}
			if (q.size() == 0) {
                q = cq;
                cq = new LinkedList<>();
			}
		}
		return count;
	}
}

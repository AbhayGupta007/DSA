package J_20_Trees;

public class NumberOfNodes {
    public static int numofnodes(GenericTree<Integer> root){
        if(root == null)
        {
            return 0;
        }
        else{
            int count = 1;
            for(int i = 0; i < root.children.size(); i++)
            {
                int childcount = numofnodes(root.children.get(i));
                count += childcount;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        
    }
}

package J_17_BinaryTree;

public class TakeInput {
    public static void print(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+":");
        if(root.left != null)
        {
            System.out.print(" L"+root.left.data);
        }
        if(root.right != null)
        {
            System.out.print(" R"+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }
    /*public static BinaryTreeNode<Integer> takeinput(boolean isroot, int parentdata, boolean isleft)
    {
        // Method-1
        if(isroot)
        {
            System.out.print("Enter root data: ");
        }
        else{
            if(isleft)
            {
                System.out.print("Enter left child of "+ parentdata+ ": ");
            }
            else{
                System.out.print("Enter right child of "+ parentdata+ ": ");
            }
        }
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        
        if(data == -1)
        {
            // s.close();
            return null;
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        root.left = takeinput(false, data, true);
        root.right = takeinput(false, data, false);

        // s.close();
        return root;
    }
    public static BinaryTreeNode<Integer> takeinput()
    {
        // Method-2
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        int data = s.nextInt();
        if(data == -1)
        {
            // s.close();
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        root.left = takeinput();
        root.right = takeinput();
        // s.close();
        return root;
    }*/
    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        // BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
        // BinaryTreeNode<Integer> rootright = new BinaryTreeNode<Integer>(3);
        // root.left = rootleft;
        // root.right = rootright;
        // BinaryTreeNode<Integer> tworight = new BinaryTreeNode<Integer>(4);
        // BinaryTreeNode<Integer> threeleft = new BinaryTreeNode<Integer>(5);
        // rootright.left = threeleft;
        // rootleft.right  = tworight;
        // print(root);System.out.println();
        // print(root);

        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinput(true, 0 , true);
        print(root);
    }
}
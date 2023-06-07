package J_20_Trees;

class Pair<T> {
    T first;
    T second;

    Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
}
public class SecondLarger {
    public static GenericTree<Integer> findSecondLargest(GenericTree<Integer> root) {

        return findSecondLargestT(root).second;

    }
    public static Pair<GenericTree<Integer>> findSecondLargestT(GenericTree<Integer> root) {
        Pair<GenericTree<Integer>> output;
        if (root == null) 
        {
            output = new Pair<GenericTree<Integer>>(null, null);
            return output;
        }
        output = new Pair<GenericTree<Integer>>(root, null);
        for (GenericTree<Integer> child : root.children) 
        {
            Pair<GenericTree<Integer>> childPair = findSecondLargestT(child);
            if (childPair.first.data > output.first.data) 
            {
                if (childPair.second == null || childPair.second.data < output.first.data) 
                {
                    output.second = output.first;
                    output.first = childPair.first;
                } 
                else 
                {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
            } 
            else if (childPair.first.data.equals(output.first.data) && childPair.second != null) 
            {
                output.second = childPair.second;
            } 
            else if (output.first.data != childPair.first.data && (output.second == null || childPair.first.data > output.second.data)) 
            {
                output.second = childPair.first;
            }
        }
        return output;
    }
    public static void main(String[] args) {

    }
}
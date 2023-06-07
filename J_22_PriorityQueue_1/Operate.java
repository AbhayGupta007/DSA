package J_22_PriorityQueue_1;

public class Operate {
    public static void main(String[] args) {
        PQ_Min_Heap<Integer> list = new PQ_Min_Heap<>();
        for(int i =1; i < 6; i++)
        {
            list.insert(i, i);
        }
        list.printheap();
        list.removemin();
        System.out.println();
        list.printheap();
    }
}

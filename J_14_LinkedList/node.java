package J_14_LinkedList;

class DoubleNode{
    node<Integer> head;
    node<Integer> tail;
    DoubleNode(node<Integer> head, node<Integer> tail)
    {
        this.head = head;
        this.tail = tail;
    }
    DoubleNode()
    {

    }
}

public class node<T>{
    public T data;
    public node<T> next;
    public node(T data)
    {
        this.data = data;
    }
}
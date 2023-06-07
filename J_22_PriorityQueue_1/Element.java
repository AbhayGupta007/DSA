package J_22_PriorityQueue_1;

public class Element<T>{
    public T value; 
    public int priority;
    
    public Element(T value, int priority){
        this.value = value;
        this.priority = priority;
    }
}
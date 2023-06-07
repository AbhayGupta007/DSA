package J_7_OOPS.Generics.Pair;

public class Pair <T> {
    private T first;
    private T second;

    public Pair()
    {
        
    }

    public Pair(T first, T second)
    {
        this.first = first; 
        this.second = second;
    }

    public T getfirst()
    {
        return first;
    }

    public void setfirst(T first)
    {
        this.first = first;
    }

    public T getsecond()
    {
        return second;
    }

    public void setsecond(T second)
    {
        this.second = second;
    }
}
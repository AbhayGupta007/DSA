package J_7_OOPS.Generics.Pair;

public class pair2<T,S> {
    private T first;
    private S second;

    public pair2(T first, S second)
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

    public S getsecond()
    {
        return second;
    }

    public void setsecond(S second)
    {
        this.second = second;
    }
}

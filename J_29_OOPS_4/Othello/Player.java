package J_29_OOPS_4.Othello;


public class Player {
    private String name;
    private int symbol;

    public Player(String name, int symbol){
        setname(name);
        setsymbol(symbol);
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void setsymbol(int symbol)
    {
        this.symbol = symbol;
    }
    public String getname()
    {
        return name;
    }
    public int getsymbol()
    {
        return symbol;
    }
}
package J_29_OOPS_4.Tic_Tac_Toe;

public class player {
    private String name;
    private char symbol;

    public player(String name, char symbol){
        setname(name);
        setsymbol(symbol);
    }

    private void setname(String name){
        this.name = name;
    }

    public void setsymbol(char symbol){
        this.symbol = symbol;
    }

    public String getname(){
        return this.name;
    }

    public char getsymbol(){
        return this.symbol;
    }
}
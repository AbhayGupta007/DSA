package J_29_OOPS_4.Tic_Tac_Toe;

public class Board {
    private char board[][];
    private int boardsize = 3;
    public static int count = 0; 
    private char p1symbol, p2symbol;
    private static final char EMPTY = ' ';
    
    public Board(char p1symbol, char p2symbol){
        board = new char[boardsize][boardsize];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0 ; j < 3; j++)
            {
                board[i][j] = EMPTY;
            }
        }
        this.p1symbol = p1symbol;
        this.p2symbol = p2symbol;
    }
    public Boolean move(char symbol, int x, int y)
    {
        if(x < 3 && y<3)
        {
            if(board[x][y] == ' ')
            {
                board[x][y] = symbol;
                count++;
                return true;
            }
            else
            {
                System.out.println("Position already taken please choose again.");
                return false;
            }
        }
        else
        {
            System.out.println("Wrong co-ordinates");
            return false;
        }
    }
    public void printgrid()
    {
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print("|  "+board[i][j]+"  |");
            }
            System.out.println();
        }
    }

    public Boolean checkforwin(){
        if(board[0][0] == p1symbol && board[0][1] == p1symbol && board[0][2] == p1symbol)
        {
            return true;
        }
        else if(board[1][0] == p1symbol && board[1][1] == p1symbol && board[1][2] == p1symbol)
        {
            return true;
        }
        else if(board[2][0] == p1symbol && board[2][1] == p1symbol && board[2][2] == p1symbol)
        {
            return true;
        }else if(board[0][0] == p1symbol && board[1][0] == p1symbol && board[2][0] == p1symbol)
        {
            return true;
        }
        else if(board[0][1] == p1symbol && board[1][1] == p1symbol && board[2][1] == p1symbol)
        {
            return true;
        }
        else if(board[0][2] == p1symbol && board[1][2] == p1symbol && board[2][2] == p1symbol)
        {
            return true;
        }
        else if(board[0][0] == p1symbol && board[1][1] == p1symbol && board[2][2] == p1symbol)
        {
            return true;
        }
        else if(board[0][2] == p1symbol && board[1][1] == p1symbol && board[2][0] == p1symbol)
        {
            return true;
        }
        else if(board[0][0] == p2symbol && board[0][1] == p2symbol && board[0][2] == p2symbol)
        {
            return true;
        }
        else if(board[1][0] == p2symbol && board[1][1] == p2symbol && board[1][2] == p2symbol)
        {
            return true;
        }
        else if(board[2][0] == p2symbol && board[2][1] == p2symbol && board[2][2] == p2symbol)
        {
            return true;
        }else if(board[0][0] == p2symbol && board[1][0] == p2symbol && board[2][0] == p2symbol)
        {
            return true;
        }
        else if(board[0][1] == p2symbol && board[1][1] == p2symbol && board[2][1] == p2symbol)
        {
            return true;
        }
        else if(board[0][2] == p2symbol && board[1][2] == p2symbol && board[2][2] == p2symbol)
        {
            return true;
        }
        else if(board[0][0] == p2symbol && board[1][1] == p2symbol && board[2][2] == p2symbol)
        {
            return true;
        }
        else if(board[0][2] == p2symbol && board[1][1] == p2symbol && board[2][0] == p2symbol)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
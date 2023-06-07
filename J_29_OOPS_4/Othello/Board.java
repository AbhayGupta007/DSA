package J_29_OOPS_4.Othello;

public class Board {
    public int board[][];
    private int boardsize = 8;
    public static int count = 4;
    private int p1symbol, p2symbol;
    private static final int EMPTY = 0;

    public Board(int p1symbol, int p2symbol){
        board = new int[boardsize][boardsize];
        for(int i = 0; i<8; i++){
            for(int j = 0; j< 8; j++)
            {
                board[i][j] = EMPTY;
            }
        }
        this.p1symbol = p1symbol;
        this.p2symbol = p2symbol;

        board[3][3] = p1symbol;
        board[3][4] = p2symbol;
        board[4][3] = p2symbol;
        board[4][4] = p1symbol;
    }
    public void printboard(){
        for(int i = 0; i< 8; i++)
        {
            for(int j = 0; j< 8; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}

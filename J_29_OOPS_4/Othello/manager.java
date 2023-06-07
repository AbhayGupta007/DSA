// This game completed = false;

package J_29_OOPS_4.Othello;

import java.util.Scanner;

public class manager {
    private Player player1, player2;
    private Board board;
    public static void main(String[] args) {
        manager t = new manager();
        t.startgame();
    }
    public void startgame()
    {
        // Take player input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of Player 1: ");
        String name1 = s.nextLine();
        player1 = new Player(name1, 1);
        System.out.println("Enter the name of Player 2: ");
        String name2 = s.nextLine();
        player2 = new Player(name2, 2);
        System.out.println( "Symbol of " + player1.getname() + " is " + player1.getsymbol()+"\nSymbol of "+ player2.getname() + " is "+player2.getsymbol());
        // Create the board
        board = new Board(player1.getsymbol(), player2.getsymbol());
        // Start the game
        int n = 32;
        boolean p1turn = true;
        while(n >= 0)
        {
            if(p1turn)
            {
                System.out.print("Enter the coordinates "+player1.getname()+": ");
            }
            else
            {
                System.out.print("Enter the coordinates "+player2.getname()+": ");
            }
            int x = s.nextInt();
            int y = s.nextInt();
            if(p1turn)
            {
                System.out.println(move(player1.getsymbol(), x, y));
                p1turn = false;
                board.printboard();
            }
            else{
                System.out.println(move(player2.getsymbol(), x, y));
                p1turn = true;
                board.printboard();
            }
            n--;
        }
    }
    public Boolean move(int symbol, int x, int y)
    {
        if(x > 7 || x < 0 || y > 7 || y < 0)
        {
            return false;
        }
        if(board.board[x][y] != 0)
        {
            return false;
        }
        int num = 3-symbol;
        int flag = 0;
        // Moving left.
        if(y-1 >= 0  && board.board[x][y-1] == num)
        {
            int temp = y;
            while(board.board[x][temp] != symbol)
            {
                temp--;
            }
            while(temp != y)
            {
                board.board[x][temp] = symbol;
                temp++;
            }
            board.board[x][y] = symbol;
            flag = 1;
        }
        // Moving left diagonal
        if(x-1 >= 0 && y-1 >=0 && board.board[x][y-1] == num)
        {
            int temp1 = x;
            int temp2 = y;
            while(board.board[temp1][temp2] != symbol)
            {
                temp1--; temp2--;
            }
            while(temp1 != x && temp2 != y)
            {
                board.board[temp1][temp2] = symbol;
                temp1++; temp2++;
            }
            board.board[x][y] = symbol;
            flag = 1;
        }
        // Moving up.
        if(x-1 >= 0 && board.board[x-1][y] == num)
        {
            int temp = x;
            while(board.board[temp][y] != symbol)
            {
                temp--;
            }
            while(temp != x)
            {
                board.board[temp][y] = symbol;
                temp++;
            }
            flag = 1;
            board.board[x][y] = symbol;
        }
        // Moving right diagonal.
        if(x-1>=0 && y+1<=7 && board.board[x-1][y+1] == num)
        {
            int temp1 = x;
            int temp2 = y;
            while(board.board[temp1][temp2] != symbol)
            {
                temp1--; temp2++;
            }
            while(temp1 != x && temp2 != y)
            {
                board.board[temp1][temp2] = symbol;
                temp1++; temp2--;
            }
            board.board[x][y] = symbol;
            flag = 1;
        }
        // Moving right.
        if(y+1 <= 7 && board.board[x][y+1] == num)
        {
            int temp = y;
            while(board.board[x][temp] != symbol)
            {
                temp++;
            }
            while(temp != y)
            {
                board.board[x][temp] = symbol;
                temp++;
            }
            board.board[x][y] = symbol;
            flag = 1;
        }
        // Moving right diagonal lower.
        if(x+1 <= 7 && y+1 <= 7 && board.board[x+1][y+1] == num)
        {
            int temp1 = x;
            int temp2 = y;
            while(board.board[temp1][temp2] != symbol)
            {
                temp1++; temp2++;
            }
            while(temp1 != x && temp2 != y)
            {
                board.board[temp1][temp2] = symbol;
                temp1--; temp2--;
            }
            flag = 1;
            board.board[x][y] = symbol;
        }
        // Moving down.
        if(x+1 <= 7 && board.board[x+1][y] == num)
        {
            int temp = x;
            while(board.board[temp][y] != symbol)
            {
                temp++;
            }
            while(temp != x)
            {
                board.board[temp][y] = symbol;
                temp--;
            }
            board.board[x][y] = symbol;
            flag = 1;
        }
        // Moving left diagonal lower.
        if(x+1 <= 7 && y-1 >= 0 && board.board[x+1][y-1] == num)
        {
            int temp1 = x;
            int temp2 = y;
            while(board.board[temp1][temp2] != symbol)
            {
                temp1++; temp2--;
            }
            while(temp1 != x && temp2 != y)
            {
                board.board[temp1][temp2] = symbol;
                temp1--;temp2++;
            }
            board.board[x][y] = symbol;
            flag = 1;
        }
        return flag == 1;
    }
}
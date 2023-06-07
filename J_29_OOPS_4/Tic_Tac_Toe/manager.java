package J_29_OOPS_4.Tic_Tac_Toe;

import java.util.Scanner;

public class manager {
    private player player1, player2;
    private Board board;

    public static void main(String[] args) {
        manager t = new manager();
        t.startgame();
    }

    public void startgame(){
        // Take player input.
        Scanner s = new Scanner(System.in);
        player1 = takeplayerinput(1);
        player2 = takeplayerinput(2);
        while(player2.getsymbol() == player1.getsymbol())
        {
            System.out.print("Symbol already taken, please re-enter your symbol: ");
            player2.setsymbol(s.nextLine().charAt(0));
        }
        
        // Create the board.
        board = new Board(player1.getsymbol(), player2.getsymbol());
        
        // Play the game.
        boolean p1_turn = true;
        while(board.count < 9)
        {
            if(p1_turn)
            {
                System.out.println("Player 1 - "+ player1.getname()+ "'s turn");
                System.out.print("Enter x: ");
                int x = s.nextInt();
                System.out.print("Enter y: ");
                int y = s.nextInt();
                Boolean happen = board.move(player1.getsymbol(), x, y);
                if(happen)
                {
                    p1_turn = false;
                    board.printgrid();
                    if(board.checkforwin())
                    {
                        break;
                    }
                }
            }
            else
            {   
                System.out.println("Player 2 - "+ player2.getname()+ "'s turn");
                System.out.print("Enter x: ");
                int x = s.nextInt();
                System.out.print("Enter y: ");
                int y = s.nextInt();
                boolean happen = board.move(player2.getsymbol(), x, y);
                if(happen){
                    p1_turn = true;
                    board.printgrid();
                    if(board.checkforwin())
                    {
                        break;
                    }
                }
            }
        }
        if(board.count == 9 && board.checkforwin() == false)
        {
            System.out.println("It's a Draw.");
        }
        else if(p1_turn)
        {
            System.out.println(player2.getname()+" wins.");
        }
        else{
            System.out.println(player1.getname()+" wins.");
        }
    }

    private player takeplayerinput(int num){
        Scanner s = new Scanner(System.in);        
        
        System.out.print("Enter Player "+ num +" name: ");
        String name = s.nextLine();
        System.out.print("Enter Player "+ num +" symbol: ");
        char sym = s.nextLine().charAt(0);
        player p = new player(name, sym);
        return p;
    }
}
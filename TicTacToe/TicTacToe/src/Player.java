import java.util.Scanner;

public class Player{
    int digit;
    public Player(String symbol){
        if(symbol.equals("X")){
            digit = 1;
        }
        else if(symbol.equals("O")){
            digit = -1;
        }
    }
    public void addcircle(IBoard board){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Which square?");
        String square = myObj.nextLine();  // Read user input
        myObj.close();
        int intsquare = Integer.parseInt(square);
        board.squares[intsquare] = digit;
    }
}

public class Game{
    public static void main(String[] args) throws Exception {
        IBoard myBoard = new Board();
        Player PlayerX =  new Player("X");
        Player PlayerO = new Player("O");
        myBoard.reset();
        while(true){
            PlayerX.addcircle(myBoard);
            myBoard.show();
            if(myBoard.calc_win() == true){
                break;
            }
            PlayerO.addcircle(myBoard);
            myBoard.show();
            if(myBoard.calc_win() == true){
                break;
            }
        }
    }
}

public class Board implements IBoard{
    int[] squares = new int[9];
    int line;
    public Board(){
        squares = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    }
    public void reset(){
        squares = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};

    }
    public boolean calc_win(){
        for (int i = 0; i< 8; i++){
            switch(i){
            case 0:
                line = squares[0] + squares[1] + squares[2];
                break;
            case 1:
                line = squares[3] + squares[4] + squares[5];
                break;
            case 2:
                line = squares[6] + squares[7] + squares[8];
                break;
            case 3:
                line = squares[0] + squares[3] + squares[6];
                break;
            case 4:
                line = squares[1] + squares[4] + squares[7];
                break;
            case 5:
                line = squares[2] + squares[5] + squares[8];
                break;
            case 6:
                line = squares[0] + squares[4] + squares[8];
                break;
            case 7:
                line = squares[2] + squares[4] + squares[6];
                break;
            }
            //For X winner
            if (line == 3) {
                System.out.println("X wins");
                return true;
            }
             
            // For O winner
            else if (line == -3){
                System.out.println("O wins");
                return true;
            }
            }
        return false;
        }    
    public void show(){
        for(int i = 0; i<9; i++){
            System.out.println(squares[i] + "|");
            if((i + 1)%3 == 0){
                System.out.println("\n");
            }
        }
    }
}


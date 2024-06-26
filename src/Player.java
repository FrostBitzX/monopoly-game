//StudentID: 6510450879
//Name: Mr.Yossawaj Bonsrithananon

public class  Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;



    public Player(String name, Die[] dice, Board board) {
        this.name = name;
        this.dice = dice;
        this.board = board;
        this.piece = new Piece(board.initSquare());

        for(int i=0; i<MGame.MAX_DICE; i++){ //init dice to roll
            dice[i] = new Die();
        }
    }

    public String getName(){
        return name;
    }
    public void takeTurn(){
        System.out.println(name + " takeTurn");

        int rollTotal = 0;
        for(int i=0; i<MGame.MAX_DICE; i++){
            dice[i].roll();
            rollTotal += dice[i].getFaceValue();
        }
        System.out.println("Player " + name + " get " + rollTotal + " score!");
        showLoc(rollTotal);
        Square goNewLocation = board.getSquare(this.piece.getLocation(), rollTotal);
        piece.setLocation(goNewLocation);


    }
    private void showLoc(int score) {
        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, score);
        System.out.println(name + " moved from " + oldLocation.getLocation() + "(" + oldLocation.getName() + ")" + " to " + newLocation.getLocation() + "(" + newLocation.getName() + ")\n");
    }
}

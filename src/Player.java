//StudentID: 6510450879
//Name: Mr.Yossawaj Bonsrithananon

import java.util.Objects;
import java.util.Scanner;
public class  Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;
    private float money;
    private final Scanner scanner = new Scanner(System.in);;



    public Player(String name, Die[] dice, Board board, float money) {
        this.name = name;
        this.dice = dice;
        this.money = money;
        this.board = board;
        this.piece = new Piece(board.initSquare());

        for(int i=0; i<MGame.MAX_DICE; i++){ //init dice to roll
            dice[i] = new Die();
        }
    }

    public String getName(){
        return name;
    }

    public float getMoney(){
        return money;
    }
    public void takeTurn(){
        System.out.println("----------------------------------");
        System.out.println(" \n" + name + " takeTurn");

        int rollTotal = 0;
        for(int i=0; i<MGame.MAX_DICE; i++){
            dice[i].roll();
            rollTotal += dice[i].getFaceValue();
        }
        System.out.println("Player " + name + " get " + rollTotal + " score!");
        showLoc(rollTotal);
        Square goNewLocation = board.getSquare(this.piece.getLocation(), rollTotal);
        piece.setLocation(goNewLocation);

        Square location = piece.getLocation();

        if(location.getPrice() != -1){
            System.out.println("Do you want to buy this place? (" + location.getPrice() + ")\n(y/n:)");
            String wantToBuy = scanner.nextLine();
            while (true){
                if(Objects.equals(wantToBuy, "y")){
                    System.out.println("You bought " + location.getName());
                    this.money -= location.getPrice();
                    System.out.println("Your balance is " + getMoney());
                    break;
                } else if (Objects.equals(wantToBuy, "n")) {
                    System.out.println("You not bought " + location.getName());
                    break;
                } else {
                    System.out.println("Invalid input. Please enter correct answer (y/n).");
                }
            }
        }

    }
    private void showLoc(int score) {
        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, score);
        System.out.println(name + " moved from " + oldLocation.getLocation() + "(" + oldLocation.getName() + ")" + " to " + newLocation.getLocation() + "(" + newLocation.getName() + ")\n");
    }
}

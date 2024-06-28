//StudentID: 6510450879
//Name: Mr.Yossawaj Bonsrithananon

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MGame {
    private int playerTotal = 0;
    public static final int ROUNDS_TOTAL = 20;
    public static final int PLAYERS_FULL = 8;
    public static final int MAX_DICE = 2;
    private int roundCnt;
    private Die[] dice;
    private Board board;
    private List<Player> players;
    private String name;


    public MGame(){

        this.board = new Board();
        this.dice = new Die[MAX_DICE];
        this.players = new ArrayList<Player> (playerTotal);

        Scanner scanner = new Scanner(System.in);

        while(playerTotal < 2 || playerTotal > PLAYERS_FULL){
            System.out.print("How many player? (2-8): ");
            playerTotal = scanner.nextInt();
            if(playerTotal >= 2 && playerTotal <= 8){
                scanner.nextLine();
            }
            else{
                System.out.println("Invalid input. Please enter a number of players between 2 and 8.");
            }
        }
        for(int i=0; i<PLAYERS_FULL; i++){
            if(i >= playerTotal){
                return;
            }
            System.out.printf("Enter Player %d name: ", i+1);
            String playerName = scanner.nextLine();
            Player player = new Player(playerName, dice ,board, 100);
            players.add(player);
        }
        scanner.close();
    }
    public int getRoundCnt(){
        return roundCnt;
    }
    public void playGame(){
        System.out.println("\n========Welcome to Monopoly Game Kasetsart EDITION!========\n");
        for(roundCnt=0; roundCnt<ROUNDS_TOTAL; roundCnt++){
            if(players.size() == 1){
                break;
            }
            playRound();
        }
        System.out.println("Game Over");
        System.out.println("----------------------------------");
    }
    public void playRound(){
        System.out.println("----------------------------------");
        System.out.println("Round" + roundCnt);
        for(Player player : players){
            if(players.size() == 1){
                return;
            }
            if(player.getMoney() <= 0){
                players.remove(player);
            }else {
                player.takeTurn();
            }
        }
    }
}

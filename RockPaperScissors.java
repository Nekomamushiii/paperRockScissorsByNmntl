package homeWork;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final String ROCK = "Rock";
        final String PAPER = "Paper";
        final String SCISSORS = "Scissors";

        int comRandomNum = random.nextInt(3);
        System.out.print("Choose [r]ock,[p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();

        if(playerMove.equals("r") || playerMove.equals("rock"))
            playerMove=ROCK;
        else if(playerMove.equals("p") || playerMove.equals("paper"))
            playerMove=PAPER;
        else if(playerMove.equals("s") || playerMove.equals("scissors"))
            playerMove=SCISSORS;
        else{
            System.out.println("Invalid input.Try again...");
            return;
        }
        String comMove ="";
        switch (comRandomNum){
            case 0: comMove=ROCK;break;
            case 1: comMove=PAPER;break;
            case 2: comMove=SCISSORS;break;

        }

System.out.printf("Computer choose %s.%n",comMove);
        if(playerMove.equals(ROCK) && comMove.equals(SCISSORS) || playerMove.equals(SCISSORS) && comMove.equals(PAPER) || playerMove.equals(PAPER) && comMove.equals(ROCK))
            System.out.println("You win");
        else if(playerMove.equals(ROCK) && comMove.equals(ROCK) || playerMove.equals(PAPER) && comMove.equals(PAPER) || playerMove.equals(SCISSORS) && comMove.equals(SCISSORS))
            System.out.println("This game was a draw");
        else
            System.out.println("You lose");


    }
}

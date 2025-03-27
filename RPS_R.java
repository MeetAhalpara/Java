import java.security.SecureRandom;
import java.util.Scanner;

public class RPS_R {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] rps1 = {"rock", "paper", "scissors"};
        SecureRandom random = new SecureRandom();
        String player2choice;

        do {
            String player1choice = rps1[random.nextInt(rps1.length)];

            while (true) {

                System.out.print("For Player 2 enter Rock, Paper, Scissors:");
                player2choice = scn.next();
                if (scn.hasNextLine()) {
                    if (player2choice.equalsIgnoreCase("R") || player2choice.equalsIgnoreCase("ROCK")) {
                        player2choice = "rock";
                        System.out.println("Player 1 has got " + player1choice + ".");
                        System.out.println("Player 2 has got Rock.");
                        break;
                    } else if (player2choice.equalsIgnoreCase("P") || player2choice.equalsIgnoreCase("PAPER")) {
                        player2choice = "paper";
                        System.out.println("Player 1 has got " + player1choice + ".");
                        System.out.println("Player 2 has got Paper.");
                        break;
                    } else if (player2choice.equalsIgnoreCase("S") || player2choice.equalsIgnoreCase("SCISSORS")) {
                        player2choice = "scissors";
                        System.out.println("Player 1 has got " + player1choice + ".");
                        System.out.println("Player 2 has got Scissors.");
                        break;
                    } else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            if (player1choice.equals(player2choice)) {
                System.out.println("That's a tie, both have chosen the same thing.");
            } else if ((player1choice.equals("rock") && player2choice.equals("scissors")) ||
                    (player1choice.equals("paper") && player2choice.equals("rock")) ||
                    (player1choice.equals("scissors") && player2choice.equals("paper"))) {
                System.out.println("The winner is Player 1.");
            } else {
                System.out.println("The winner is Player 2.");
            }

            String userInput;
            while (true) {
                System.out.print("do you wanna continue playing (Enter Y/YES to continue, or N/NO to exit.): ");
                userInput = scn.next();
                scn.nextLine();
                if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
                    System.out.print("Thank you for playing again.\n");
                    break;
                } else if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) {
                    System.out.print("Thank you for playing... program exit!!!");
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            }
            if(userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);
    }
}
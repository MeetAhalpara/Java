import java.security.SecureRandom;
import java.util.Scanner;

public class RPS_MR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
//        int player1choice = random.nextInt(3);
        
        String[] rps1 = {"Player 1 has got Rock.", "Player 1 has got Paper.", "Player 1 has got Scissors."};
        String[] rps2 = {"Player 2 has got Rock.", "Player 2 has got Paper.", "Player 2 has got Scissors."};

        int player2choice;
        String choice;
        boolean runProgram;
        boolean playAgain = false;
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
        do {
            int player1choice = (int) (Math.random() * 3);

            System.out.print("For Player 2 enter number between 1 - 3: ");

            if (scn.hasNextInt()) {
                player2choice = scn.nextInt() - 1;
                if (player2choice >= 0 && player2choice <= 2) {
//                    System.out.print("");
                    System.out.println(rps1[player1choice]);
                    System.out.println(rps2[player2choice]);
                    if (player1choice == player2choice) {
                        System.out.println("That's a tie, both have chosen the same thing.");
                    } else if ((player1choice == 0 && player2choice == 2) ||
                            (player1choice == 1 && player2choice == 0) ||
                            (player1choice == 2 && player2choice == 1)) {
                        System.out.println("The winner is Player 1.");
                    } else {
                        System.out.println("The winner is Player 2.");
                    }
                    System.out.print("do you wanna continue playing (Enter Y/YES to continue, or N/NO to exit.): ");
                    String userInput = scn.next();
                    scn.nextLine();
                    if(userInput.toLowerCase().equals("y") || userInput.toLowerCase().equals("yes")){
                        System.out.print("Thank you for playing again.\n");
                    }else if(userInput.toLowerCase().equals("n") || userInput.toLowerCase().equals("no")){
                        System.out.print("Thank you for playing... program exit!!!");
                        break;
                    } else {
                        System.out.println("Input is not valid.");
                    }
                } else {
                    System.out.println("Enter number between 0 - 2");
                }
            } else {
                System.out.println("Invalid input, Give Number: ");
                scn.next();
            }
        } while (true);
    }
}

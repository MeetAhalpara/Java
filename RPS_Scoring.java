import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

class player2Info{
    private String player2FirstName;
    private String player2LastName;

    public String getPlayer2LastName() {
        return player2LastName;
    }

    public void setPlayer2LastName(String player2LastName) {
        this.player2LastName = player2LastName;
    }

    public String getPlayer2FirstName() {
        return player2FirstName;
    }

    public void setPlayer2FirstName(String player2FirstName) {
        this.player2FirstName = player2FirstName;
    }
    public void space(){
        System.out.println("");
    }
}

public class RPS_Scoring {
    public static void main(String[] args) {
        int player2choice;
        int player1win = 0;
        int player2win = 0;
        String choice;
        boolean runProgram;
        boolean playAgain = false;

        Bg_Color_Code bg = new Bg_Color_Code();
        Color_Code cc = new Color_Code();

        Scanner scn = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        player2Info playerIn = new player2Info();
        ArrayList<String> player1Choices = new ArrayList<>();
        ArrayList<String> player2Choices = new ArrayList<>();

        System.out.println(" 1 = Rock, 2 = Paper, 3 = Scissors");
        System.out.print("As a player 2, enter your Name: ");
        playerIn.setPlayer2FirstName(scn.next());
        playerIn.setPlayer2LastName(scn.next());
        playerIn.space();

        String[] rps1 = {"Player 1 has got Rock.", "Player 1 has got Paper.", "Player 1 has got Scissors."};
        String[] rps2 = {playerIn.getPlayer2FirstName() + " has got Rock.", playerIn.getPlayer2FirstName() + " has got Paper.", playerIn.getPlayer2FirstName() + " has got Scissors."};

        do {
            int player1choice = random.nextInt(3);
            player1Choices.add(rps1[player1choice]);

            System.out.print(playerIn.getPlayer2FirstName() + ", enter number between 1 - 3: ");

            if (scn.hasNextInt()) {
                player2choice = scn.nextInt() - 1;
                playerIn.space();

                if (player2choice >= 0 && player2choice <= 2) {

                    System.out.println(rps1[player1choice]);
                    System.out.println(rps2[player2choice]);

                    if (player1choice == player2choice) {
                        System.out.println("That's a tie, both have chosen the same thing.");
                    } else if ((player1choice == 0 && player2choice == 2) ||
                            (player1choice == 1 && player2choice == 0) ||
                            (player1choice == 2 && player2choice == 1)) {
                        System.out.println("The winner is Player 1.");
                        playerIn.space();
                        player1win++;
                    } else {
                        System.out.println("The winner is " + playerIn.getPlayer2FirstName() + " " + playerIn.getPlayer2LastName() + ".");
                        playerIn.space();
                        player2win++;
                    }
                    System.out.print(playerIn.getPlayer2FirstName() + ", do you wanna continue playing (Enter Y/YES to continue, or N/NO to exit.): ");
                    String userInput = scn.next();
                    scn.nextLine();
                    playerIn.space();
                    if(userInput.toLowerCase().equals("y") || userInput.toLowerCase().equals("yes")){
                        System.out.print("Thank you for playing again.\n");
                        playerIn.space();
                    }else if(userInput.toLowerCase().equals("n") || userInput.toLowerCase().equals("no")){
                        System.out.println("Player 1 wins " + player1win + ", and " + playerIn.getPlayer2FirstName() + " " + playerIn.getPlayer2LastName() + " wins " + player2win);
                        playerIn.space();
                        if (player1win == player2win) {
                            System.out.println("Highly chances were of Tie, so No-one was win.");
                            playerIn.space();
                        } else if(player1win > player2win) {
                            System.out.println("Player 1 is Winner for all the rounds.");
                            playerIn.space();
                        } else if(player2win > player1win) {
                            System.out.println(playerIn.getPlayer2FirstName() + " " + playerIn.getPlayer2LastName() + " is Winner for all the rounds.");
                            playerIn.space();
                        }
//                         Shows player 1's strategy for all the round
//                        System.out.print("Do you want to player 1's strategy?");
//                        String strategy = scn.next();
//                        if(strategy.toLowerCase().equals("y") || strategy.toLowerCase().equals("yes")){
//                            for (int i = 1; i < player1Choices.size(); i++) {
//                                System.out.println("For " + i + " round, " + player1Choices.get(i));
//                                playerIn.space();
//                            }
//                        }
                        System.out.print("Thank you for playing... program exit!!!");
                        break;
                    } else {
                        System.out.println("Input is not valid.");
                        playerIn.space();
                    }
                } else {
                    System.out.println("Enter number between 1 - 3");
                    playerIn.space();
                }
            } else {
                System.out.println("Invalid input, Give Number: ");
                playerIn.space();
                scn.next();
            }
        } while (true);
    }
}
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

class player2In {
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

    public void space() {
        System.out.println("");
    }
}

public class RPS_Color {
    public static void main(String[] args) {
        int player2choice;
        int player1win = 0;
        int player2win = 0;
        boolean runProgram;

        Bg_Color_Code bg = new Bg_Color_Code();
        Color_Code cc = new Color_Code();

        Scanner scn = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        player2In playerIn = new player2In();
        ArrayList<String> player1Choices = new ArrayList<>();
        ArrayList<String> player2Choices = new ArrayList<>();

        System.out.println(cc.ANSI_CYAN + " 1 = Rock, 2 = Paper, 3 = Scissors" + cc.ANSI_RESET);
        System.out.print(cc.ANSI_CYAN + "As a player 2, enter your Name: " + cc.ANSI_RESET);
        playerIn.setPlayer2FirstName(scn.next());
        playerIn.setPlayer2LastName(scn.next());
        playerIn.space();


        String[] rps1 = {"Player 1 has got Rock.", "Player 1 has got Paper.", "Player 1 has got Scissors."};
        String[] rps2 = {playerIn.getPlayer2FirstName() + " has got Rock.", playerIn.getPlayer2FirstName() + " has got Paper.", playerIn.getPlayer2FirstName() + " has got Scissors."};

        do {
            int player1choice = random.nextInt(3);
            player1Choices.add(rps1[player1choice]);

            System.out.print(cc.ANSI_YELLOW + playerIn.getPlayer2FirstName() + ", enter number between 1 - 3: " + cc.ANSI_RESET);

            if (scn.hasNextInt()) {
                player2choice = scn.nextInt() - 1;
                playerIn.space();

                if (player2choice >= 0 && player2choice <= 2) {
                    System.out.println(cc.ANSI_CYAN + rps1[player1choice] + cc.ANSI_RESET);  // Player 1 result in cyan
                    System.out.println(cc.ANSI_GREEN + rps2[player2choice] + cc.ANSI_RESET); // Player 2 result in green

                    if (player1choice == player2choice) {
                        System.out.println(cc.ANSI_BLUE + "That's a tie, both have chosen the same thing." + cc.ANSI_RESET);
                        playerIn.space();
                    } else if ((player1choice == 0 && player2choice == 2) ||
                            (player1choice == 1 && player2choice == 0) ||
                            (player1choice == 2 && player2choice == 1)) {
                        System.out.println(cc.ANSI_RED + "The winner is Player 1." + cc.ANSI_RESET);
                        playerIn.space();
                    } else {
                        System.out.println(cc.ANSI_GREEN + "The winner is " + playerIn.getPlayer2FirstName() + " " + playerIn.getPlayer2LastName() + "." + cc.ANSI_RESET);
                        playerIn.space();
                        player2win++;
                    }

                    System.out.print(cc.ANSI_CYAN + playerIn.getPlayer2FirstName() + ", do you wanna continue playing (Enter Y/YES to continue, or N/NO to exit.): " + cc.ANSI_RESET);
                    String userInput = scn.next();
                    scn.nextLine();
                    playerIn.space();

                    if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
                        System.out.println(cc.ANSI_GREEN + "Thank you for playing again." + cc.ANSI_RESET);
                        playerIn.space();
                    } else if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) {
                        System.out.println(cc.ANSI_YELLOW + "Player 1 wins " + player1win + ", and " + playerIn.getPlayer2FirstName() + " " + playerIn.getPlayer2LastName() + " wins " + player2win + cc.ANSI_RESET);
                        playerIn.space();
                        if (player1win == player2win) {
                            System.out.println(cc.ANSI_BLUE + "It's a tie, no overall winner!" + cc.ANSI_RESET);
                        } else if (player1win > player2win) {
                            System.out.println(cc.ANSI_RED + "Player 1 is the overall winner!" + cc.ANSI_RESET);
                        } else {
                            System.out.println(cc.ANSI_GREEN + playerIn.getPlayer2FirstName() + " " + playerIn.getPlayer2LastName() + " is the overall winner!" + cc.ANSI_RESET);
                        }
                        System.out.println(cc.ANSI_PURPLE + "Thank you for playing... program exit!!!" + cc.ANSI_RESET);
                        break;
                    } else {
                        System.out.println(cc.ANSI_RED + "Invalid input, please enter Y or N." + cc.ANSI_RESET);
                    }
                } else {
                    System.out.println(cc.ANSI_RED + "Invalid input, enter a number between 1 and 3." + cc.ANSI_RESET);
                }
            } else {
                System.out.println(cc.ANSI_RED + "Invalid input, enter a valid number." + cc.ANSI_RESET);
                scn.next();
            }
        } while (true);
    }
}

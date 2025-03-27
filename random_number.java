import java.util.Random;
import java.util.Scanner;

public class random_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int random_generator = rand.nextInt(100) + 1;
        while (true) {
            System.out.print("Guess The number: ");
            int userGuess = sc.nextInt();
            if (userGuess == random_generator) {
                System.out.print("Congrats. You guessed it!");
            }
            System.out.print("Wrong guess, would you like to play again?: ");
            String userChoice = sc.next();
            if (!userChoice.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}

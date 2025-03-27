import java.util.Random;
import java.util.Scanner;

class Guess_without_user {
    private int userInput;
    private int randomNumber;
    private int numberOfGuess;

    public void setUserInput(int userInput) {
        this.userInput = userInput;
        numberOfGuess++;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void randomGenerator() {
        Random rand = new Random();
        setRandomNumber(rand.nextInt(10) + 1);
    }

    public boolean isCorrectNumber() {
        if (userInput > randomNumber) {
            System.out.println("Your number is greater than random number.");
        } else if (userInput < randomNumber) {
            System.out.println("Your number is less than random number.");
        } else if (userInput == randomNumber) {
            System.out.println("Congrats! You win!");
            System.out.println("It took " + numberOfGuess + " number of guess to win.");
            return true;
        }
        return false;
    }
}

public class Guess_without_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guess_without_user guess1 = new Guess_without_user();
        guess1.randomGenerator();
        do {
            System.out.print("Enter guess number from 0 to 10 : ");
            guess1.setUserInput(sc.nextInt());
        } while (!guess1.isCorrectNumber());
    }
}
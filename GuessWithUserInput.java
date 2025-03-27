import java.util.Random;
import java.util.Scanner;

class GuessWithUser {
    private int till;
    private int userInput;
    private int randomNumber;
    private int numberOfGuess;


    public void setTill(int till) {
        if(till <= 0){
            System.out.println("Till must be greater than 0, this program will shutdown.");
            System.exit(0);
        }
        this.till = till;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
        numberOfGuess++;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void randomGenerator(int till) {
        Random rand = new Random();
        setRandomNumber(rand.nextInt(till) + 1);
    }

    public boolean isCorrectNumber() {
        int difference = Math.abs(userInput - randomNumber);
        if (userInput > till) {
            System.out.printf("Your input is bigger than number entered as till \'ENTER NUMBER TILL %d\'\n", till);
            return false;
        } else {
            if (userInput > randomNumber) {
//                if (difference <=5 ) {
//                    System.out.println("Your number is very close and greater than Generated Number.");
//                }
                System.out.println("Your number is greater than random generated number.");
            } else if (userInput < randomNumber) {
                System.out.println("Your number is less than random number.");
            } else {
                System.out.printf("Because your guess is %d & auto generated number is %d, You win! Congrats!\n", userInput, randomNumber);
                System.out.printf("It took %d number of guess for you to win.", numberOfGuess);
                return true;
            }
            System.out.println(getProximityMessage());
        }
        return false;
    }
    private String getProximityMessage(){
        int difference = Math.abs(userInput - randomNumber);
        if(difference <= 5){
            return "Very Close!";
        } else if (difference <= 10){
            return "Close!";
        }else {
            return "Far away.";
        }
    }

}

public class GuessWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessWithUser guess1 = new GuessWithUser();
        System.out.print("Enter the upper limit for the random number: ");
        int till = sc.nextInt();
        guess1.setTill(till);
        guess1.randomGenerator(till);
        do {
            System.out.printf("Enter guess number from 0 to %d : ", till);
            guess1.setUserInput(sc.nextInt());
        } while (!guess1.isCorrectNumber());
        sc.close();
    }
}
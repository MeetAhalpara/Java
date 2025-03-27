import java.util.Scanner;
public class each_characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        char[] charactersArray = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            charactersArray[i] = word.charAt(i);
        }

        System.out.print("Your secret code as per name is:\n");
        StringBuilder secretCode = new StringBuilder();

        for (int i = 0; i < charactersArray.length; i++) {
            char currentChar = charactersArray[i];
            System.out.println(currentChar + " = " + getSecretCode(currentChar));
            secretCode.append(getSecretCode(currentChar));
        }

        System.out.println(word + " = " + secretCode.toString());

        scanner.close();
    }
    private static String getSecretCode(char ch) {
        switch (Character.toUpperCase(ch)) {
            case 'A', 'B', 'C' -> {
                return "2";
            }
            case 'D', 'E', 'F' -> {
                return "3";
            }
            case 'G', 'H', 'I' -> {
                return "4";
            }
            case 'J', 'K', 'L' -> {
                return "5";
            }
            case 'M', 'N', 'O' -> {
                return "6";
            }
            case 'P', 'Q', 'R', 'S' -> {
                return "7";
            }
            case 'T', 'U', 'V' -> {
                return "8";
            }
            case 'W', 'X', 'Y', 'Z' -> {
                return "9";
            }
            default -> {
                return "Not reachable.";
            }
        }
    }
}
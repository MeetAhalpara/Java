import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean display = false;
        do {
            System.out.println("Enter your name");
            String name = scn.nextLine();
            System.out.println("Hey, " + name + " !");
            System.out.println("Want to re give name? (Y/N): ");
            String choice = scn.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                display = true;
            } else {
                display = false;
            }
        }
        while (display);
        System.out.println("Leaving now");
        scn.close();
    }
}
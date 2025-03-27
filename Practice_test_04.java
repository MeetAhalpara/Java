import java.util.Scanner;

public class Practice_test_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char choice;
    do {

        System.out.println("Enter the year to check, is it leap year or not: ");
        int year = scn.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        System.out.println("Want to repeat?: ");
        choice = scn.next().charAt(0);
    }
    while (choice == 'Y' || choice == 'y');
        System.out.println("Leaving now.");
        scn.close();
    }
}

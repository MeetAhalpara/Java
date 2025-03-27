import java.util.Scanner;

public class ClgId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your Last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter your birth date: ");
        String birthDate = sc.nextLine();
        System.out.print("Enter your birth month: ");
        int birthMonth = sc.nextInt();
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        String clgId = "@algonquinlive.com";
        System.out.println("You username is: " + lastName.substring(0, 4).toLowerCase() + birthMonth + birthDate + firstName.substring(0, 2).toUpperCase() + clgId);

//      Give password & Check is user given thing is correct or not.


    }
}

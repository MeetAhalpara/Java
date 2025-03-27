import java.util.Scanner;
public class UserInputMonthMatchTrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] timePass = new String[13];
        for (int i = 1; i < timePass.length; i++) {
            System.out.print("Enter " + i + " Month: ");
            String month = sc.nextLine();
            timePass[i] = month;
        }
        while (true) {
            System.out.print("By how would you like to check: number(1) or name(2)?: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.println("Enter Month number to see: ");
                int monthNum = sc.nextInt();
                sc.nextLine();
                if (monthNum >= 1 && monthNum <= 12) {
                    System.out.println(timePass[monthNum]);
                } else {
                    System.out.println("Invalid month number.");
                }
            } else if (choice == 2) {
                System.out.print("Enter Starting Letter to search the month: ");
                String sl = sc.nextLine();
                boolean found = false;
                for (String month : timePass) {
                    if (month != null && month.toLowerCase().startsWith(sl.toLowerCase())) {
                        System.out.println(month);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No month starts with the letter '" + sl + "'.");
                }
            } else {
                System.out.println("Invalid input. Please choose 1 or 2.");
            }
            System.out.print("Would you like to try again? (Y to continue or any other key to exit): ");
            String wantsToContinue = sc.nextLine();
            if (!wantsToContinue.equalsIgnoreCase("Y")) {
                break;
            }
        }
        sc.close();
    }
}

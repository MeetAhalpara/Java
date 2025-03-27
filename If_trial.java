import java.util.Scanner;

public class If_trial {
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);

        System.out.print("Enter your area temperature in Degrees Celsius: ");
        double tempLimit = scn1.nextDouble();
        if (scn1.hasNextDouble()) {
            if (tempLimit >= 31) {
                System.out.println("Your surrounding is HOT.");
            } else if (tempLimit > 20 && tempLimit <= 30) {
                System.out.println("Your surrounding is WARM.");
            } else if (tempLimit > 10 && tempLimit <= 20) {
                System.out.println("Your surrounding is MILD.");
            } else if (tempLimit >= 1 && tempLimit <= 10) {
                System.out.println("Your surrounding is COOL.");
            } else if (tempLimit == 0) {
                System.out.println("Your surrounding is COLD.");
            } else if (tempLimit < 0) {
                System.out.println("Your surrounding is more than COLD, Take care.");
            }
        } else {
            System.out.println("You entered something other than a number.");
        }

        System.out.println("Enter how many inner you have woren: ");
        int sweaterName = scn1.nextInt();

        switch (sweaterName){
            case 0:
            System.out.println("As per temperature, wearing inners are required.");
            break;
            case 1:
            System.out.println("1 is still less wear more inners.");
            break;
            case 2:
            System.out.println("2 is still less wear more inners.");
            break;
            case 3:
            System.out.println("3 is still less wear more inners.");
            break;
            case 4:
            System.out.println("4 is still less wear more inners.");
            break;
            case 5:
                System.out.println("5 is still good, but if feels like need to wear more, WEAR MORE.");
                break;
            default:
                System.out.println("Wear inners as possible as can to help ownself.");
        }
    }
}

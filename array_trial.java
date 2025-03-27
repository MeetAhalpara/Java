import java.util.Scanner;

public class array_trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] timePass ={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < timePass.length; i++) {
            System.out.println("Enter birth month: ");
            int number = sc.nextInt();
            for (int j = number; j <= number; j++) {
                System.out.println(timePass[j-1]);
            }
        }
    }
}

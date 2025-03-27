import java.util.Scanner;

public class star_trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter only a thing to show:");
        String s = sc.nextLine();
        System.out.print("Enter");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class facMeth {
    static int factorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of factorials: ");
        int a = sc.nextInt();
        System.out.print("The factorial of " + a + " is " + factorial(a));
    }
}

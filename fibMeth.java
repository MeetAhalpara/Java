import java.util.Scanner;

//public class fibMeth {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = 10;
//        int first = 0, second = 1;
//        System.out.println("Fibonacci Series using Loop:");
//        System.out.print(first + " " + second + " ");
//        for (int i = 2; i < n; i++) {
//            int next = first + second;
//            System.out.print(next + " ");
//            first = second;
//            second = next;
//        }
//    }
//}

public class fibMeth {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till want to see Fibonacci: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series using Recursion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

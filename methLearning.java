import java.sql.SQLOutput;
import java.util.Scanner;

public class methLearning {
//    It takes copy of the input/value x & y
    static int logic(int x, int y) {
//        If value of the x & y are changed, it won't affect value of the original.
        int z;
        if (x > y) {
            System.out.println("Addition");
            z = x + y;
        } else {
            System.out.println("Multiplication");
            z = x * y;
        }
        return z;
    }
    int math(int m, int n) {
        int o;
        if (m > n) {
            System.out.println("Addition");
            o = m + n;
        } else {
            System.out.println("Multiplication");
            o = m * n;
        }
        return o;
    }

    public static void main(String[] args) {
//        With in the main class only static method is called other without it object should be created, otherwise it will show error.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("If the 1st number is greater than the 2nd number it would do addition, otherwise it will be multiplied.");
        int c = logic(a, b);
        System.out.println(c);
        System.out.println("");
//      This is seperation thing
        System.out.println("Above is for method, below is of Object, like calling from other classes.");
        System.out.println("");
        System.out.print("Enter 1st number:");
        int k = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int l = sc.nextInt();
        System.out.println("If the 1st number is greater than the 2nd number it would do addition, otherwise it will be multiplied.");
        methLearning obj = new methLearning();
        int q = obj.math(k, l);
        System.out.println(q);
    }
}
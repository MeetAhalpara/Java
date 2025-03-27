//public class varargs {
//    static int sum(int...arr) {
//        int result = 0;
//        for (int a:arr){
//            result += a;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        System.out.println("Sum would be: " + sum(1,2,3,4,5, 6, 7, 8, 9, 10));
//    }
//}

import java.util.Scanner;
public class varargs {
    static int sum(int...arr) {
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        System.out.println("How many numbers' sum you want to see?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum(arr);
            if (sum == 9){
                System.out.println(arr[i]);
            } else if (sum < 9) {
                System.out.println("try again");
            }
//            System.out.println("Total would be: " + sum);
        }
    }
}
import java.util.Scanner;

public class Practice_test_7 {
//    Test_01
//    static int test_01(int a, int n){
//        for(int i = 1; i <= n; i++){
//            System.out.format("%d x %d = %d\n", a,i,(a*i));
//        }
//        return a*n;
//    }

//    Test_02
//    static void test_02(int b, String m){
//        for(int i = 0; i <= b; i++){
//            for(int j = 0; j <= i + 1; j++){
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//    }

//    Test_03
//    static int test_03(int c){
//        if(c <= 0){
//            return 0;
//        } else if(c == 1){
//            return 1;
//        } else {
//            return c + test_03(c-1);
//        }
//    }

//    Test_04
//    static void test_04(int e, String p){
//        for(int i = e; i >= 0; i--){
//            for(int j = i; j >= 1; j--){
//                System.out.print(p + " ");
//            }
//            System.out.println();
//        }
//    }

    //    Extra_test_01
//    static void extra_test_01(int et1, String t1, int userCho) {
//        if (userCho == 1) {
//            for (int i = 0; i <= et1; i++) {
//                for (int j = 0; j <=  i + 1; j++) {
//                    System.out.print(t1 + " ");
//                }
//                System.out.println();
//            }
//            for (int i = et1; i >= 0; i--) {
//                for (int j = i; j >= 1; j--) {
//                    System.out.print(t1 + " ");
//                }
//                System.out.println();
//            }
//        } else if (userCho == 2) {
//            for (int i = et1; i >= 0; i--) {
//                for (int j = i; j >= 1; j--) {
//                    System.out.print(t1 + " ");
//                }
//                System.out.println();
//            }
//            for (int i = 0; i <= et1; i++) {
//                for (int j = 0; j <=  i + 1; j++) {
//                    System.out.print(t1 + " ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Invalid choice.");
//        }
//    }

//    Test_05
//    static int test_05(int n){
//        if(n <= 1){
//            return n;
//        }
//        return test_05(n-1) + test_05(n-2);
//    }

//    Test_06
//    static int test_06(int...arr){
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//        return sum / arr.length;
//    }

    //    Test_07
//    static void test_07(String q, int f) {
//        if(f <= 0){
//            return;
//        }
//        for (int i = 0; i < f; i++) {
//            System.out.print(q + " ");
//        }
//        System.out.println();
//        test_07(q, f - 1);
//    }

//    Test_08
//    static void test_08(int g, String r) {
//        if (g > 0) {
//            test_08(g - 1, r);
//            for (int i = 0; i < g; i++) {
//                System.out.print(r + " ");
//            }
//            System.out.println();
//        }
//    }

    //    Test_09
//    static float test_09(float celsius) {
//        float fahrenheit;
//        fahrenheit = (float) ((celsius * 1.8) + 32);
//        return fahrenheit;
//    }

    static int test_10(int d) {
        int i = d;
        while (d < 0) {
            i += d;
            d--;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      Test_01
//        System.out.println("Table would be like 1st_NUMBER X 2nd_NUMBER");
//        System.out.println("Like 1st_number is 2, & 2nd_number is 10. It displays the table of 2 till 10 multiplication.");
//        System.out.print("Enter the 1st_number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the 2nd_number: ");
//        int n = sc.nextInt();
//        int userChoice = test_01(a, n);

//      Test_02
//        System.out.print("Enter the thing want to see as an Ascending order: ");
//        String m = sc.nextLine();
//        System.out.print("Enter the line to till want to see: ");
//        int b = sc.nextInt();
//        test_02(b, m);

//        Test_03
//        System.out.print("Enter the number to see total sum from 0 to your given number: ");
//        int d = sc.nextInt();
//        int sum = test_03(d);
//        System.out.println(sum);

//      Test_04
//        System.out.print("Enter the thing want to see as an Descending order: ");
//        String p = sc.nextLine();
//        System.out.print("Enter the line to till want to see: ");
//        int e = sc.nextInt();
//        test_04(e, p);

//        Extra_test_01
//        System.out.print("Enter the thing want to see: ");
//        String t1 = sc.nextLine();
//        System.out.print("Enter the line to till want to see: ");
//        int et1 = sc.nextInt();
//        System.out.println("How would you like to see output?");
//        System.out.println("For Ascending to Descending order enter: 1");
//        System.out.println("For Descending to Ascending order enter: 2");
//        int userCho = sc.nextInt();
//        extra_test_01(et1, t1, userCho);

//        Test_05
//        System.out.print("Enter the number to till want to see Fibonacci number: ");
//        int n = sc.nextInt();
//        System.out.print("Fibonacci number is: ");
//        for(int i = 0; i < n; i++){
//            System.out.print(test_05(i) + " ");
//        }

//        Test_06
//        int test1 = test_06();
//        System.out.println(test1);

//        Test_07
//        System.out.print("Enter the thing you want to see in descending order: ");
//        String q = sc.nextLine();
//        System.out.print("Enter the number of lines you want to see: ");
//        int f = sc.nextInt();
//        test_07(q, f);

//        Test_08
//        System.out.print("Enter the thing want to see as an Ascending order: ");
//        String r = sc.nextLine();
//        System.out.print("Enter the line to till want to see: ");
//        int g = sc.nextInt();
//        test_08(g, r);

//        Test_09
//        System.out.print("Enter Celsius to convert into Fahrenheit: ");
//        float celsius = sc.nextFloat();
//        System.out.printf("Fahrenheit would be: %.2f Fahrenheit.\n", test_09(celsius));

        System.out.print("Enter the number to see total sum from 0 to your given number: ");
        int d = sc.nextInt();
        test_10(d);

    }
}
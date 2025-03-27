 import java.util.Scanner;

 public class Practice_test_02 {
        public static void main(String[] args) {
            Scanner ft = new Scanner(System.in);


//            First Test Practice
            float a = (float) 7 / 4 * 9 / 2 ;
            System.out.println(a);


//          Second Test Practice
            System.out.print("Enter grade to encrypt: ");
            float rl = ft.nextFloat();
            float egd = rl + 8;
            System.out.println("Your Secret Grade is: " + egd);
            float dgd = egd - 8;
            System.out.print("Your grade REAL is: " + dgd);


//            3rd Test Practice
            System.out.print("Enter your age: ");
            float value = ft.nextFloat();

//            if you use || it is for OR
//            && this is for both ARE / MUST BE
//            > Must be More than right value & Must be less than right value
            if(value >= 18 && value < 150){
                System.out.println("You are eligible for Drinking");
            }
            else{
                System.out.println("You aren't valid to drink");
            }

//            4th Pratice

            float v = 10;
            float u = 3;
            float a1 = 3;
            float s = 2;
            float cal = (v*v - u*u)/(2*a1*s);
            System.out.printf("%.4f%n", cal);

//            5th pratice
            System.out.println(7 * 49 / 7 + 35 / 7);

        }
    }
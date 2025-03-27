import java.util.Scanner;
public class gradeCal {
    public static void main(String[]  args){
        Scanner subject = new Scanner(System.in);


        System.out.println("Give numbers out of 100");
        System.out.print("How many mark do you get in Mathematics: ");
        int maths = subject.nextInt();

        System.out.print("How many mark do you get in English: ");
        int eng = subject.nextInt();

        System.out.print("How many mark do you get in Science: ");
        int scn = subject.nextInt();

        System.out.print("How many mark do you get in Social Science: ");
        int ss = subject.nextInt();

        System.out.print("How many mark do you get in Computer Science: ");
        int cs = subject.nextInt();

        if (maths > 100 || eng > 100 || scn > 100 || ss > 100 || cs > 100) {
            System.out.println("One or more subject marks exceed 100. Give right marks.");
            return;
        }

        int sum = maths + eng + scn + ss + cs;

        float total = ((float)sum/500)*100;

        System.out.println("Your total is: " + sum + " and your percentage is: " + String.format("%.2f", total) + "%.");

        if(total > 100) {
            System.out.print("The limit is 100 you entered more than 100 digit.");
        }
    }
}
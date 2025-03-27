import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {

//        In while loop, if want to go from o to infinite, 1st declare value is like 0 & in while conditional it must be more than 0
//        In same loop, if want to go from infinite to 0, from reverse, 1st declare value is like infinite & in while conditional, it must be less than that, or that must be 0, if possible.

//      Greater than > the number on left side is always the biggest.
//      Less than < the number on right side is always the biggest.

//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            i += 2;
//        }
//
//        int j = 10;
//        while (j > 0){
//            System.out.println(j + " reducing.");
//            j -= 2;
//        }
//


//        do_while_loop
//        int a = 0;
//        do{
//            System.out.println(a);
//            a += 5;
//        } while (a <= 1000);




//    For_Loop
//    for(int m = 1000; m > 0; m--){
//        System.out.println(m);
//    }





//        Break & Continue
//        Break is used for breaking between the loop
//        Continue is used to skip the part of loop like, loop runs from 1 - 500, if given continue in 2, it skips only 2, and continue till the given limit.
//        To skip certain part continue is used.

//        for(int n = 1000; n >= 0; n--){
//            System.out.println(n + " this is natural Number.");
//            if(n == 500) {
//                System.out.println("This is end of code for now");
//                break;
//            }
//        }






//        This time, let's imagine a scenario where you're playing a guessing game.
//        The program will ask the user to guess a number, and it will keep prompting the user until they guess the correct number.

//        Scanner scn = new Scanner(System.in);
//        int secretNumber = 8;
//        int gussingNumber;
//
//        System.out.println("Guess Number between 1 to 10: ");
//        gussingNumber = scn.nextInt();
//
//        while (gussingNumber != secretNumber){
//            System.out.print("Your guessing about number between 1 to 10. is wrong, enter again: ");
//            gussingNumber = scn.nextInt();
//        }
//        System.out.println("Hey, you have guessed correct number");
//        scn.close();



//        Scanner scn1 = new Scanner(System.in);
//        System.out.print("Enter the number to get fictorial number: ");
//        long number = scn1.nextInt();
//        double fictoNumber = 1;
//        int i = 1;
//        while (i <= number){
//            fictoNumber *= i;
//            i++;
//        }
//        System.out.printf("Fictorial Number of %d is the %.0f\n", number, fictoNumber);
//        scn1.close();

int a = 0;
        for(int length = 0; length >= 0; length++) {
            System.out.print(" ");
            for(int i = 0;i <= 5;i++){
                for(int j = 1;j <= i;j++){
                    System.out.print("*");
                }
                System.out.println("*");
            }
        }
//        final int WIDTH = 10, HEIGHT = 5;
//        for (int stars = 0, spaces = WIDTH/2, rows = 0; rows <= HEIGHT;
//             stars +=WIDTH/HEIGHT, spaces = (WIDTH-stars)/2, rows++) {
//            for (int i = 1; i <= spaces; i++) System.out.print(" ");
//            for (int j = 0; j <= stars; j++) System.out.print("*");
//            System.out.println();
//        }


    }
}
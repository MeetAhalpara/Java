import java.util.Scanner;

public class Practice_test_03 {
    public static void main(String[] args) {
        Scanner snc1 = new Scanner(System.in);


//        Test_01
        System.out.print("Enter Your Name: ");
        String name1 = snc1.nextLine();
        name1 = name1.toLowerCase();
        System.out.println(name1);


//        Test_02
        System.out.print("Enter file name to write as coder write file name: ");
        String name2 = snc1.nextLine();
        System.out.println(name2.replace(" ", "_"));

//        Test_03
//        System.out.println("Enter name: ");
//        String str1 = snc1.nextLine();
//        System.out.println("Letter = \"Dear <|name|>, trans a lot\"");
//        System.out.println(str1);
//        System.out.println(str2);
//
        String str4 = new String("Letter = \"Dear <|name|>, trans a lot\"");
        System.out.println(str4);
        System.out.println("Enter name to replace: ");
        String str2 = snc1.nextLine();
        System.out.println(str4.replace("name", str2));

//        Test_04
        String str5 = "This is the thing in the file                                        which has long or more spaces to count";
        System.out.println(str5.indexOf("  "));
        System.out.println(str5.indexOf("   "));

//        Test_05
        String letter2 = "Dear ItpID, \n\tThe time was GREAT. \n\tThanks for it.";
        System.out.println(letter2);
    }
}

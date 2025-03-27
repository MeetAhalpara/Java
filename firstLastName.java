import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class firstLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age > 99) {
            System.out.println("Invalid Age");
        }
        System.out.print("Enter gender: ");
        String gender = sc.nextLine() + sc.nextLine();
        if(! (gender.equalsIgnoreCase("MALE") || gender.equalsIgnoreCase("FEMALE"))) {
            System.out.println("Invalid Gender");
        }
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();
        firstFullName firstfullname = new firstFullName();
        personDetails persondetails = new personDetails();
        String fullName = firstfullname.nameList(firstName, lastName);
        age = personDetails.age(age);
        gender = firstfullname.gender(gender);
        height = persondetails.height(height);
        weight = persondetails.weight(weight);
        System.out.println("");
        System.out.println("Your details are below.");
        System.out.println("");
        System.out.println("Your name: " + fullName);
        System.out.println("Your age: " + age);
        System.out.println("Your gender: " + gender);
        System.out.println("Your height: " + height);
        System.out.println("Your weight: " + weight);
        System.out.println();


    }
}

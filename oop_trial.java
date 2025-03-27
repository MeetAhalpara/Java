//import java.util.Random;
//import java.util.Scanner;
//class Employees {
//    int id;
//    String name;
//    public void  employeeDetails(){
//        System.out.print("Employee id: " + id + " & name is: " + name);
//
//    }
//}
//public class oop_trial {
//    public static void main(String[] args) {
//        Employees emp = new Employees();
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter the employee id: ");
//        emp.id = scn.nextInt();
//        System.out.print("Enter the employee name: ");
//        emp.name = scn.nextLine() + scn.nextLine();
//        emp.employeeDetails();
//    }
//}

import java.util.Random;
import java.util.Scanner;
class Students {
    int student_id;
    int fee;
    String student_name;
    public void studentDetails(){
        System.out.print("Your student id is: " + student_id + " , & name is: " + student_name + " & fee is: " + getFee());
    }
    public int getFee(){
        return fee;
    }
}
public class oop_trial {
    public static void main(String[] args) {
        Students std = new Students();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your student id: ");
        std.student_id = scn.nextInt();
        System.out.print("Enter your student fees: ");
        std.fee = scn.nextInt();
        System.out.print("Enter your student name: ");
        std.student_name = scn.nextLine() + scn.nextLine();
        std.studentDetails();
    }
}
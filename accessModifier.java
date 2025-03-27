import java.util.Scanner;

class myEmployee{
    private static int salary;
    private static String name;
    public static String getName(){
        return name;
    }
    public static void setName(String n){
        name = n;
    }
    public static int getSalary(){
        return salary;
    }
    public static void setSalary(int sal){
        salary = sal;
    }
}

public class accessModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        myEmployee emp = new myEmployee();
        System.out.print("Enter the your name: ");
        myEmployee.setName(sc.nextLine());
        System.out.print("Enter the your salary: ");
        myEmployee.setSalary(sc.nextInt());
        System.out.printf("Your name is %s and salary is %d.\n", myEmployee.getName(), myEmployee.getSalary());
    }
}

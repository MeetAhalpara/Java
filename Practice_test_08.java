import java.util.Scanner;

// Test_01
class employees{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

// Test_02
class cellPhone{
    public void ringing() {
        System.out.println("Your phone is ringing.");
    }
    public void vibrating(){
        System.out.println("Your phone is vibrating.");
    }
    public void silent(){
        System.out.println("Your phone is silent.");
    }
    public void invalid(){
        System.out.println("Invalid input by you.");
    }
}

// Test_03
class square{
    float a;
    public float area(){
        return a * a;
    }
    public float perimeter(){
        return a+a+a+a;
    }
}

// Test_04
class rectangle{
    float height, width;
    public float area(){
        return height*width;
    }
    public float perimeter(){
        return 2*(height+width);
    }
}

//Test_05
class tommyVercetti {
    public void hitting() {
        System.out.println("Tommy Vercetti is hitting.");
    }
    public void running() {
        System.out.println("Tommy Vercetti is running.");
    }
    public void firing() {
        System.out.println("Tommy Vercetti is firing.");
    }
    public void stealing() {
        System.out.println("Tommy Vercetti is stealing.");
    }
    public void flirting() {
        System.out.println("Tommy Vercetti is firing.");
    }
    public void driving() {
        System.out.println("Tommy Vercetti is driving.");
    }
}

//Test_06
class Circle{
    float r;
    public float d(){
        return r * 2;
    }
    public float area(){
        return (float) (3.14*(r*r));
    }
    public float perimeter(){
        return (float) (2 * (3.14 * r));
    }
}

public class Practice_test_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Test_01
        employees emp = new employees();
        System.out.print("Enter your name: ");
        emp.name = sc.nextLine();
        System.out.print("Enter your salary: ");
        emp.salary =sc.nextInt();
        emp.setName(emp.name);
        System.out.printf("Your name is: %s & your salary is: %d", emp.getName(), emp.getSalary());

// Test_02
        cellPhone cp = new cellPhone();
        System.out.print("Enter any of those ringing, vibrating, or silent: ");
        String response = sc.nextLine();
        if(response.trim().equalsIgnoreCase("ringing")){
            cp.ringing();
        } else if(response.trim().equalsIgnoreCase("vibrating")){
            cp.vibrating();
        } else if(response.trim().equalsIgnoreCase("silent")){
            cp.silent();
        } else {
            cp.invalid();
        }

// Test_03
        square sq = new square();
        System.out.print("Enter value for a single side of sqaure: ");
        sq.a = sc.nextFloat();
        System.out.print("Enter either 1.area or 2.Perimeter: ");
        int calculated = sc.nextInt();
        if(calculated == 1){
            System.out.printf("%.2f", sq.area());
        } else if(calculated == 2){
            System.out.printf("%.2f", sq.perimeter());
        } else if (!(calculated == 1 || calculated == 2)){
            System.out.println("Not valid.");
        }

//        Test_04
        rectangle rect = new rectangle();
        System.out.print("Enter the height of the Rectangle: ");
        rect.height = sc.nextFloat();
        System.out.print("Enter the width of the Rectangle: ");
        rect.width = sc.nextFloat();
        System.out.print("Enter either 1.area or 2.Perimeter: ");
        int calc = sc.nextInt();
        if(calc == 1){
            System.out.printf("Area of the rectangle is %.2f.\n", rect.area());
        } else if(calc == 2){
            System.out.printf("Perimeter of the rectangle is %.2f.\n", rect.perimeter());
        } else if (!(calc == 1 || calc == 2)){
            System.out.println("Not valid.");
        }

//        Test_05
        tommyVercetti tv = new tommyVercetti();
        System.out.println("Hitting, Running, Firing, Stealing, Flirting, Driving");
        System.out.print("For Tommy Vercetti, choose & write any from the above: ");
        String resp = sc.nextLine();
        if (resp.trim().equalsIgnoreCase("hitting")) {
            tv.hitting();
        } else if (resp.trim().equalsIgnoreCase("running")) {
            tv.running();
        } else if (resp.trim().equalsIgnoreCase("firing")) {
            tv.firing();
        } else if (resp.trim().equalsIgnoreCase("stealing")) {
            tv.stealing();
        } else if (resp.trim().equalsIgnoreCase("flirting")) {
            tv.firing();
        } else if (resp.trim().equalsIgnoreCase("driving")) {
            tv.driving();
        } else {
            System.out.println("Invalid input.");
        }

// Test_06
        Circle cr = new Circle();
        System.out.print("Enter r for a Circle: ");
        cr.r = sc.nextFloat();
        System.out.printf("As per %.2f, the d of the circle is %.2f, area of circle is %.2f, and perimeter of circle is: %.2f.\n", cr.r, cr.d(), cr.area(), cr.perimeter());

    }
}
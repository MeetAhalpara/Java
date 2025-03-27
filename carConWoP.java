import java.util.Scanner;

class Car {
    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Car() {
        model = "Your Car Model Name";
        year = 2018;
    }
}

public class carConWoP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car cr = new Car();
        System.out.print("Enter your car model name:");
        cr.setModel(sc.nextLine());
//        String model = sc.nextLine();
        System.out.print("Enter your year:");
        cr.setYear(sc.nextInt());
//        int year = sc.nextInt();
        System.out.println(cr.getModel() + " " + cr.getYear());
        Car cr1 = new Car();
        System.out.println(cr1.getModel() + " " + cr1.getYear());
    }
}

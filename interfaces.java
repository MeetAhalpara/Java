import java.util.Scanner;

interface Bicycle{
    void applyBrake(int dec);
    void speedUp(int icr);

    default void speed(int spd) {
        System.out.println("This is for the normal speed test.");
    }
}

interface Horn{
    String carHorn();
    String bikeHorn();
}

class AvonCycle implements Bicycle, Horn{
    int speed;
    @Override
    public void applyBrake(int dec) {
        speed -= dec;
        System.out.printf("Applying Brake by %s.\n", dec);
    }

    @Override
    public void speedUp(int icr) {
        speed += icr;
        System.out.printf("Applying Speed Up by %s.\n", icr);
    }

    public String carHorn(){
        return "Car Horn";
    }

    public String bikeHorn(){
        return "Bike Horn.";
    }
}
public class interfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AvonCycle avc = new AvonCycle();
        System.out.print("Enter Speed: ");
        int speed = sc.nextInt();
        avc.speedUp(speed);
        System.out.print("Apply brake: ");
        int brake = sc.nextInt();
        avc.applyBrake(brake);
        int afterSpeed = speed - brake;
        System.out.printf("So the speed of the Cycle is the %s.\n", afterSpeed);
        avc.speed(2);
        System.out.println("There are 2 types of horn, 1: " + avc.carHorn() + ", and 2nd: " + avc.bikeHorn());
    }
}
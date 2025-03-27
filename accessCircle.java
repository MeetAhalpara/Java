import java.util.Scanner;
public class accessCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cirC cir = new cirC();
        System.out.print("Enter R for a circle: ");
        cir.setR(sc.nextFloat());
        System.out.printf("As per R = %.2f,\n", cir.getR());
        System.out.printf("diameter is %.2f,\n", cir.d());
        System.out.printf("area is %.2f,\n", cir.area());
        System.out.printf("and perimeter is %.2f.", cir.perimeter());
    }
}

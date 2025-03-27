import java.util.Scanner;

public class km {
    public static void main(String[] args){
        Scanner kmtm = new Scanner(System.in);

        System.out.print("Enter value to convert Kilometers to Meters: ");
        float km = kmtm.nextFloat();
        int sum = (int) (km * 1000);
        System.out.print("The " + km + " into the miles are: " + sum + ".");
    }
}
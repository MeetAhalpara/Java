import java.util.*;
public class NOT_loop_days_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar ca = Calendar.getInstance();
        System.out.println("Today's date is: " + ca.get(Calendar.DAY_OF_MONTH) + "/" + (ca.get(Calendar.MONTH) + 1) + "/" + ca.get(Calendar.YEAR));
        System.out.print("Enter number till that date want to see all dates: ");
        int date = sc.nextInt();
        int tod= ca.get(Calendar.DAY_OF_MONTH);
        for( int i = 1; i <= date; i++){
            ca.add((Calendar.DAY_OF_MONTH) - 1, i);
            System.out.println( i + "'s after date will be: " + ca.get(Calendar.DAY_OF_MONTH) + "/" + (ca.get(Calendar.MONTH) + 1) + "/" + ca.get(Calendar.YEAR));
        }
    }
}
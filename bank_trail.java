import java.util.Scanner;

public class bank_trail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bank ID: ");
        String bankID = sc.nextLine();
        if(bankID.length()  > 9){
            System.out.println("Bank ID can\'t be longer than 9 digits!");
        }
    }
}

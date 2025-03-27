//import com.sun.source.tree.InstanceOfTree;
//
//import java.util.Scanner;
////class myClass{
////    myClass(){
////        System.out.println("This is constructor wihtout any Access Modifier.");
////    }
////}
//
//class bank_details{
//    private int bankAccountId;
//    private float bankAccountBalance;
//    private String bankAccountHolderName;
//    public int getBankAccountId(){
//        return bankAccountId;
//    }
//    public void setBankAccountId(int bankAccountId){
//        this.bankAccountId = bankAccountId;
//    }
//    public float getBankAccountBalance(){
//        return bankAccountBalance;
//    }
//    public void setBankAccountBalance(float bankAccountBalance){
//        this.bankAccountBalance = bankAccountBalance;
//    }
//    public String getBankAccountHolderName(){
//        return bankAccountHolderName;
//    }
//    public void setBankAccountHolderName(String bankAccountHolderName){
//        this.bankAccountHolderName = bankAccountHolderName;
//    }
//}
//
//public class pr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        bank_details bankCustomer1 = new bank_details();
//        System.out.println("Enter Your Bank Number only 5 digits: ");
//        int bankAccountId = sc.nextInt();
//        if (bankAccountId >= 5) {
//            System.out.println("Bank account Id is more than 5.");
//        }
//        bankCustomer1.setBankAccountId(bankAccountId);
//        System.out.println("Enter Your Bank Account Balance: ");
//        float bankAccountBalance = sc.nextFloat();
//        if (bankAccountBalance < 0) {
//            System.out.println("YOu can't have account balance less than 0.");
//        }
//        bankCustomer1.setBankAccountBalance(bankAccountBalance);
//        System.out.println("Enter bank account holder name: ");
//        String bankAccountHolderName = sc.next();
//        bankCustomer1.setBankAccountHolderName(bankAccountHolderName);
//        System.out.println("1. to see bank account Number");
//        System.out.println("2. Account Holder Name");
//        System.out.println("3. Account Balance");
//        System.out.println("Enter Digit to see informaiton: ");
//        int userResponse = sc.nextInt();
//        if(userResponse == 1) {
//            System.out.println(bankCustomer1.getBankAccountId());
//        } else if (userResponse == 2) {
//            System.out.println(bankCustomer1.getBankAccountHolderName());
//        } else if (userResponse == 3) {
//            System.out.println(bankCustomer1.getBankAccountBalance());
//        }
//    }
//}
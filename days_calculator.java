//import java.util.*;
//
//public class days_calculator {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        Calendar calendar = Calendar.getInstance();
//
////        System.out.println(STR."Today's date: \{calendar.get(Calendar.DAY_OF_MONTH)}/\{calendar.get(Calendar.MONTH) + 1}/\{calendar.get(Calendar.YEAR)}");
//
//        System.out.print("Enter number of days to check the date after: ");
//        int day = scn.nextInt();
//        if (day == 0){
//            System.out.println("Cannot add 0 days.");
//            System.exit(0);
//        }
//        System.out.println("I for include, i for not include");
//        System.out.print("Do you want to include today's day: ");
//        String ind = scn.next();
//        if (ind.equals("i")) {
//            calendar.add(Calendar.DAY_OF_MONTH, day);
//            System.out.println(STR."Date after \{day} days: \{calendar.get(Calendar.DAY_OF_MONTH)}/\{calendar.get(Calendar.MONTH) + 1}/\{calendar.get(Calendar.YEAR)}");
//        } else if (ind.equals("I")) {
//            if (day == 0){
//                System.out.println("Cannot add 0 days.");
//            }
//            calendar.add(Calendar.DAY_OF_MONTH, day-1);
//            System.out.println(STR."Date after \{day} days: \{calendar.get(Calendar.DAY_OF_MONTH)}/\{calendar.get(Calendar.MONTH) + 1}/\{calendar.get(Calendar.YEAR)}");
//        }
//    }
//}

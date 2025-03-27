import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        /*
        1. dataType [] name = new dataType[ NUMBER ]
        2. dataType [] name;
        name = new dataType[ NUMBER ];
        3. dataType [] name = { VALUE1, VALUE2,....}
         */

        int [] countryCode = new int[10];
        countryCode[0] = 1;
        countryCode[1] = 11;
        countryCode[2] = 111;
        countryCode[3] = 1111;
        countryCode[4] = 11111;
        countryCode[4] = 111110;
        System.out.println(countryCode[4] + "this is 4th value of array");
        System.out.println(countryCode.length + "The length of the array is.");
        for (int i = 0; i < countryCode.length; i++) {
            if (countryCode[i] == 0) {
                System.out.print("Yet not defined.");
            }
            System.out.println("The for loop for array " + countryCode[i]);
        }
        for(int ele : countryCode){
            System.out.println(ele);
        }
    }
}

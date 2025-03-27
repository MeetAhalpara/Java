import java.util.Scanner;

public class multiArs {
    public static void main(String[] args) {
/*
  Ways to declare multidimensional array
  datatypes [][] name = new datatypes [number of rows][number of columns];
  datatypes [][] name;
  name = new datatypes [number of rows][number of columns];
*/
        Scanner sc = new Scanner(System.in);
//        String [][] bank = new String[3][3];
//        System.out.println("Enter your firstname: ");
//        String firstname = sc.nextLine();
//        bank[0][0] = firstname;
//        System.out.println(firstname+ " this is firstname ");
//        System.out.println(bank[0][0]+ " this is bank array ");
//        for (int i = 1; i < bank.length; i++) {
//            for (int j = 1; j < bank[i].length; j++) {
//                System.out.println(bank[i][j]+ " this is bank array ");
//            }
//        }

        int [][][] flats = new int[3][3][3];
        flats[0][0][0] = 1;
        flats[0][0][1] = 2;
        flats[0][0][2] = 3;
        flats[0][1][0] = 4;
        flats[0][1][1] = 5;
        flats[0][1][2] = 6;
        flats[0][2][0] = 7;
        flats[0][2][1] = 8;
        flats[0][2][2] = 9;
        flats[1][0][0] = 10;
        flats[1][0][1] = 11;
        flats[1][0][2] = 12;
        flats[1][1][0] = 13;
        flats[1][1][1] = 14;
        flats[1][1][2] = 15;
        flats[1][2][0] = 16;
        flats[1][2][1] = 17;
        flats[1][2][2] = 18;
        flats[2][0][0] = 19;
        flats[2][0][1] = 20;
        flats[2][0][2] = 21;
        flats[2][1][0] = 22;
        flats[2][1][1] = 23;
        flats[2][1][2] = 24;
        flats[2][2][0] = 25;
        flats[2][2][1] = 26;
        flats[2][2][2] = 27;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                for (int k = 0; k < flats[i][j].length; k++) {
                    System.out.print(flats[i][j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

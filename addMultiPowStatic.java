import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

class mt{
    private int x;
    private int y;

    static int add(int x, int y){
        int z;
        return z = x+y;
    }
    static int multiple(int x, int y){
        int z = x*y;
        return z;
    }
    static int pow(int x, int y){
        return (int) Math.pow(x, y);
    }
}

public class addMultiPowStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x: ");
        int x = sc.nextInt();
        System.out.print("Enter the y: ");
        int y = sc.nextInt();
        System.out.printf("1st, system will do Add of %d + %d = %d.\n", x, y, mt.add(x, y));
        System.out.printf("2nd, system will do multiplication of %d * %d = %d.\n", x, y, mt.multiple(x, y));
        System.out.printf("3rd, system will do power of %d ^ %d = %d.\n", x, y, mt.pow(x, y));
    }
}

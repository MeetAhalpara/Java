public class methOverLoad {
    static void joke() {
        System.out.println("Hey, why are you alone?");
    }
    static void m() {
        System.out.println("Meet Ahalpara");
    }
//    a is parameters.
    static void m2(int a) {
        System.out.println("Meet Ahalpara " + a + "st Number");
    }
    static void m2(int a, int b) {
        System.out.println(a + " & " + b + " are not good to have.");
    }
//    static void m3(int [] arr) {
//        arr[0] =98;
//    }
    public static void main(String[] args) {
        joke();
        m();
        m2(1);
        m2(2, 3);
//        int [] marks = {0 ,96 ,96, 63, 88, 71};
//        System.out.println(marks[0]);
//        m3(marks);
//        System.out.println(marks[0]);
    }
}

//public class methOverLoad {
//    public void v1(int a) {
//        System.out.println(a);
//    }
//    public void v1(int a, int b) {
//        System.out.println(STR."\{a}\{b}");
//    }
//    public void v1(String a, String b, String c) {
//        System.out.println(a + " + " + b + " = " + c);
//    }
//    public static void main(String[] args) {
//        methOverLoad methOv = new methOverLoad();
//        methOv.v1(1);
//        methOv.v1(1, 2);
//        methOv.v1("Meet", "Ahalpara", "Meet Ahalpara");
//    }
//}
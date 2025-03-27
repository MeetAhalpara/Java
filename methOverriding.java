import java.util.Scanner;

class A{
    public int a = 4;
    public int c1(){
        return 4+9;
    }
    public void c2(){
        System.out.println("Method c2 from the main class A.");
    }
}

class B extends A {
    @Override
    public void c2(){
        System.out.println("Method c2 from the B extends A.");
    }
    public void c3(){
        System.out.println("Method c3");
    }
}

public class methOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();
        a.c2();
        B b = new B();
        b.c2();
    }
}

import java.util.Scanner;

//Abstract class doesn't have object
abstract class abt1{
    public abt1(){
        System.out.println("This is abt1\'s constructor.");
    }
    public void he(){
        System.out.println("Hey");
    }
    abstract public void greet();
}

class abt2 extends abt1{
    @Override
    public void greet(){
        System.out.println("Hey, have a blessings from the greet Messenger.");
    }
}

class abt21 extends abt2{
    public void aVoid(){
        System.out.println("Hey");
    }
}

abstract class abt3 extends abt1{
    public void grt(){
        System.out.println("Hey, have a blessings from the grt Messenger.");
    }
}

// Abstract means exists into thought or as an idea without existence.
// Only available into thoughts
// Declaring the method or objects with parameters but don't know what it does.
// Like abstract void rectangle(double x, double y) without declaring, implementing.
// Abstract class means which abstract method
// Single abstract method creates a class an abstract.

public class abstact {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        abt2 ab2 = new abt2();
//        ab2.he();
//        ab2.greet();
        abt21 ab21 = new abt21();
        ab21.aVoid();
    }
}
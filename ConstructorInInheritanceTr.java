class class1{
    class1(){
        System.out.println("Class 1 Constructor without parameters.");
    }
    class1(int a){
        System.out.println("Class 1 Constructor with parameters a: " + a);
    }
}

class class2 extends class1{
    class2(){
        System.out.println("Class 2 Constructor without parameters.");
    }
    class2(int a, int b){
        super(a);
        System.out.println("Class 2 Constructor with parameters b: " + b);
    }
}

class class3 extends class2{
    class3(){
        System.out.println("Class 3 Constructor without parameters.");
    }
    class3(int a, int b, int c){
        super(a, b);
        System.out.println("Class 3 Constructor with parameters c: " + c);
    }
}

public class ConstructorInInheritanceTr {
    public static void main(String[] args) {
        class3 cl31 = new class3();
        System.out.println("\nThis above things are using simple object without giving them any parameters" +
                " and below are the object which has parameters.\n");
        class3 cl32 = new class3(1, 2, 3);
        System.out.println("\n This above thing is called Overloading using constructor in the inheritance.");

    }
}

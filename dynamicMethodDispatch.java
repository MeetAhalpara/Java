class a1 {
    public void a1(){
        System.out.println("From the a1 class, Have a good day");
    }
    public void greeting(){
        System.out.println("From the a1 class, Have a great day");
    }
}

class a2 extends a1{
    public void a1(){
        System.out.println("From a2 class, have a greatest day");
    }
    public void welcome(){
        System.out.println("From a2 class, Have a great Welcome.");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
//        a1 a1 = new a1();
//        a1.a1();
//        a2 a2 = new a2();

//        SuperClass name = new subclass();
//        Reference name = new Object
//        Means if run overriding thing by using below thing, it will run object's method.
        a1 a12 = new a2();
        a12.a1();

//        a12.greeting();
//        object name which can't be displayed, a12.method name
//        ((a2) a12).welcome();

//        This way is not allowed.
//        a2 a21 = new a1();
    }
}
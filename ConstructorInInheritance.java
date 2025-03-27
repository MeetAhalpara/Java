import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

class abs {
    abs() {
        System.out.println("This is abs Constructor in the abs class");
    }

    abs(String firstName) {
        System.out.println("This is abs Constructor which is taking user\'s name: " + firstName);
    }
}

//If any constructor isn't created into subclass, it takes from the superclass
class cal extends abs {
    //        if value is given like this using super(THE VALUE AS PER ABOVE), it will run parameter constructor,
//        Without super thing, it will automatically take default constructor.
    cal() {
        System.out.println("This is constructor into the cal, subclass, of the abs, superclass.");
    }

    cal(String firstName, String middleName) {
//        This super is used to call or take values from this subclass to superclass.
        super(firstName);
        System.out.println("This is constructor into the cal, subclass, of the abs, superclass, and also take" +
                " name parameter: " + middleName);
    }
}

class math extends cal{
    math(){
        System.out.println("This is constructor into the math, subclass, cal, subclass, of the abs, superclass.");
    }
    math(String firstName, String middleName, String lastName) {
        super(firstName, middleName);
        System.out.println("This 3rd extended class of the main will take your firstname, middlename, & lastname: " + lastName);
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
//        abs ab = new abs();
//        abs ab1 = new abs("Meet");
//        cal c = new cal("Meet", "Ahalpara");
//        When run this, it repeats constructor created into the abs, superclass.
//        If created different constructor into the subclass, it also displays both parent & child constructor.
//        1st it displays superclass constructor, then displays subclass constructor.

        System.out.println("This is calling 1st main class abs:");
        abs ab = new abs();
        System.out.println();
        System.out.println("This is calling 1st main class abs using parameters::");
        abs ab1 = new abs("Meet");
        System.out.println();
        System.out.println("This is calling 2nd subclass cal::");
        cal cl = new cal();
        System.out.println();
        System.out.println("This is calling 2nd subclass cal using parameters::");
        cal cl1 = new cal("Meet", "Bhavesh bhai");
        System.out.println();
        System.out.println("This is calling 3rd extended class math:::");
        math mt = new math();
        System.out.println();
        System.out.println("This is calling 3rd extended class math using parameters::");
        math mt1 = new math("Meet", "Bhaveshbhai", "Ahalpara");
        System.out.println();
    }
}

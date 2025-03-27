
interface trialIf{
    void m1();
    void m2();
}

interface trialIf1 extends trialIf{
    void m3();
    void m4();
}
class trialIfCl implements trialIf1{
    public void m1() {
        System.out.println("M1");
    }
    public void m2() {
        System.out.println("M2");
    }
    public void m3() {
        System.out.println("M3");
    }
    public void m4() {
        System.out.println("M4");
    }
}

public class Inheritance_in_Interfaces_58 {
    public static void main(String[] args) {
        trialIfCl obj = new trialIfCl();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}

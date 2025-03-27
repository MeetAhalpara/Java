class tr{
    int a;

    public int getA() {
        return a;
    }
    public int rnNon(){
        return 1;
    }
    tr(int a){
        this.a = a;
    }
}

class tr1 extends tr{
    tr1(int a){
        super(a);
        System.out.println("This is tr1 constructor taking value from the above constructor, which value is: " + a);
    }
}

public class thisSuper {
    public static void main(String[] args) {
        tr t = new tr(5);
        System.out.println(t.getA());
        tr1 t1 = new tr1(1);
    }
}

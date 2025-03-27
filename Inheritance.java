//Parent
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("This is inside setX under Base class");
        this.x = x;
    }

    public void base(){
        System.out.println("This is constructor inside the base class");
    }
}

//Child
//This means instead of copying or having into everything into a new class
//Extends base means all base content will be available into derived class
//If any changes are done inito base class, & using object of derived that will be called into derived,
// changes will be noticed into the derived class.
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}

public class Inheritance {
    public static void main(String[] args) {
//        Creating Object of a base class
        base b = new base();
        b.setX(4);
        System.out.println("This is the base class object thing " + b.getX());

//        Creating Object of a derived class
        derived d = new derived();
        d.setX(4);
        d.setY(5);
        System.out.println("This is the derived class object thing " + d.getX() + " " + d.getY());
    }
}

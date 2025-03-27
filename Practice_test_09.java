import java.util.Scanner;

class cylinder {

    //     P = 1
    private float radius;
    private float height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //     P = 2
    public float volume() {
        return (float) ((Math.PI) * (radius * radius) * (height));
    }

    public float area() {
        return (float) ((2 * (Math.PI) * (radius) * (height)) * (2 * (Math.PI) * (radius * radius)));
    }

    public cylinder() {
        radius = 0;
        height = 0;
    }

    public cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
}

class Rectangle01{
    private float length;
    private float width;

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public Rectangle01() {
        this.length = 4;
        this.width = 5;
    }

    public Rectangle01(float length, float width) {
        this.length = length;
        this.width = width;
    }
}

class sphere{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
//  Creating method
    public float volume(){
        return (float) ((4/3) * Math.PI * Math.pow(radius, 3));
    }

    public float circumference(){
        return (float) (2 * Math.PI * radius);
    }

    public float area(){
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }

    public sphere(){
        radius = 10;
    }
    public sphere(float radius){
        this.radius = radius;
    }
}

public class Practice_test_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        cylinder cy = new cylinder();
//
//        P = 1 Using Getter & Setter
//        System.out.print("Enter the radius for Cylinder: ");
//        float radius = sc.nextFloat();
//        cy.setRadius(radius);
//        System.out.print("Enter the height for Cylinder: ");
//        float height = sc.nextFloat();
//        cy.setHeight(height);
//        System.out.printf("As per given, Radius is : %.2f & Height is : %.2f. \n", cy.getRadius(), cy.getHeight());
////        P = 2
//        float v = cy.volume();
//        System.out.printf("Volume of Cylinder is : %.2f. \n", v);
//        float a = cy.area();
//        System.out.printf("Area of Cylinder is : %.2f. \n", a);
//
////        P = 3 Using constructor
//        System.out.print("Enter the radius for Cylinder: ");
//        float radius1 = sc.nextFloat();
//        System.out.print("Enter the height for Cylinder: ");
//        float height1 = sc.nextFloat();
//        cylinder cy1 = new cylinder(radius1, height1);
//        System.out.printf("For cy1 which is using constructor so radius is : %.2f & height is %.2f. \n", cy1.getRadius(), cy1.getHeight());
//        float v1 = cy1.volume();
//        System.out.printf("Volume of Cylinder is : %.2f. \n", v1);
//        float a1 = cy1.area();
//        System.out.printf("Area of Cylinder is : %.2f. \n", a1);

//        P = 4
//        Rectangle01 r1 = new Rectangle01();
//        System.out.printf("This is by default constructor value which value is 4 & 5, length: %.2f & width: %.2f.\n", r1.getLength(), r1.getWidth());
//        Rectangle01 r = new Rectangle01();
//        System.out.print("Enter the Length for the Rectangle: ");
//        float length = sc.nextFloat();
//        r.setLength(length);
//        System.out.print("Enter the Width for the Rectangle: ");
//        float width = sc.nextFloat();
//        r.setWidth(width);
//        System.out.printf("This is parameter constructor: Length: %.2f & Width: %.2f%n", r.getLength(), r.getWidth());

//          P = 5
//        sphere sp = new sphere();
//        System.out.print("Enter the radius of the sphere: ");
//        float spRadius = sc.nextFloat();
//        sp.setRadius(spRadius);
//        System.out.printf("The radius of sphere is %.2f, Volume is %.2f, Circumference is %.2f, Surface area is %.2f.\n", sp.getRadius(), sp.volume(), sp.circumference(), sp.area());
//
//        This is default constructor
//        sphere sp = new sphere();
//        System.out.println(sp.getRadius());
//
//        User input parameter constructor
//        sphere sp1 = new sphere(spRadius);
//        System.out.println(sp1.getRadius());
    }
}
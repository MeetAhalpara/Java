import java.util.Scanner;

// P = 1
class cir1{
    public float radius;
    cir1(){
        this.radius = 0;
        System.out.println("This is default constructor with 0 in cir class.");
    }
    cir1(float radius){
        this.radius = radius;
    }
    public float diameter(){
        return (float) 2 * radius;
    }
    public float circumference(){
        return (float) ((float) 2 * (Math.PI * radius));
    }
    public float area(){
        return (float) (Math.PI * (radius * radius));
    }
}

class cylinder1 extends cir1{
    public float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    cylinder1(){
        this.radius = 0;
        this.height = 0;
        System.out.println("This is default constructor with 0 in cylinder clas.");
    }
    cylinder1(float radius, float height){
        super(radius);
        this.height = height;
        System.out.println("This is constructor with parameters from cir class.");
    }
    public float volume(){
        return (float) (Math.PI * (height * radius) * height);
    }
    public float lateralArea(){
        return (float) (2 * (Math.PI * radius * height));
    }
    public float totalArea(){
        return (float) (2 * Math.PI * radius * (height + radius));
    }
}

// P = 2
class rec{
    public int length;
    public int width;

//    Default Constructor
    rec(){
        this.length = 0;
        this.width = 0;
        System.out.println("This is default constructor which has default value as 0.");
    }

//    Constructor with Parameters
    rec(int length, int width){
        this.length = length;
        this.width = width;
        System.out.println("This is parameterized constructor which takes values.");
    }

//    Method to return area
    public float area(){
        return (float) length * width;
    }

//    Method to return perimeter
    public float perimeter(){
        return (float) 2 * (length + width);
    }
}

class cuboid extends rec{
    public int height;

//    Default Constructor
    cuboid(){
        this.length = 0;
        this.width = 0;
        this.height = 0;
        System.out.println("This is  default constructor which has default values." + length + width + height);
    }

//    Constructor with Parameters
    cuboid(int length, int width, int height){
        super(length, width);
        this.height = height;
        System.out.println("This is parameterized constructor which takes values from above class.");
    }
//    Method to return lateralArea
    public float lateralArea(){
        return (float) (2 * height * (length * width));
    }
    //    Method to return totalArea
    public float totalArea(){
        return (float) 2 * (length * width) + (width * height) + (height * length);
    }

//    Method to return volume
    public float volume(){
        return (float) length * width * height;
    }

    //    Method to return perimeter
    public float perimeter(){
        return (float) 4 * (height + length + width);
    }
}

public class Practice_test_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         P = 1
        System.out.print("Enter the radius of the circle: ");
        float radius1 = sc.nextFloat();
        cir1 cr1 = new cir1(radius1);
        System.out.printf("The diameter, Circumference, and Area of the circle is: %.2f, %.2f, and %.2f, respectively.\n", cr1.diameter(), cr1.circumference(), cr1.area());
        System.out.println("the radius of the Cylinder will be taken from the above.");
        System.out.print("Enter the height of the Cylinder: ");
        float height1 = sc.nextFloat();
        cylinder1 cy1 = new cylinder1(radius1, height1);
        System.out.println("The entered height for the cylinder is " + cy1.getHeight());
        System.out.printf("The Volume, Lateral Surface area, and Total surface area of the cylinder are %.2f, %.2f, and %.2f, respectively.\n", cy1.volume(), cy1.lateralArea(), cy1.totalArea());

//        P = 1.1
        System.out.print("Enter the radius of the circle: ");
        float radiusCir2 = sc.nextFloat();
        System.out.println("the radius of the Cylinder will be taken from the above.");
        System.out.print("Enter the height of the Cylinder: ");
        float heightCir2 = sc.nextFloat();
        cir1 cyr1 = new cylinder1(radiusCir2, heightCir2);
        System.out.printf("The diameter, Circumference, and Area of the circle is: %.2f, %.2f, and %.2f, respectively.\n", cyr1.diameter(), cyr1.circumference(), cyr1.area());
        System.out.printf("The Volume, Lateral Surface area, and Total surface area of the cylinder are %.2f, %.2f, and %.2f, respectively.\n", ((cylinder1) cyr1).volume(), ((cylinder1) cyr1).lateralArea(), ((cylinder1) cyr1).totalArea());

//        P = 2
        System.out.print("Enter the length of the rectangle: ");
        int lengthCy1 = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int widthCy1 = sc.nextInt();
        rec rc1 = new rec(lengthCy1, widthCy1);
        System.out.printf("The area of the rectangle is: %.2f & perimeter is %.2f.\n", rc1.area(), rc1.perimeter());
        System.out.println("Cuboid \'s width & length will be accepted as above Rectangle size.");
        System.out.print("Enter the height of the cuboid: ");
        int heightCy1 = sc.nextInt();
        cuboid cbd1 = new cuboid(lengthCy1, widthCy1, heightCy1);
        System.out.printf("The Lateral area, Total area, volume, perimeter are %.2f, %.2f, %.2f, %.2f, respectively.\n", cbd1.lateralArea(), cbd1.totalArea(), cbd1.volume(), cbd1.perimeter());

//        P = 2.1
        System.out.print("Enter the length of the rectangle: ");
        int lengthCy2 = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int widthCy2 = sc.nextInt();
        System.out.println("Cuboid\'s width & length will be accepted from above Rectangle size.");
        System.out.print("Enter the height of the cuboid: ");
        int heightCy2 = sc.nextInt();
        rec rcd1 = new cuboid(lengthCy2, widthCy2, heightCy2);
        System.out.printf("The area for rectangle, Lateral area, Total area, volume, perimeter for cuboid are %.2f, %.2f, %.2f, %.2f, %.2f, respectively.\n", rcd1.area() , ((cuboid) (rcd1)).lateralArea(), ((cuboid) (rcd1)).totalArea(), ((cuboid) (rcd1)).volume(), ((cuboid) (rcd1)).perimeter());
    }
}
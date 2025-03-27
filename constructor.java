import java.util.Scanner;

class const_ways_emp {
    private int constId;
    private String constName;
    public void setConstName(String constName) {
        if (constName.matches(".*\\d+.*")) {
            System.out.println("Error: Name should not contain numbers.");
        } else {
            this.constName = constName;
        }
    }
    public String getConstName() {
        return constName;
    }
    public void setConstId(int constId) {
        this.constId = constId;

    }
    public int getConstId() {
        return constId;
    }
    //    3rd way to use constructor also known as Default Constructor
    public const_ways_emp(){
        constId = 1;
        constName = "Your Name in public constructor: const_way_emp using 3rd way";
    }

//    4th way to use constructor by giving values when object is created.
//    Also called Constructor with Parameters.
    public const_ways_emp(String conName, int conId) {
//    private values = specific constructor parameters' name
        constName = conName;
        constId = conId;
    }
}
public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1st way to use Constructor
//        const_ways_emp cwe = new const_ways_emp();
//        cwe.setConstId(1);
//        cwe.setConstName("Cwe Constructor ");
//        System.out.println(cwe.getConstName()+cwe.getConstId());

//        This is 2nd way to call constructor
//        const_ways_emp cwe1 = new const_ways_emp();
//        System.out.print("Enter the name of the employee : ");
//        cwe1.setConstName(sc.next());
//        System.out.print("Enter the id of the employee : ");
//        while (!sc.hasNextInt()) {
//            System.out.println("Error: Employee ID should be an integer number.");
//            sc.next();
//            System.out.print("Enter the id of the employee : ");
//        }
//        cwe1.setConstId(sc.nextInt());
//        System.out.println("Employee ID : " + cwe1.getConstId() + " Employee Name: " + cwe1.getConstName());

//        3rd way to use Constructor
//        When create new a object, the same name method will invoke, which method doesn't have any return value, it will automatically take.
//        Because having name of the class, it runs automatically & each time it takes constructor's default value like as a default it is used
//        const_ways_emp cwe2 = new const_ways_emp();
//        System.out.println(cwe2.getConstName()+": "+cwe2.getConstId());



//    4th way to use constructor by giving values when object is created.
//        const_ways_emp cwe3 = new const_ways_emp("Ahalpara", 6338);
//        System.out.println(cwe3.getConstName() + " " + cwe3.getConstId());
        System.out.print("Enter the name of the employee : ");
        String name = sc.nextLine();
        System.out.print("Enter the id of the employee : ");
        while (!sc.hasNextInt()) {
            System.out.println("Error: Employee ID should be an integer number.");
            sc.next();
            System.out.print("Enter the id of the employee : ");
        }
        int id = sc.nextInt();
        const_ways_emp cwe4 = new const_ways_emp(name, id);
        System.out.println(cwe4.getConstName()+" : "+cwe4.getConstId());


//        Method overloading also works in constructor by just not giving parameters,
//        it will take default values as per given in above constructor.
        const_ways_emp cwe5 = new const_ways_emp();
        System.out.println(cwe5.getConstName() + cwe5.getConstId());

    }
}
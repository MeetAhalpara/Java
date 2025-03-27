import java.util.Scanner;

class emp {
    private int id;
    private String name;

    public static void setSalary(int i) {

    }

    public void setName(String name) {
        if (name.matches(".*\\d+.*")) {  // Checks if name contains any digit
            System.out.println("Error: Name should not contain numbers.");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if (String.valueOf(id).matches(".*\\d+.*")) {
            this.id = id;
        }else{
            System.out.println("Error: Id should not contain anything than numbers.");
        }
    }

    public int getId() {
        return id;
    }
}

public class getSet {
    public static void main(String[] args) {
//        const_ways_emp ep = new const_ways_emp("Meet", 1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee : ");
//        ep.setName(sc.next());
        System.out.print("Enter the id of the employee : ");
//        ep.setId(sc.nextInt());
    }
}
import java.util.Scanner;

public class getsetlearning {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getsetlearning gsle = new getsetlearning();
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        gsle.setName(name);
        System.out.println("Your name is : " + gsle.getName());
    }
}

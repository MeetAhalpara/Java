public class confusing {
    static int totalCars = 0;
    public confusing() {
        totalCars++;
    }

    static int getTotalCars() {
        return totalCars;
    }

    void drive() {
        System.out.println("Driving the car.");
    }

    public static void main(String[] args) {
        confusing myCar = new confusing();
        System.out.println("Total Cars: " + confusing.getTotalCars());

        confusing anotherCar = new confusing();
        System.out.println("Total Cars: " + confusing.getTotalCars());
        myCar.drive();
    }
}

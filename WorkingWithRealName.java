class Rectangle {
    private float length;
    private float width;

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public Rectangle() {
        this.length = 4;
        this.width = 5;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
}

public class WorkingWithRealName {
    public static void main(String[] args) {
        Rectangle rn = new Rectangle();
        System.out.println("Length: " + rn.getLength()); // Expected output: 4
        System.out.println("Breadth: " + rn.getWidth()); // Expected output: 5
    }
}

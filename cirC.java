public class cirC {
    private float r;

    public float getR() {
        if (r <= 0) {
            System.out.println("As r is invalid, instead of working further, this program will shutdown.");
            System.exit(0);
        }
        return r;
    }

    public void setR(float radius) {
        r = radius;
    }

    public float d() {
        return r * 2;
    }

    public float area() {
        return (float) (3.14 * (r * r));
    }

    public float perimeter() {
        return (float) (2 * (3.14 * r));
    }
}

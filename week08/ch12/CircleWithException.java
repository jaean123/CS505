public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }
        catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }

    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        }
        else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}

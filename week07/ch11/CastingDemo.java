public class CastingDemo {
    public static void main(String[] args) {
        Object obj1 = new Circle(1);
        Object obj2 = new Rectangle(1, 1);
        displayObject(obj1);
        displayObject(obj2);
    }

    public static void displayObject(Object obj) {
        if (obj instanceof Circle) {
            System.out.println("The circle area is " + ((Circle)obj).getArea());
            System.out.println("THe circle diameter is " + ((Circle)obj).getDiameter());
        } else if (obj instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle)obj).getArea());
        }
    }
}
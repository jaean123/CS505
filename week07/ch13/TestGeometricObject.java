public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);

        GeometricObject[] geoObjects = new GeometricObject[3];
        geoObjects[0] = new Circle(3);
        geoObjects[1] = new Rectangle(5, 3);
        geoObjects[2] = new Circle(10);

        displayGeometricObject(geoObjects[0]);
        displayGeometricObject(geoObjects[1]);
        displayGeometricObject(geoObjects[2]);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println(object);
        System.out.println("area: " + object.getArea());
        System.out.println("perimeter: " + object.getPerimeter());
    }
}

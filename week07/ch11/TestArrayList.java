import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities.
        ArrayList<String> cityList=  new ArrayList<>();

        // Add some cities to the list.
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("New York");
        cityList.add("Seoul");
        cityList.add("Paris");

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("Is New York in the list? " + cityList.contains("New York"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        // Insert a new city at index 2
        cityList.add(2, "Los Angeles");

        // Remove a city from list
        cityList.remove("Paris");

        // Display the contents in the list
        System.out.println(cityList.toString());

        // Create a list of Circle objects
        ArrayList<Circle> list = new ArrayList<>();

        // Add circles
        list.add(new Circle(2));
        list.add(new Circle(3));

        // Display the area of the first circle in the list
        System.out.println("The area of circle at index 0 is " + list.get(0).getArea());


    }
}

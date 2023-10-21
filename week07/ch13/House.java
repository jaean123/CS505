import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    public static void main(String[] args) {
        House house1 = new House(1, 1750);
        House house2 = (House)house1.clone();
        System.out.println("house1 == house2 is " + (house1 == house2));  // false
        System.out.println("house1.whenBuilt == house2.whenBuilt " + (house1.whenBuilt == house2.whenBuilt));  // false
    }

    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

//    @Override
//    public Object clone() {
//        try {
//            return super.clone();
//        }
//        catch (CloneNotSupportedException ex) {
//            return null;
//        }
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        House houseClone = (House)super.clone();
//        // Deep copy on Date object
//        houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
//        return houseClone;
//    }

    @Override
    public Object clone() {
        // Perform a shallow copy
        try {
            House houseClone = (House)super.clone();
            // Deep copy on Date object
            houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
            return houseClone;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(House o) {
        if (area > o.area) {
            return 1;
        }
        else if (area < o.area) {
            return -1;
        }
        return 0;
    }
}

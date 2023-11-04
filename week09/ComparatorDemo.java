import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        Stick stick1 = new Stick(1.0);
        Stick stick2 = new Stick(2.0);

        Stick maxUsingComparator = max(stick1, stick2, new StickComparator());

        System.out.println("The length of the larger stick is " + maxUsingComparator.length);

        Stick[] sticks = {
                new Stick(5.0),
                new Stick(2.0),
                new Stick(2.5),
                new Stick(1.0)
        };
        System.out.println("\nsticks[] before sorting:");
        printArray(sticks);
        Arrays.sort(sticks, new StickComparator());
        System.out.println("\nsticks[] after sorting:");
        printArray(sticks);
    }

    public static void printArray(Object[] array) {
        for (Object o: array) {
            System.out.print(o + "\t");
        }
        System.out.println();
    }

    public static Stick max(Stick s1, Stick s2, Comparator<Stick> c) {
        if (c.compare(s1, s2) > 0) {
            return s1;
        }
        return s2;
    }
}

class StickComparator implements Comparator<Stick> {
    @Override
    public int compare(Stick s1, Stick s2) {
        if (s1.length < s2.length) {
            return -1;
        }
        else if (s1.length == s2.length) {
            return 0;
        }
        return 1;
    }
}

class Stick {
    double length;

    public Stick(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "stick length: " + this.length;
    }
}

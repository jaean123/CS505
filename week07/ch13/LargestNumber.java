import java.util.ArrayList;
import java.math.*;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);  // Add an Integer
        list.add(3445.53);  // Add a Double
        list.add(new BigInteger("32342353435264252342456357452345"));  // Add a BigInteger
        list.add(new BigDecimal("3.141592653589793238462643383279502884"));  // Add a BigDecimal

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }

        return number;
    }


}

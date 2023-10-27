import java.io.IOException;

public class Scratch {
    public static void main(String[] args) {
        try {
            method();
        }
        catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }

    public static void method() throws IllegalArgumentException {
        try {
            System.out.println("Attempting to divide by zero");
            divideIntegers1(1, 0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Caught IllegalArgumentException");
            throw ex;
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Statement after try-catch block");
    }

    public static int divideIntegers1(int number1, int number2) throws IllegalArgumentException {
        if (number2 == 0) {
            IllegalArgumentException ex = new IllegalArgumentException("number2 cannot be zero");
            throw ex;
        }
        return number1 / number2;
    }

    public static int addIntegers2(int number1, int number2) throws IllegalArgumentException {
        if (number2 == 0) {
            throw new IllegalArgumentException("number2 cannot be zero");
        }
        return number1 / number2;
    }
}

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch(Exception ex) {
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Cause: " + ex.getCause());
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        }
        catch (Exception ex) {
            throw new Exception("More info from method1", ex);
        }
    }

    public static void method2() throws Exception {
        throw new Exception("Info from method2");
    }
}

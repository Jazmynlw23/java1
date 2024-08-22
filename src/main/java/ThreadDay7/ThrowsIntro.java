package ThreadDay7;

public class ThrowsIntro {

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;

    }

    public static void main(String[] args) {
        try {
            int c = divide(2, 5);
            System.out.println(c);

        } catch (Exception e) {


        }
    }
}
package Exception_Handling;

// throws in exception handling

/* it provides exception to be handled in call section */

class Calculate {
    public void division(int a, int b) throws ArithmeticException {
        int d = a/b;
        System.err.println("d = "+d);
    }
}

public class P04_Throws {
    public static void main(String[] args) {
        Calculate calc = new Calculate();

        try {
            calc.division(0, 0);
        } catch (ArithmeticException e) {
            System.err.println("Divide by Zero is not possible");
        }
    }
}

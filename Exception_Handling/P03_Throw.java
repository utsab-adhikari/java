package Exception_Handling;

// throw is used to throw new exception if we want 

public class P03_Throw {
    public static void main(String[] args) {
        {
            int j=0;
            try {

                if(j==0) {
                    throw new ArithmeticException("Message Will be here");
                }
            } catch(ArithmeticException e) {
                j = 100;
                System.err.println("Cannot divide "+e);
            }
            System.err.println(j);
            System.err.println("Ends here");
        }
    }
}

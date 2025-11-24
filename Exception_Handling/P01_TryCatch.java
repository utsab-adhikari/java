// Basic Example of Try and catch for exception handling;


public class P01_TryCatch
{
	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		try {
		    b = 10/0; // divide by zero : exception
		    System.out.println("Hey There, from try block");

		} catch (Exception e) {
		    System.out.println("Something went wrong, "+e);
            // exception will be handled here
		}
        
		System.out.println(" we got b = "+b);
		System.out.println("Bye there !");
	}
}

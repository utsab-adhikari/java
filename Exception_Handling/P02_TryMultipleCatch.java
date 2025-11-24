
// Basic Example of Try and catch for exception handling;

package Exception_Handling;

public class P02_TryMultipleCatch
{
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
        int num[] = {1, 2, 3, 4, 5};

		try {
		    b = 10/a; 
            System.err.println(num[7]);
		    System.out.println("Hey There, from try block");

		} 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of stack, "+e);

        } catch (Exception e) {
		    System.out.println("Something went wrong, "+e);
		} 

		System.out.println(" we got b = "+b);
		System.out.println("Bye there !");
	}
}

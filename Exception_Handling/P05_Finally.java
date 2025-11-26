
// Basic Example of Try, catch and finally for exception handling;

package Exception_Handling;

public class P05_Finally
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
		} finally {
            System.out.println("This is finally block, I will execute always");
        }

		System.out.println(" we got b = "+b);
		System.out.println("Bye there !");
	}
}

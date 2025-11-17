import java.util.Scanner;
public class P05_SwitchStatement 
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Your Grade: ");
		char grade = sc.nextLine().charAt(0);
		
		switch(grade) {
		    case 'A':
		        System.out.println("Excellent");
		        break;
		        
		    case 'B':
		        System.out.println("Really Good");
		        break;
		    
		    case 'C':
		        System.out.println("Well Done");
		        
		    default :
		        System.out.println("Invalid Grade");
		        
		}
		
		System.out.println("Thank You !");
	}
}
/*Create a class “Account” with two overloaded constructors. The first constructor is used for
initializing the name of account holder, the account number and the initial amount in the
account. The second constructor is used for initializing the name of the account holder, the
account number, the addresses, the type of account and the current balance. The account class
is having methods Deposit(), withdraw(), and Get_Balance(). Make the necessary assumption
for the data members and return types of the methods. Create objects of Account class and use
them. */

package Programs.Lab01;

import java.util.Scanner;


class Account {
    private String accountHolder;
    private int accountId;
    private int ammount;
    private String address;
    
    Account() {
        accountHolder = "";
        accountId = 0;
        ammount = 0;
        address = "";
    }
    
    Account(String aH, int aId, int am, String ad) {
        accountHolder = aH;
        accountId = aId;
        ammount = am;
        address = ad;
    }
    
    public void Deposit() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter Ammount to be Deposited:  ");
        int d_amount = sc.nextInt();
        
        ammount = ammount + d_amount;
        
        System.out.println(d_amount+" is Deposited to your account");
        sc.close();

        
    }
    
    public void Get_Balance() {
        System.out.println("<-- Account Details -->");
        System.out.println("Name: "+accountHolder);
        System.out.println("Balance: "+ammount);
        System.out.println("Address: "+ address);
    }
    
     public void Withdraw() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter Ammount to be Withdrawn:  ");
        int w_amount = sc.nextInt();
        
        ammount = ammount - w_amount;
        
        System.out.println(w_amount+" is Withdrawn from your account");
        sc.close();

        
    }
    
    
    
}

public class P02_BasicAccountSetup
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("\n<-- Enter Details -->");
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Initial Ammount: ");
		int initialAmmount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Address: ");
		String address = sc.nextLine();
		
		Account a1 = new Account(name, 12345, initialAmmount, address);
	
		

		while(true) {
		    System.out.println("\nYou Got the choices --->");
		    System.out.println("1. GetBaance");
		    System.out.println("2. Deposit");
		    System.out.println("3. Withdraw");
		    System.out.println("4. Exit");
		    System.out.print("Select: ");
		    int choice = sc.nextInt();
		
		    switch(choice) {
		        case 1: 
		            a1.Get_Balance();
		            break;
		        
		        case 2: 
		            a1.Deposit();
		            break;
		        
		        case 3: 
		            a1.Withdraw();
		            break;
		        
		        case 4: 
		            System.out.println("\nExiting....");
    		        System.exit(0);
		        
		        default : 
		            System.out.println("\nInvalid Choice");
		    }
		
			sc.close();
	    }
		
	}
}
// User Defined Exception Example
package Exception_Handling;

class NCITexception extends Exception {
    public NCITexception(String str) {
        super(str);
    }
}

public class P06_UserDefinedException {
    public static void main(String arr[]) {
        
        try {
            
            System.out.println("Here we will try to throw NCITexception");
                throw new NCITexception("NCIT Exception Occured -- Message");
                
        } catch (NCITexception e) {
            
            System.out.println("Exception: " + e);
            
        }
        
        System.out.println("End of the program");
        
    }
}
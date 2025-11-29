// Simple Vowel Checker Program in Java
package Programs.Lab01;

import java.util.Scanner;

public class P01_VowelChecker {
    
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Alphabet: ");
        String alphabet = sc.next();
        
        switch(alphabet) {
            case "a": 
                System.out.println("Yes the alphabet is Vowel");
                break;
                
            case "e": 
                System.out.println("Yes the alphabet is Vowel");
                break;
                
            case "i": 
                System.out.println("Yes the alphabet is Vowel");
                break;
                
            case "u": 
                System.out.println("Yes the alphabet is Vowel");
                break;
                    
            default : 
                System.out.println("The Alphabet is Consonant");
               }
        sc.close();
        
        
    }
    
}

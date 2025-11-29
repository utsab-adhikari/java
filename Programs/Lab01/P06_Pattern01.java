//Write a java program to draw following pattern

// pattern printing 
package Programs.Lab01;

public class P06_Pattern01 {
     public static void main(String arr[]) {
        for(int i=0;i<10;i++) {
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

// output: 
/*
  
*  
* *  
* * *  
* * * *  
* * * * *  
* * * * * *  
* * * * * * *  
* * * * * * * *  
* * * * * * * * *  

 */
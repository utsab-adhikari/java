package Basic_Programs;

public class P03_BasicPattern01 {
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
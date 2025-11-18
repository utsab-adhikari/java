package Basic_Programs;

public class P04_BasicPattern02 {
    public static void main(String arr[]) {
        for(int i=0;i<10;i++) {
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=10;j>i;j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

// output:

/*

********** 
 ********* 
  ******** 
   ******* 
    ****** 
     ***** 
      **** 
       *** 
        ** 
         * 

 */
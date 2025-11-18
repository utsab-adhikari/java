// WAP to Calculate Total/sum and average of integer array;

package Basic_Programs;

public class P01_SumAndAverageOfArray {
  
    public static void main(String arr[]) {
        int sum=0, avg;
        int array[] = {10, 20, 30, 40, 50};
        
        for(int num: array) {
            sum = sum + num;
        }
        int n = array.length;
        avg = sum/n;
        
        System.out.println("Total: "+sum);
        System.out.println("Average: "+avg);
    }
}


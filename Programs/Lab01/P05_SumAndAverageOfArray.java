// Write a java program to find sum and average of all elements in an array.

package Programs.Lab01;

public class P05_SumAndAverageOfArray {
  
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


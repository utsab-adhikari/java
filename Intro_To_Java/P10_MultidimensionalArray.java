// Multidimensional array
public class P10_MultidimensionalArray {
     public static void main(String arr[]) {
         
         int[][] nums = {{2,3,4},{1,2,3},{6,5,4}};
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

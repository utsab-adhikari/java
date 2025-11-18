// for each loop
public class P09_ForEachLoop {
    public static void main(String[] args) {
       int i;
       String week[] = {"Sun", "Mon", "Tue", "Thu", "Fri", "Sat"};
       
       for(String day: week) {
           System.out.println(day);
       }
       
       System.out.println("For Loop Ends");
       
    }
}


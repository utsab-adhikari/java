// Basic Example of Map Interface in Java Collection Framework;

package CollectionClassesInterfaces;

import java.util.HashMap;
import java.util.Map;

public class P01_MapInterface {
    public static void main(String srr[]) {
        Map<String, Integer> Student = new HashMap<>();
        /// (key, value)
        Student.put("Utsab", 31);
        Student.put("Hari", 18);
        Student.put("Ram", 41);
        
        System.out.println("\n<--- All --->");
        System.out.println(Student);
        
        System.out.println("\nUtsab's value: "+Student.get("Utsab")); // get(key) called to find value
        
        System.out.println("\nAll KeySets: "+Student.keySet());
        System.out.println("\nAll values: "+Student.values());
        
        System.out.println("\n<--- Key, Value --->");
        
        for(String key: Student.keySet()) {
            System.out.println(key + " : "+Student.get(key));
        }
    }
}
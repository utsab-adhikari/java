package CollectionClassesInterfaces;

import java.util.Set;
import java.util.TreeSet;

public class P02_SetInterface {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        // Adding elements to the Set
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(5); // Duplicate element, will not be added

        // Displaying the Set
        System.out.println("Set elements: " + numbers);

        // Checking if an element exists
        System.out.println("Contains 3? " + numbers.contains(3));
        System.out.println("Contains 7? " + numbers.contains(7));

        // Removing an element
        numbers.remove(2);
        System.out.println("After removing 2: " + numbers);

        // Iterating through the Set
        System.out.println("Iterating through the Set:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

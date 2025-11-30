/*Create a class Distance with private variables feet of type integer and inches of type floating
point. Use suitable constructor and methods for adding and comparing two distance objects.
[Hint 1feet = 12 inch] */

package Programs.Lab01;

class Distance {
    private int feet;
    private float inches;

    public Distance(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Distance add(Distance d) {
        int totalFeet = this.feet + d.feet;
        float totalInches = this.inches + d.inches;

        if (totalInches >= 12) {
            totalFeet += (int)(totalInches / 12);
            totalInches = totalInches % 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    public int compare(Distance d) {
        float thisTotalInches = this.feet * 12 + this.inches;
        float dTotalInches = d.feet * 12 + d.inches;

        if (thisTotalInches > dTotalInches) {
            return 1; 
        } else if (thisTotalInches < dTotalInches) {
            return -1; 
        } else {
            return 0; 
        }
    }

    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class P10_DistanceComparing {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8.5f);
        Distance d2 = new Distance(3, 11.75f);

        Distance sum = d1.add(d2);

        System.out.print("Distance 1: ");
        d1.display();

        System.out.print("Distance 2: ");
        d2.display();

        System.out.print("Sum of distances: ");
        sum.display();

        int comparison = d1.compare(d2);
        if (comparison > 0) {
            System.out.println("Distance 1 is greater than Distance 2.");
        } else if (comparison < 0) {
            System.out.println("Distance 1 is smaller than Distance 2.");
        } else {
            System.out.println("Distance 1 is equal to Distance 2.");
        }
    }
}
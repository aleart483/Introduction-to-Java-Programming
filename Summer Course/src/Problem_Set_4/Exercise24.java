package Problem_Set_4;
import java.util.*;

/**
 * (Order three cities) Write a program that prompts the user
 * to enter three cities and displays them in ascending order.
 */

public class Exercise24 {
    public static void main(String[] args) {
        // Receive desired input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = in.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = in.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = in.nextLine();

        // Compare cities (city with lowest value will be displayed first)
        int c1val = city1.compareToIgnoreCase(city2) + city1.compareToIgnoreCase(city3);
        int c2val = city2.compareToIgnoreCase(city1) + city2.compareToIgnoreCase(city3);
        int c3val = city3.compareToIgnoreCase(city1) + city3.compareToIgnoreCase(city2);

         // Display Cities in Ascending Order
        System.out.println("The three cities in alphabetical order are ");
        if (c1val < c2val) {
            if (c1val < c3val) {
                System.out.println(city1);
                if (c2val < c3val) {
                    System.out.println(city2 + "\n" + city3);
                }
                else {
                    System.out.println(city3 + "\n" + city2);
                }
            }
            else {
                System.out.println(city3 + "\n" + city1 + "\n" + city2);
            }
        }
        else if (c1val < c3val) {
            System.out.println(city2 + "\n" + city1 + "\n" + city3);
        }
        else if (c2val < c3val) {
            System.out.println(city2 + "\n" + city3 + "\n" + city1);
        }
        else {
            System.out.println(city3 + "\n" + city2 + "\n" + city1);
        }
    }
}

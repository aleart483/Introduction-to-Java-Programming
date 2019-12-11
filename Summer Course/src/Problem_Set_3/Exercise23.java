package Problem_Set_3;

import java.util.Scanner;

/**
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter a point (x, y) and checks
 * whether the point is within the rectangle centered at (0, 0) with width 10 and height 5. (Hint: A point is in
 * the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance
 * to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)
 *
 * Here are two sample runs.
 *
 * In1:         Enter a point with two coordinates: 2 2 [Enter]
 * Out1:        Point (2.0, 2.0) is in the rectangle
 *
 * In2:         Enter a point with two coordinates: 6 4 [Enter]
 * Out2:        Point (6.0, 4.0) is not in the rectangle
 */

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = in.nextDouble(), y = in.nextDouble();
        boolean inRectangle = Math.abs(x) <= 10.0/2 && Math.abs(y) <= 5.0/2;
        System.out.println("Point (" + x + ", " + y + ") is" + ((inRectangle) ? "" : " not") + " in the rectangle");
    }
}

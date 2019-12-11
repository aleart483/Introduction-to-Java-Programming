package Problem_Set_3;

import java.util.Scanner;

/**
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a point (x, y) and checks whether
 * the point is within the circle centered at (0, 0) with radius 10.
 *
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. The formula for computing
 * the distance is Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)). Test your program to cover all cases.)
 *
 * Two sample runs are shown below.
 *
 * In1:         Enter a point with two coordinates: 4 5 [Enter]
 * Out1:        Point (4.0, 5.0) is in the circle
 *
 * In2:         Enter a point with two coordinates: 9 9 [Enter]
 * Out2:        Point (9.0, 9.0) is not in the circle
 */

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = in.nextDouble(), y = in.nextDouble();
        boolean inCircle = Math.sqrt(x*x + y*y) <= 10;
        System.out.println("Point (" + x + ", " + y + ") is" + ((inCircle) ? "" : " not") + " in the circle");
    }
}

package Problem_Set_4;
import java.util.*;

/**
 * (Geometry: great circle distance) The great circle distance is the distance between two points on the surface
 * of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. The great
 * circle distance between the two points can be computed using the following formula:
 *
 *          d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 *
 * Write a program that prompts the user to enter the latitude and longitude of two points on the earth in
 * degrees and displays its great circle distance. The average earth radius is 6,371.01 km. Note that you
 * need to convert degrees into radians using the Math.toRadians method since the Java trigonometric methods
 * use radians. The latitude and longitude degrees in the formula are for north and west. Use negative to
 * indicate south and east degrees.
 */

public class Exercise2 {
    public static void main(String[] args) {
        final double EARTH_RADIUS = 6371.01; // in kilometers
        double x1, y1, x2, y2; // latitude and longitude of two points

        // Receive desired input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        x1 = Math.toRadians(in.nextDouble()); y1 = Math.toRadians(in.nextDouble());
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        x2 = Math.toRadians(in.nextDouble()); y2 = Math.toRadians(in.nextDouble());

        // Compute great circle distance based on formula given above
        double distance = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // Display result
        System.out.println("The distance between the two points is " + distance + " km");
    }
}


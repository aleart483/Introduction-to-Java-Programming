package Problem_Set_2;

import java.util.Scanner;

/**
 * (Geometry: area of a triangle) Write a program that prompts the user to enter three points
 * (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. The formula for computing
 * the area of a triangle is
 *                              s = (side1 + side2 + side3) / 2
 *                          area = [s*(s - side1)*(s - side2)*(s - side3)]^(1/2)
 *
 * Here is a sample run:
 *
 * In:          Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4 [Enter]
 * Out:         The area of the triangle is 33.6
 */

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = in.nextDouble(), y1 = in.nextDouble();
        double x2 = in.nextDouble(), y2 = in.nextDouble();
        double x3 = in.nextDouble(), y3 = in.nextDouble();
        double side1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
        double side2 = Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3,2));
        double side3 = Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1,2));
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        System.out.printf("The area of the triangle is %.1f", area);
    }
}

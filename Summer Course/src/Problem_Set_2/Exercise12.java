package Problem_Set_2;

import java.util.Scanner;

/**
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v,
 * you can compute the minimum runway length needed for an airplane to take off using the following formula:
 *                                      length = (v^2) / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a
 * in meters/second squared (m/s2), and displays the minimum runway length.
 *
 * Here is a sample run:
 *
 * In:          Enter speed and acceleration: 60 3.5 [Enter]
 * Out:         The minimum runway length for this airplane is 514.286
 */

public class Exercise12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = in.nextDouble(), a = in.nextDouble();
        double length = (v*v) / (2*a);
        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }
}

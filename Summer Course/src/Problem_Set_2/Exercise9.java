package Problem_Set_2;

import java.util.Scanner;

/**
 * (Physics: acceleration) Average acceleration is defined as the change of velocity divided
 * by the time taken to make the change, as shown in the following formula:
 *                                  a = (v1 - v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second,
 * the ending velocity v1 in meters/second, and the time span t in seconds, and displays the
 * average acceleration.
 *
 * Here is a sample run:
 *
 * In:      Enter v0, v1, and t: 5.5 50.9 4.5 [Enter]
 * Out:     The average acceleration is 10.0889
 */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double v0 = in.nextDouble(), v1 = in.nextDouble(), t = in.nextDouble();
        double a = (v1 - v0) / t;
        System.out.printf("The average acceleration is %.4f", a);
    }
}

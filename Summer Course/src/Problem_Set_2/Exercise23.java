package Problem_Set_2;

import java.util.Scanner;

/**
 * (Cost of driving) Write a program that prompts the user to enter the distance to drive, the fuel efficiency
 * of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 *
 * Here is a sample run:
 *
 * In:          Enter the driving distance: 900.5 [Enter]
 * In:          Enter miles per gallon: 25.5 [Enter]
 * In:          Enter price per gallon: 3.55 [Enter]
 * Out:         The cost of driving is $125.36
 */

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = in.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = in.nextDouble();
        System.out.print("Enter price per gallon: ");
        double ppg = in.nextDouble();
        double cost = distance / mpg * ppg;
        System.out.printf("The cost of driving is $%.2f", cost);
    }
}

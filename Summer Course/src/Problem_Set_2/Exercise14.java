package Problem_Set_2;

import java.util.Scanner;

/**
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.
 * It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 *
 * Here is a sample run:
 *
 * In:          Enter weight in pounds: 95.5 [Enter]
 * In:          Enter height in inches: 50 [Enter]
 * Out:         BMI is 26.8573
 */

public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightPounds = in.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInches = in.nextDouble();
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        double weightKilograms = weightPounds * KILOGRAMS_PER_POUND;
        double heightMeters = heightInches * METERS_PER_INCH;
        double BMI = weightKilograms / (heightMeters * heightMeters);
        System.out.printf("BMI is %.4f", BMI);
    }
}

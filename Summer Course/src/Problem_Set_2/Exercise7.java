package Problem_Set_2;

import java.util.Scanner;

/**
 * (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion),
 * and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
 *
 * Here is a sample run:
 *
 * In:      Enter the number of minutes: 1000000000 [Enter]
 * Out:     1000000000 minutes is approximately 1902 years and 214 days
 */

public class Exercise7 {
    public static void main(String[] args) {
        final int MIN_PER_DAY = 60*24;
        final int DAYS_PER_YEAR = 365;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long min = in.nextLong();
        long days = min / MIN_PER_DAY;
        long years = days / DAYS_PER_YEAR;
        days %= DAYS_PER_YEAR;
        System.out.println(min+ " minutes is approximately " + years + " years and " + days + " days");
    }
}

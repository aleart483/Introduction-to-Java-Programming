package Problem_Set_3;
import java.util.Scanner;
/**
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate
 * the day of the week. The formula is
 *                      h = (q + 26*(m + 1)/10 + k + k/4 + j/4 + 5*j) % 7
 * where
 * h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
 * q is the day of the month.
 * m is the month (3: March, 4: April, …, 12: December). January and February are counted as months 13 and 14
 *      of the previous year.
 * j is the century (i.e., year / 100).
 * k is the year of the century (i.e., year % 100).
 * Note that the division in the formula performs an integer division. Write a program that prompts the user
 * to enter a year, month, and day of the month, and displays the name of the day of the week.
 *
 * Here are some sample runs:
 *
 * In1:         Enter year: (e.g., 2012): 2015 [Enter]
 * In1:         Enter month: 1-12: 1 [Enter]
 * In1:         Enter the day of the month: 1-31: 25 [Enter]
 * Out1:        Day of the week is Sunday
 *
 * In2:         Enter year: (e.g., 2012): 2012 [Enter]
 * In2:         Enter month: 1-12: 5 [Enter]
 * In2:         Enter the day of the month: 1-31: 12 [Enter]
 * Out2:        Day of the week is Saturday
 *
 * (Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the
 * user input 1 to 13 and 2 to 14 for the month and change the year to the previous year.)
 */

public class Exercise21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = in.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = in.nextInt();
        if (m <= 2) {
            year -= 1;
            m += 12;
        }
        int j = year / 100;
        int k = year % 100;
        System.out.print("Enter the day of the month: 1-31: ");
        int q = in.nextInt();
        int h = (q + 26*(m + 1)/10 + k + k/4 + j/4 + 5*j) % 7;
        String weekday = "";
        switch(h) {
            case 0:
                weekday = "Saturday";
                break;
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
        }
        System.out.println("Day of the week is " + weekday);
    }
}

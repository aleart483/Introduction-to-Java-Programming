package Problem_Set_2;

import java.util.Scanner;

/**
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
 * Revise the program so that it prompts the user to enter the time zone offset to GMT and displays the time
 * in the specified time zone.
 *
 * Here is a sample run:
 *
 * In:      Enter the time zone offset to GMT: −5 [Enter]
 * Out:     The current time is 4:50:34
 */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = in.nextInt();

        long milliseconds = System.currentTimeMillis() + (offset * 60 * 60 * 1000);
        long totalSeconds = milliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

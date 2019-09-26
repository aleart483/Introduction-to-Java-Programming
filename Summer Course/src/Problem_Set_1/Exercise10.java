package Problem_Set_1;

/**
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise10 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.6;
        final double SECONDS_PER_HOUR = 3600;
        double distance_in_kilometers = 14;
        double distance_in_miles = distance_in_kilometers / KILOMETERS_PER_MILE;
        double time_in_seconds = 30 + 60*(45);
        double time_in_hours = time_in_seconds / SECONDS_PER_HOUR;
        double avg_speed_in_mph = distance_in_miles / time_in_hours;
        System.out.println("The average speed of a runner who runs " + (int)distance_in_kilometers +
                " km in " + (int)Math.floor(time_in_seconds / 60) + " minutes and " +
                (int)(time_in_seconds % 60) + " seconds is " + String.format("%.3f", avg_speed_in_mph) + " mph.");
    }
}

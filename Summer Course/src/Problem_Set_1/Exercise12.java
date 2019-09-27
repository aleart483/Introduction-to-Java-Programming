package Problem_Set_1;

/**
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise12 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.6;
        final double SECONDS_PER_HOUR = 3600;
        double distance_in_miles = 24;
        double distance_in_kilometers = distance_in_miles * KILOMETERS_PER_MILE;
        double time_in_seconds = (1)*60*60 + 35 + 60*(40);
        double time_in_hours = time_in_seconds / SECONDS_PER_HOUR;
        double avg_speed_in_kmph = distance_in_kilometers / time_in_hours;
        System.out.println("The average speed of a runner who runs " + (int)distance_in_miles +
                " km in " + (int)Math.floor(time_in_seconds / 60 / 60) + " hours, "
                + (int)Math.floor(time_in_seconds / 60) + " minutes and " +
                (int)(time_in_seconds % 60) + " seconds is " + String.format("%.3f", avg_speed_in_kmph) + " kmph.");
    }
}

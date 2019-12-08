package Problem_Set_1;

/**
 * (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *              One birth every 7 seconds
 *              One death every 13 seconds
 *              One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
 * To get an accurate result with the fractional part, one of the values involved in the division
 * must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Exercise11 {
    public static void main(String[] args) {
        int population = 312032486;
        int DAYS_PER_YEAR = 365;
        int SECONDS_PER_DAY = 86400;
        int SECONDS_PER_IMMIGRANT = 45;
        int SECONDS_PER_BIRTH = 7;
        int SECONDS_PER_DEATH = 13;
        double netPopulationChangePerYear = ((1.0/SECONDS_PER_BIRTH) + (1.0/SECONDS_PER_IMMIGRANT) -
                (1.0/SECONDS_PER_DEATH)) * SECONDS_PER_DAY * DAYS_PER_YEAR;

        System.out.println("Current Population: " + population);
        population += (int) netPopulationChangePerYear;
        System.out.println("Population after 1st year: " + population);
        population += (int) netPopulationChangePerYear;
        System.out.println("Population after 2nd year: " + population);
        population += (int) netPopulationChangePerYear;
        System.out.println("Population after 3rd year: " + population);
        population += (int) netPopulationChangePerYear;
        System.out.println("Population after 4th year: " + population);
        population += (int) netPopulationChangePerYear;
        System.out.println("Population after 5th year: " + population);
    }
}

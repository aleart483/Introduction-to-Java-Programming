package Problem_Set_2;

import java.util.Scanner;

/**
 * (Financial application: calculate tips) Write a program that reads the
 * subtotal and the gratuity rate, then computes the gratuity and total.
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate,
 * the program displays $1.5 as gratuity and $11.5 as total.
 *
 * Here is a sample run:
 *
 * In:      Enter the subtotal and a gratuity rate: 10 15 [Enter]
 * Out:     The gratuity is $1.5 and total is $11.5
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = in.nextInt(), gratuityRate = in.nextInt();
        double gratuity = subtotal * (gratuityRate/100.0);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}

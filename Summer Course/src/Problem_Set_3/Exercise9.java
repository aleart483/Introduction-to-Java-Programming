package Problem_Set_3;

import java.util.Scanner;

/**
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits:
 * d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other
 * nine digits using the following formula:
 *      (d1 * 1 + d2 *  2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)  %  11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN
 * (including leading zeros). Your program should read the input as an integer.
 *
 * Here are sample runs:
 *
 * In1:         Enter the first 9 digits of an ISBN as integer: 013601267 [Enter]
 * Out1:        The ISBN-10 number is 0136012671
 *
 * In2:         Enter the first 9 digits of an ISBN as integer: 013031997 [Enter]
 * Out2:        The ISBN-10 number is 013031997X
 */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = in.nextInt();
        int d9 = digits % 10; digits /= 10;
        int d8 = digits % 10; digits /= 10;
        int d7 = digits % 10; digits /= 10;
        int d6 = digits % 10; digits /= 10;
        int d5 = digits % 10; digits /= 10;
        int d4 = digits % 10; digits /= 10;
        int d3 = digits % 10; digits /= 10;
        int d2 = digits % 10; digits /= 10;
        int d1 = digits;
        int d10 = (d1 + d2 *  2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)  %  11;
        String D10 = (d10 == 10) ? "X" : "" + d10;
        String Digits = "" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + D10;
        System.out.println("The ISBN-10 number is " + Digits);
    }
}

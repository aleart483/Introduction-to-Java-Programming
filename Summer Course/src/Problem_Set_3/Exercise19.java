package Problem_Set_3;

import java.util.Scanner;

/**
 * (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes
 * the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if
 * the sum of every pair of two edges is greater than the remaining edge.
 *
 * Here are some sample runs:
 *
 * In1:         Enter the three side lengths of a triangle: 3 4 5 [Enter]
 * Out1:        The perimeter of the triangle is 12
 *
 * In2:         Enter the three side lengths of a triangle: 3 4 7 [Enter]
 * Out2:        The input is invalid
 */

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the three side lengths of a triangle: ");
        int s1 = in.nextInt(), s2 = in.nextInt(), s3 = in.nextInt();
        // check if the sum of each pair is greater than the remaining edge
        if (s1+s2 > s3 && s1+s3 > s2 && s2+s3 > s1)
            System.out.println("The perimeter of the triangle is "+ (s1+s2+s3));
        else
            System.out.println("The input is invalid");
    }
}

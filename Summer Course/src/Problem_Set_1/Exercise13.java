package Problem_Set_1;

/**
 * (Algebra: solve 2  2 linear equations) You can use Cramer’s rule to solve the
 * following 2 x 2 system of linear equation:
 *
 *                          ax + by = e
 *                          cx + dy = f
 *                      x = (ed - bf) / (ad - bc)
 *                      y = (af - ec) / (ad - bc)
 *
 * Write a program that solves the following equation and displays the value for x and y:
 *                      3.4x + 50.2y = 44.5
 *                      2.1x + .55y = 5.9
 */

public class Exercise13 {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        System.out.println("The system of linear equations: ");
        System.out.println("    " + a + "x + " + b + "y = " + e);
        System.out.println("    " + c + "x + " + d + "y = " + f);
        System.out.println("\nThe solution is:\nx = " + x + "\ny = " + y);
    }
}

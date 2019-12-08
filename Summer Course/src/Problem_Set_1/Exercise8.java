package Problem_Set_1;

/**
 * (Area and perimeter of a circle) Write a program that displays the area and
 * perimeter of a circle that has a radius of 5.5 using the following formula:
 *
 *                      perimeter = 2 * radius * PI
 *                      area = radius * radius * PI
 */

public class Exercise8 {
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("A circle with radius: " + radius);
        System.out.println("perimeter: " + perimeter);
        System.out.println("area: " + area);
    }
}

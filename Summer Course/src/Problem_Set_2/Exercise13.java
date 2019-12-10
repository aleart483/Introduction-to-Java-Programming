package Problem_Set_2;

import java.util.Scanner;

/**
 * (Financial application: compound value) Suppose you save $100 each month into a savings account
 * with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
 * After the first month, the value in the account becomes
 *                              100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 *                          (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 *                          (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 *
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value
 * after the sixth month. (In Exercise 5.30, you will use a loop to simplify the code and display the
 * account value for any month.)
 *
 * Here is a sample run:
 *
 * In:          Enter the monthly saving amount: 100 [Enter]
 * Out:         After the sixth month, the account value is $608.81
 */

public class Exercise13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = in.nextDouble();
        double monthlyInterestRate = 0.05/12;
        // after the first month
        double account = monthlySavingAmount * (1 + monthlyInterestRate);
        // after the second month
        account = (account + monthlySavingAmount) * (1 + monthlyInterestRate);
        // after the third month
        account = (account + monthlySavingAmount) * (1 + monthlyInterestRate);
        // after the fourth month
        account = (account + monthlySavingAmount) * (1 + monthlyInterestRate);
        // after the fifth month
        account = (account + monthlySavingAmount) * (1 + monthlyInterestRate);
        // after the sixth month
        account = (account + monthlySavingAmount) * (1 + monthlyInterestRate);
        System.out.printf("After the sixth month, the account value is $%.2f", account);
    }
}

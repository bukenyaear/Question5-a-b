/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;
/**
 *
 * @author Earnest Bukenya
 */
import java.util.Scanner;
public class NumberOperations {
    public static void main(String[] args) {
 // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        // Calculate product, sum, and maximum
        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int maximum = Math.max(Math.max(num1, num2), num3);
        // Print the results in a tabular format
        System.out.println("Product\tSum\tMaximum");
        System.out.println(product + "\t" + sum + "\t" + maximum);
        // Close the scanner
        scanner.close();
    }

}

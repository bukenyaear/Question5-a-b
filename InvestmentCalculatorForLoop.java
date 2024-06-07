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
public class InvestmentCalculatorForLoop {
    public static void main(String[] args) {
	double interestRate = 0.05; // Annual interest rate (5%)
		// Input data
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount in Dollars ($):");
		double principalAmount = myObj.nextInt(); // Read Principal amount in dollars.
		
		System.out.println("Enter the Period of time for example 4 for Four years. ");
		int timePeriod = myObj.nextInt(); // Read Time Period.

        // Calculate the value of investment using a for loop
        double investmentValue = principalAmount;
        for (int year = 1; year <= timePeriod; year++) {
            investmentValue *= (1 + interestRate);
        }
        // Print the result
        System.out.println("The value of investment after " + timePeriod + " years is $" + investmentValue);
	}
}

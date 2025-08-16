/*
===============================================================================
 Title   : Mini Calculator
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates combining Scanner input with arithmetic operations.
===============================================================================
*/

import java.util.Scanner;

public class MiniCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));

        sc.close();

        /*
         Exercises:
         1. Add modulus operation.
         2. Take input as integers and test type conversion.
        */
    }
}

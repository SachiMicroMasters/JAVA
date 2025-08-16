/*
===============================================================================
 Title   : Scientific Notation Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates representing floating-point numbers in scientific notation.
===============================================================================
*/

public class ScientificNotation 
{
    public static void main(String[] args) 
    {
        
        // Declare numbers in scientific notation
        double num1 = 1.23e4;  // 1.23 * 10^4
        double num2 = 5.67e-3; // 5.67 * 10^-3

        // Print numbers
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Using printf with scientific format
        System.out.printf("Scientific format 1: %.2e%n", num1);
        System.out.printf("Scientific format 2: %.3e%n", num2);
    }
}

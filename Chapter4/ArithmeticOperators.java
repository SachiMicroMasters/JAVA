/*
===============================================================================
 Title   : Arithmetic Operators Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates all basic arithmetic operators (+, -, *, /, %) in Java.
===============================================================================
*/

public class ArithmeticOperators 
{
    public static void main(String[] args) 
    {
        
        // Declare integer variables
        int a = 20;
        int b = 7;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int diff = a - b;
        System.out.println("Difference: " + diff);

        // Multiplication
        int prod = a * b;
        System.out.println("Product: " + prod);

        // Division (integer division)
        int div = a / b;
        System.out.println("Division: " + div);

        // Modulus (remainder)
        int mod = a % b;
        System.out.println("Remainder: " + mod);
    }
}

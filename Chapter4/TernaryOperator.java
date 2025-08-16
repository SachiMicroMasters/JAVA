/*
===============================================================================
 Title   : Ternary Operator Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates usage of the ternary operator (? :) for conditional expressions in Java.
===============================================================================
*/

public class TernaryOperator 
{
    public static void main(String[] args) 
    {

        // Declare integer variables
        int a = 25;
        int b = 20;

        // Simple ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum of a and b: " + max);
        // If a > b, max = a; else max = b

        // Nested ternary operator
        int c = 30;
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest among a, b, c: " + largest);

        // Using ternary for assignment
        String result = (b % 2 == 0) ? "Even" : "Odd";
        System.out.println("b is " + result);

    }
}

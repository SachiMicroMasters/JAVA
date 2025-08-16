/*
===============================================================================
 Title   : Multiple Variable Declarations
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates declaring multiple variables in one line and using them.
===============================================================================
*/

public class MultiVarExample 
{
    public static void main(String[] args) 
    {
        
        // Multiple integers declared in one line
        int x = 10, y = 20, z = 30;

        // Multiple doubles declared in one line
        double a = 1.5, b = 2.5, c = 3.5;

        // Using variables in expressions
        double sum = a + b + c;
        int total = x + y + z;

        System.out.println("Sum of doubles: " + sum);
        System.out.println("Sum of integers: " + total);
    }
}

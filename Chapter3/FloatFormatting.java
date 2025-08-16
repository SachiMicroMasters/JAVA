/*
===============================================================================
 Title   : Floating-Point Formatting Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates formatting of floating-point numbers using printf(), 
           including decimal precision.
===============================================================================
*/

public class FloatFormatting 
{
    public static void main(String[] args) 
    {
        
        // Declare a double variable
        double pi = 3.14159265359;

        // Print default formatting (6 decimals by default)
        System.out.printf("Default: %f%n", pi);

        // Print with 2 decimal places
        System.out.printf("2 decimals: %.2f%n", pi);

        // Print with 4 decimal places
        System.out.printf("4 decimals: %.4f%n", pi);
    }
}

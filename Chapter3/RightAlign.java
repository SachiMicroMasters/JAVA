/*
===============================================================================
 Title   : Right Alignment Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates right alignment of floating-point numbers using printf().
===============================================================================
*/

public class RightAlign 
{
    public static void main(String[] args) 
    {
        
        // Declare a double variable
        double value = 123.456;

        // Right aligned with width 10 and 2 decimals
        System.out.printf("Right aligned (width 10): %10.2f%n", value);

        // Right aligned with width 10 and 4 decimals
        System.out.printf("Right aligned (width 10): %10.4f%n", value);
    }
}

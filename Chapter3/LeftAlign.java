/*
===============================================================================
 Title   : Left Alignment Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates left alignment of floating-point numbers using printf().
===============================================================================
*/

public class LeftAlign 
{
    public static void main(String[] args) 
    {
        
        // Declare a double variable
        double value = 123.456;

        // Left aligned with width 10 and 2 decimals
        System.out.printf("Left aligned (width 10): %-10.2f end%n", value);

        // Left aligned with width 10 and 4 decimals
        System.out.printf("Left aligned (width 10): %-10.4f end%n", value);
    }
}

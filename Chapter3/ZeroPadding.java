/*
===============================================================================
 Title   : Zero Padding Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates zero-padding of floating-point numbers using printf().
===============================================================================
*/

public class ZeroPadding 
{
    public static void main(String[] args) 
    {
        
        // Declare a double variable
        double value = 123.456;

        // Right aligned with zeros (width 10, 2 decimals)
        System.out.printf("Zero padded (width 10): %010.2f%n", value);

        // Right aligned with zeros (width 10, 4 decimals)
        System.out.printf("Zero padded (width 10): %010.4f%n", value);
    }
}

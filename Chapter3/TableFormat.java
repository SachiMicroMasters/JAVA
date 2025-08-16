/*
===============================================================================
 Title   : Floating-Point Table Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates formatting multiple floating-point numbers in a table.
===============================================================================
*/

public class TableFormat 
{
    public static void main(String[] args) 
    {
        
        // Declare an array of doubles
        double[] nums = {3.1, 25.6789, 1234.56789};

        // Print table header
        System.out.printf("%-10s %10s%n", "Number", "Formatted");

        // Loop through array and print formatted numbers
        for (double n : nums) {
            System.out.printf("%-10.2f %10.4f%n", n, n);
        }
    }
}

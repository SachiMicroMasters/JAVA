/*
===============================================================================
 Title   : Formatted Output Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates formatted printing using printf() with alignment and precision.
===============================================================================
*/

public class PrintfFormatting 
{
    public static void main(String[] args) 
    {
        int a = 5;
        double b = 12.34567;
        String name = "Sadan";

        // %10s -> string right-aligned with width 10
        // %-10s -> string left-aligned
        // %08d -> integer padded with zeros width 8
        // %.2f -> float with 2 decimal places
        System.out.printf("Name: %-10s Age: %08d Height: %.2f%n", name, a, b);

        /*
         Exercises:
         1. Try different width and precision combinations.
         2. Experiment with left and right alignment.
        */
    }
}

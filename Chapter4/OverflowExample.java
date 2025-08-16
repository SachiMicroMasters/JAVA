/*
===============================================================================
 Title   : Overflow and Underflow Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates overflow and underflow behavior of integer types.
===============================================================================
*/

public class OverflowExample 
{
    public static void main(String[] args) 
    {
        
        byte b = 127; // Maximum value for byte
        System.out.println("Original byte: " + b);

        b++; // Overflow happens here
        System.out.println("After overflow: " + b); // wraps around to -128

        short s = -32768; // Minimum value for short
        System.out.println("Original short: " + s);

        s--; // Underflow happens here
        System.out.println("After underflow: " + s); // wraps around to 32767
    }
}

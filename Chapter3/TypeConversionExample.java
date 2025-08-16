/*
===============================================================================
 Title   : Type Conversion Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates implicit (widening) and explicit (narrowing) type conversions.
===============================================================================
*/

public class TypeConversionExample 
{
    public static void main(String[] args) 
    {
        
        // Implicit conversion (int -> double)
        int numInt = 100;
        double numDouble = numInt; // automatically widened
        System.out.println("Implicit conversion: " + numInt + " -> " + numDouble);

        // Explicit conversion (double -> int)
        double pi = 3.14159;
        int piInt = (int) pi; // manually narrowed
        System.out.println("Explicit conversion: " + pi + " -> " + piInt);

        // Expression with mixed types
        int a = 10;
        double b = 5.5;
        double result = a + b; // a is implicitly converted to double
        System.out.println("Expression result (int + double): " + result);
    }
}

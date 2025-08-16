/*
===============================================================================
 Title   : Type Casting Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates implicit (widening) and explicit (narrowing) type casting.
===============================================================================
*/

public class TypeCastingExample 
{
    public static void main(String[] args) 
    {
        
        // Implicit casting (Widening) - smaller type to larger type
        int i = 100;
        double d = i; // int automatically converted to double

        // Explicit casting (Narrowing) - larger type to smaller type
        double x = 99.99;
        int y = (int) x; // double explicitly converted to int

        System.out.println("Implicit Casting (int → double): " + d);
        System.out.println("Explicit Casting (double → int): " + y);
    }
}

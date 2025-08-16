/*
===============================================================================
 Title   : Relational Operators Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates relational operators (==, !=, >, <, >=, <=) in Java.
===============================================================================
*/

public class RelationalOperators 
{
    public static void main(String[] args) 
    {

        // Declare integer variables
        int a = 15;
        int b = 20;

        // Equal to (==)
        System.out.println(a + " == " + b + " : " + (a == b));

        // Not equal to (!=)
        System.out.println(a + " != " + b + " : " + (a != b));

        // Greater than (>)
        System.out.println(a + " > " + b + " : " + (a > b));

        // Less than (<)
        System.out.println(a + " < " + b + " : " + (a < b));

        // Greater than or equal to (>=)
        System.out.println(a + " >= " + b + " : " + (a >= b));

        // Less than or equal to (<=)
        System.out.println(a + " <= " + b + " : " + (a <= b));
        
        /*
         Exercise:
         Try changing values of a and b to negative numbers, zero, and equal numbers 
         to observe relational operator outputs.
        */
    }
}

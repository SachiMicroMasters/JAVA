/*
===============================================================================
 Title   : Unary Operators Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates unary operators (+, -, ++, --, !) in Java.
===============================================================================
*/

public class UnaryOperators 
{
    public static void main(String[] args) 
    {

        int x = 10;

        // Unary plus (does nothing)
        System.out.println("Unary plus: " + (+x));

        // Unary minus
        System.out.println("Unary minus: " + (-x));

        // Increment operator (pre and post)
        System.out.println("x before increment: " + x);
        System.out.println("Pre-increment: " + (++x));
        System.out.println("Post-increment: " + (x++));

        // Decrement operator (pre and post)
        System.out.println("Pre-decrement: " + (--x));
        System.out.println("Post-decrement: " + (x--));

        // Boolean NOT operator
        boolean flag = true;
        System.out.println("NOT operator: " + (!flag));
    }
}

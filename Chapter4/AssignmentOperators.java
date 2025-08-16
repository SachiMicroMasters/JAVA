/*
===============================================================================
 Title   : Assignment Operators Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates assignment operators (=, +=, -=, *=, /=, %=) in Java.
===============================================================================
*/

public class AssignmentOperators 
{
    public static void main(String[] args) 
    {

        int num = 10;

        // Simple assignment
        System.out.println("Initial value: " + num);

        // Addition assignment
        num += 5;  // Equivalent to num = num + 5
        System.out.println("After +=5: " + num);

        // Subtraction assignment
        num -= 3;  // Equivalent to num = num - 3
        System.out.println("After -=3: " + num);

        // Multiplication assignment
        num *= 2;  // Equivalent to num = num * 2
        System.out.println("After *=2: " + num);

        // Division assignment
        num /= 4;  // Equivalent to num = num / 4
        System.out.println("After /=4: " + num);

        // Modulus assignment
        num %= 3;  // Equivalent to num = num % 3
        System.out.println("After %=3: " + num);
    }
}

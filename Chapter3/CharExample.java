/*
===============================================================================
 Title   : Character Operations Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates char variables, ASCII values, and char-int conversion.
===============================================================================
*/

public class CharExample 
{
    public static void main(String[] args) 
    {
        
        // Declare characters
        char ch1 = 'A';
        char ch2 = 'a';

        // Print characters
        System.out.println("Character 1: " + ch1);
        System.out.println("Character 2: " + ch2);

        // Convert char to int (ASCII value)
        int ascii1 = ch1;
        int ascii2 = ch2;
        System.out.println("ASCII of " + ch1 + " : " + ascii1);
        System.out.println("ASCII of " + ch2 + " : " + ascii2);

        // Character arithmetic
        char nextChar = (char) (ch1 + 1); // Next character in ASCII
        System.out.println("Next character after " + ch1 + " : " + nextChar);
    }
}

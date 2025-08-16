/*
===============================================================================
 Title   : Bitwise Operators Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates bitwise operators (&, |, ^, ~, <<, >>, >>>) in Java.
===============================================================================
*/

public class BitwiseOperators 
{
    public static void main(String[] args) 
    {

        // Declare integer variables
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        // Bitwise AND (&)
        System.out.println("a & b: " + (a & b));
        // 0101 & 0011 = 0001 -> 1

        // Bitwise OR (|)
        System.out.println("a | b: " + (a | b));
        // 0101 | 0011 = 0111 -> 7

        // Bitwise XOR (^)
        System.out.println("a ^ b: " + (a ^ b));
        // 0101 ^ 0011 = 0110 -> 6

        // Bitwise NOT (~)
        System.out.println("~a: " + (~a));
        // ~0101 = 1010 (Two's complement: -6)

        // Left shift (<<)
        System.out.println("a << 1: " + (a << 1));
        // 0101 << 1 = 1010 -> 10

        // Right shift (>>)
        System.out.println("a >> 1: " + (a >> 1));
        // 0101 >> 1 = 0010 -> 2

        // Unsigned right shift (>>>)
        int c = -5;
        System.out.println("c >>> 1: " + (c >>> 1));
        // shifts bits right, fills left with 0 (no sign preservation)

    }
}

/*
===============================================================================
 Title   : Primitive Data Types Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates declaration, initialization, and usage of 
           all primitive data types in Java.
===============================================================================
*/

public class PrimitiveDataTypes 
{
    public static void main(String[] args) 
    {
        
        // 1. Integer data types
        byte b = 100;             // byte: -128 to 127
        short s = 20000;          // short: -32,768 to 32,767
        int i = 100000;           // int: commonly used, 4 bytes
        long l = 10000000000L;    // long: add 'L' for large integers

        // 2. Floating-point data types
        float f = 12.34f;         // float: add 'f' suffix
        double d = 12345.6789;    // double: default for decimals

        // 3. Character data type
        char c = 'A';             // char: single character in single quotes

        // 4. Boolean data type
        boolean flag = true;      // boolean: true/false
        
       
        // Printing all values
        System.out.println("Byte Value     : " + b);
        System.out.println("Short Value    : " + s);
        System.out.println("Int Value      : " + i);
        System.out.println("Long Value     : " + l);
        System.out.println("Float Value    : " + f);
        System.out.println("Double Value   : " + d);
        System.out.println("Char Value     : " + c);
        System.out.println("Boolean Value  : " + flag);
    }
}

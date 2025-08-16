/*
===============================================================================
 Title   : Scanner String Input
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates reading strings using Scanner class.
===============================================================================
*/

import java.util.Scanner;

public class ScannerStringInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();  // Reads word until space

        System.out.println("Hello, " + name + "!");

        sc.close();

        /*
         Exercises:
         1. Use sc.nextLine() to read full name with spaces.
         2. Compare next() vs nextLine() with multi-word input.
        */
    }
}

/*
===============================================================================
 Title   : Number Pyramid Pattern Printer
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 22-Aug-2025
 Purpose : Prints a symmetric number pyramid pattern in two different ways:
           1) Classical Approach   - Uses separate loops for descending and 
                                     ascending sequences.
           2) Mathematical Approach- Uses a formula (1 + |i - j|) to calculate 
                                     values in a single loop.
===============================================================================
*/

import java.util.Scanner;

public class NumberPyramid 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows for the pyramid
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Input: choice of approach
        System.out.print("\nChoose method: Classical(1) or Mathematical(2): ");
        int choice = scanner.nextInt();

        // Classical Approach
        if (choice == 1) 
        {
            for (int i = 1; i <= rows; i++) 
            {
                // Print leading spaces
                for (int j = 1; j <= rows - i; j++) 
                {
                    System.out.print(" ");
                }
                // Print descending numbers
                for (int j = i; j >= 1; j--) 
                {
                    System.out.print(j);
                }
                // Print ascending numbers
                for (int j = 2; j <= i; j++) 
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        } 
        // Mathematical Approach
        else 
        {
            for (int i = 1; i <= rows; i++) 
            {
                // Print leading spaces
                for (int j = 1; j <= rows - i; j++) 
                {
                    System.out.print(" ");
                }
                // Print numbers using formula: num = 1 + |i - j|
                for (int j = 1; j <= 2 * i - 1; j++) 
                {
                    System.out.print(1 + Math.abs(i - j));
                }
                System.out.println();
            }
        }

        scanner.close(); // Close scanner resource
    }
}

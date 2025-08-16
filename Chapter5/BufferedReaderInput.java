/*
===============================================================================
 Title   : BufferedReader String Input
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates reading a line of text using BufferedReader.
===============================================================================
*/

import java.io.*;

public class BufferedReaderInput 
{
    public static void main(String[] args) throws IOException 
    {
        // Create BufferedReader to read from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your full name: ");
        String name = br.readLine();  // Reads entire line

        System.out.println("Welcome, " + name + "!");

        br.close();

        /*
         Exercises:
         1. Read multiple lines in a loop until user types 'exit'.
         2. Compare BufferedReader vs Scanner for string input.
        */
    }
}

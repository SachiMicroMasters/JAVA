/*
    Title   : Introduction to Java - Printing Examples
    Author  : Sadan Asampally
    Date    : 13-Aug-2025
    Place   : Godavarikhani, INDIA
    Purpose : Demonstrate basic Java printing methods (println, print, printf) 
              with full explanation and internal JVM flow.
*/

/* 
1. File name and Class name
   Java is strict here: class name = file name (case-sensitive).
   If your class is named HelloWorld, your file must be HelloWorld.java.
   If names don’t match, the compiler throws:
   Error: class HelloWorld is public, should be declared in a file named HelloWorld.java
   Best practice: Use PascalCase for class names.
*/
public class HelloWorld {

    /*
    2. The main Method
       This is the entry point of any Java application.
       public  → Accessible from anywhere (JVM needs to access it from outside).
       static  → Can be called without creating an object of the class.
       void    → No return value.
       main    → Special method recognized by JVM.
       String[] args → Array to receive command-line arguments.
       💡 Changing this signature (like lowercase s in String) breaks execution.
    */
    public static void main(String[] args) {

        /*
        3a. System.out.println()
            Java-style printing. Adds a newline automatically.
            Example:
                System.out.println("Line 1");
                System.out.println("Line 2");
            Output:
                Line 1
                Line 2
        */
        System.out.println("Hello World! This is Sadan");

        /* 
        3b. System.out.print()
            Prints without adding a newline automatically.
            Example:
                System.out.print("Line 1");
                System.out.print("Line 2");
            Output:
                Line 1Line 2  (Observe no space unless added manually)
        */
        System.out.print("I am here to teach you JAVA!\n");

        /*
        3c. System.out.printf()
            Formatted printing (like C/C++ printf).
            Example:
                System.out.printf("My name is %s and I am working for the last %d years", "Sadan", 25);
            Output:
                My name is Sadan and I am working for the last 25 years
        */
        System.out.printf("Let's join hands and learn together...\n");
    }
}

/*
4. How it Runs Internally (Deep JVM Flow)
   1. Save file as HelloWorld.java
   2. Compile: javac HelloWorld.java  → produces HelloWorld.class (bytecode)
   3. Run   : java HelloWorld         → JVM loads class → finds main() → executes.
*/

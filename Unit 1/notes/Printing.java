/*
Printing is how you get the computer to show you something
First thing you do is define the class
Name of the class must be the same as your program.
*/
public class Printing{
   /*
   Main method is needed for the program to execute your directiomns
   Every opening bracket must have an ending bracket
   Main method goes inside class
   */
   public static void main (String [] args){
   /*
   public - code that others have created that you can use.
   printing is how you get the computer to produce things to you.
   Things that are printed will be in the "Compile Messages" box at the bottom.
   All commands end in a ; (semi-colon).
   */
   
   int counter=0; //compounded definition
   System.out.print(counter);
  
   }
}
/*
HOW TO PRINT THINGS
   1) System.out.print("hello"); --> Prints with cursor on current line
   2) System.out.println("hello"); --> Prints with curor on next line
   You can print empty strings ("") to create space or print and empty line

ERRORS
   Syntax Error: Error in the writing of the program.

DEBUGGING
   When there are errors, complier can't do its job.
   Compiling Code takes .java -> .class
      -Gives line number and error message (sometime helpful, sometimes not)
      
Variables and Data Types
 -A variable is a name associated with a memory location in the computer.
   Different types of viariables take up a different amount of space.
   -PRIMITIVE VARIABLES-
      1) int - Integer
         -EX: 3, -76, 20195
      2) double - any decimal number
         -Used mainly for averages
      3) boolean - true or false
   -OBJECT VARIABLES-
      1) Strings -> any word(s) inside quotes.
      Only object variables are capitalized.
      
THE RULES OF NAMING VARIABLES
   1)Your variables should always start with an alphabetic character
   2)No spaces are allowed in the name
   3)You cannot use any key words that already mean something in Java. Your name can include 
     "String, double, int, etc." but cannot only be these words
   4)Keep your names short if you can.
   5)Always use camelCase (first word lowercase and all following words are uppercase).
   
HOW TO DECLARE A VARIABLE
   1)Determine the type of variable.
   2)Determine the varibale name.
   
INITIATING VARIABLES
  -Means to give it meaning/value.
 Name=value (never the other way around).
   Initializing Together --> Type name=value
      -Looks much cleaner than previous
      
MAKING A VARIABLE FINAL
   If you declare a variable as final, that means that it cannot be changed later.
*/
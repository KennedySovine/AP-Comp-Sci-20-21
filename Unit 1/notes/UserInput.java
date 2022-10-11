import java.util.*;

public class UserInput{
   public static void main (String [] args){
   /*
   Import the "util" packet from java.
   import.java.util.*;     .* imports everything from the package
   
   Scanner name = new Scanner (System.in);
   */
   Scanner owo = new Scanner (System.in); //Inputs and initializes the scanner
   Scanner uwu = new Scanner (System.in);
   /*
   int variableName=scannerName.nextInt();
   String stringName=scannerName.nextLine();
   */
   int integerTest=owo.nextInt();
   System.out.println("You entered the number: " + integerTest);
   
   String stwingTest=uwu.nextLine();
   System.out.println(stwingTest);
   System.out.println(1 * 2 + 3 * 5 % 4);
   }
}
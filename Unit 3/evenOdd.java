import java.util.*;
public class evenOdd{
   public static void main (String [] args){
   
   Scanner userInput = new Scanner(System.in);
   System.out.println("Input a number between 1-99");
   int x = userInput.nextInt();
   
   if (x%2 == 0){
      if (x>50){
      System.out.println("This is a large even number"); 
      }
      else if (x<50){
      System.out.println("This is a small even number");
      }
   }
   else
      System.out.println("This is an odd number");
   }
}
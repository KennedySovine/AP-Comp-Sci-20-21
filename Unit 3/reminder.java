import java.util.*;
public class reminder{
   public static void main (String [] args){
   
   System.out.println("Type in true or false if its raining.");
   Scanner maybeRaining = new Scanner(System.in);
   Boolean isRaining = maybeRaining.nextBoolean();
   
   if (isRaining== true){
      System.out.println("Dont forget an umbrella!");
      }
   System.out.println("Remember: drive carefully!");
   }
}
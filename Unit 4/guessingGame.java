import java.util.*;
public class guessingGame{
   public static void main (String[]args){
   
      Scanner userInput = new Scanner(System.in);
      int randomNumber = (int)(Math.random()*10)+1;
      
      int count=0;
   
      System.out.println("Guess a number between 1-10");
      int numberGuess = userInput.nextInt();
   
      while (numberGuess!=randomNumber){
         if (numberGuess>randomNumber){
            count++;
            System.out.println("The number you guessed was higher than the number");
            System.out.println("Please try again! Guess a number between 1-10");
            numberGuess=userInput.nextInt();
         }
         else{
            count++;
            System.out.println("The number you guessed was lower than the number");
            System.out.println("Please try again! Guess a number between 1-10");
            numberGuess=userInput.nextInt();
         }
      }
   System.out.println("Congrats! You guessed "+randomNumber+" correctly. You guessed "+count+" times.");
   }
}
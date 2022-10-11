import java.util.*;
public class loops {
   public static void main (String [] args){
   
   /*
   Typically while loops are used when you dont know how many times you want the loop to execute.
   A while loop executes the body of the loop for as long as the boolean condition is true.
      -Once the condition becomes false, the loop will stop executing and the code will exit the loop and continue down the line of code.
   If the condition is never true, the loop never executes.
   
   while (condition){
       Statement/Statements here
   }
   
   If there is only one statement, you dont need to use a curly bracket but you should always use one to remeber to always put one.
   
   Loops will sometimes involve a "Control variable" that controls when the loop should stop.
   Typically a counter that controls how many times the loop will repeat.
   */
   
      int count=1;
      while (count<=5){
         System.out.println(count);
         count++;
      }
      int n=365;
      int sum=0;
      while (n>0){
         int digit = n%10;
         sum+=digit;
         n=n/10;
      }
      System.out.println(sum); //14
      
   /*
   Common Errors:
      Infinite Loop: A loop that never stops because the condition always true.
         -This usually occurs when you forget to add a control variable.
      Off by one Error
         -Happens when the loop runs one too many times or one too few times.
         -Happens when you are using the wrong relational operator.
         
         
    For loops are typically used when you know exactly how many times you want the loop to iterate.
    
    variable is typically be i
    
    for(declare and initialize; condition; change){
      Statement(s)
    }
    
    The change in the variable always happens at the end.
    Just like while loops, the condition is re-checked at the beginning every run.
    The variable that is declared and initialized is only known inside the loop.
   
   Loops are often used for String Traversals or String Processing.
      -Code steps through a string character by character
      
   Use a while loops for looking for a string inside of a string.
   Use a for loop if you want to visit every single character in the stirng.
   
   A nested loop is one loop inside of another loop.
   Usually used when you work with 2 dimensions.
   
   When a loop is nested inside another loop, the inner loop will iterate multiple times before the outer loop iterates again.
   */
   }
}
import java.util.*;
public class unit3{
   public static void main (String [] args){
   
   /*
   Greater than:  >
   Greater than or equal to:   >=
   Less than:   <
   Less than or equal to:   <=
   Equivalent:   ==
   Is not Equivalent:   !=
   
   When using these rational operators, they will return a boolean
   */
   
   int age=15;
   int year=14;
   //Prints: false
   System.out.println(age==year);
   year=15;
   //Prints: true
   System.out.println(age==year);
   //Prints: false
   System.out.println(age!=year);
   
   /*
   Positive number:
      -num > 0
   Negative number:
      -num < 0
   Even number:
      -num%2 == 0
   Odd number:
      -num%2 != 0
      -num%2 == 1
   A multiple of int x:
      -num%x == 0
      
   If statements are a way to allow the computer to make decisions between 2 or more choices.
   
   The computer will read the comdition in the if statement. If it is not satisfied, the computer will just move on to the code below.

   if (yourNumber==0){
      return "Your number is positive";
      }
      
   Brakets are not needed after an else statement if its a single line.
   If the if condition is met, it will not even read the else statement.
 
   An "else" option is an if statement that can't have a condition.
   To have another option for your "else" statement, using an "if-else-if" statement.
   An if-else-if statement allows you to have two options, both with conditions.
      */
      
   int grade=82;
   
   if (grade>=90){
      System.out.println("A");
      } else if (grade>=80){
         System.out.println("B");
      } else if (grade>=70){
         System.out.println("C");
      }
    /*
    You can create a "Nested if-statements", which means if statements inside of if statements.
    
    && --> and
      - both conditions to be true for the statement to be read.
    || -->
      - only one needs to be true
      
    Compound boolean evalutations opeate using shot circut evaluation.
    This means that if the computer can figure out if the condition is true or false just by evaluating the first half of the parameter.
    
    DeMorgan's Laws can be used on compound relational operators and single relational operators.
    
    COMPOUND RELATIONAL OPERATORS: Distrubute the not and change the compound sign
      !(a&&b) --> (!a||!b)
      !(a||b) --> (!a&&!b)
   
    RELATIONAL OPERATORS: Remove the not (!) and swich the operator inside.
      == --> !=
      > --> <=
      >= --> <
      < --> >=
      <= --> >
      
    Easier to think of positive conditions rather than negative conditions.
    */
   }
}
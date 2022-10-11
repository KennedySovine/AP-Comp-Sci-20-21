import java.util.*;
public class fortuneTeller{
   public static void main (String [] args){
   
   Scanner fortuneNum = new Scanner (System.in);
   
   System.out.println("Input a number between 1 and 5");
   int a = fortuneNum.nextInt();
   
   if (a==1){
      System.out.println("You will have a good week");
   }
   else if (a==2){
      System.out.println("You will suffer a major loss soon");
   }
   else if (a==3){
      System.out.println("You will die");
   }
   else if (a==4){
      System.out.println("A family member will die");
   }
   else if (a==5){
      System.out.println("Your dog will die");
   }
 }
 }
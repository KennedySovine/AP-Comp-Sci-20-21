import java.util.*;
public class randomArray {
   public static void main (String [] args){
   
      int a=0;
      int b=0;
      int[] nums=new int [5];
   
      for (int i=0; i<nums.length; i++){
         a=(int)(Math.random()*11);
         nums[i] = a;
      }
   
      Scanner input = new Scanner(System.in);
      System.out.println("Guess a number 0-10");
      int e = input.nextInt();
   
      for (int i=0; i<nums.length; i++){
         if (nums[i]==e){
            System.out.println("Congrats, you guessed a number!");
            b=1;
         }
      }
      if (b==0){
         System.out.println("Sorry, your number is not there");
      }
   }
}
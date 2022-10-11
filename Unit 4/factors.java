import java.util.*;
public class factors{
   public static void main (String [] args){
      
      Scanner input = new Scanner (System.in);
      System.out.println("Enter a number to factor (zero to quit) ");
      int n = input.nextInt();
      
      int count=0;
      
      if (n!=0){
         int a=0;
         String b ="";
         String c ="";
         for (int i=n-1; i>1; i--){
            c=i+" ";
            a=n/i;
            if (n%i==0){
               b+=i+" ";
               count++;
            }
         }
         System.out.print("There are "+count+" factors for the number "+n+": "+b);
      }
   }
}
import java.util.*;
public class smallFactorials{
   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
      System.out.println("Enter a number");
      int n = input.nextInt();
   
      int b=n;
      if (n!=0){
         for (int i=n-1; i>0; i--){
            b=b*i;
         }
         System.out.println("The value of "+n+"! is "+b);
      }
   }
}
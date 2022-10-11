import java.util.*;
public class addEven{
   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
      System.out.println("Enter your test value ");
      int n = input.nextInt();
      
      int sum=0;
      int oh=0;
      for (int i=2; sum<n; i--){
         
         sum+=i;
         oh=i;
         i+=3;
 
      }
      System.out.print("The sum of the even integers 0.."+oh+" is >= to "+n);
   }
}
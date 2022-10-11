import java.util.*;
public class Digits{
   public static void main (String [] args){
   
   Scanner input = new Scanner (System.in);
   int num=input.nextInt();
   
   System.out.println("Enter any three (3) digit number");
    //getting 100s digit
   System.out.println((num/100));
   //getting 10s digit
   System.out.println(((num/10)%10));
   //getting 1s digit
   System.out.println( (num%10));
   

   }
}
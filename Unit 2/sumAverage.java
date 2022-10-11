import java.util.*;
public class sumAverage{
   public static void main (String [] args){
   Scanner Input = new Scanner (System.in);
   
   System.out.print("Enter and four(4) digit number:");
   int num=Input.nextInt();
   
   int one=num%10;
   int ten=(num/10)%10;
   int hun=(num/100)%10;
   int thou=(num/1000)%10;
   
   int sum=one+ten+hun+thou;
   int average=(one+ten+hun+thou)/4;
   
   System.out.println("Your number is "+num);
   System.out.println("");
   System.out.println("The sum of the digits is "+sum);
   System.out.println("");
   System.out.println("The average of the digits is "+average);
   }
}
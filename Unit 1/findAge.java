import java.util.*;

public class findAge{
   public static void main (String [] args){
   
   Scanner birthYear = new Scanner(System.in);
   Scanner currentYear = new Scanner(System.in);
   
   System.out.println("Please input your birth year.");
   int bYear=birthYear.nextInt();
   
   System.out.println("Please input the current year.");
   int cYear=currentYear.nextInt();
   
   int Age=0;
   Age = cYear-bYear;
   
   System.out.println("You are " + Age + " years old");
   }
}
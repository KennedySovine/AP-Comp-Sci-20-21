import java.util.*;
public class changeBack{
   public static void main (String [] args){
   Scanner Input = new Scanner (System.in);
   
   System.out.print("Enter purchase price: ");
   double purchase=Input.nextDouble();
   System.out.print("Enter amount recieved: ");
   double recieved=Input.nextDouble();
   double duee=recieved-purchase;
   System.out.println("Change due: "+duee);
   
   
   System.out.println("Dollars: "+(int)duee);
   int owo=(int)duee;
   
   double remaining=duee-(double)owo;
   double uwu=remaining/.25;
   int quarters=(int)uwu;
   System.out.println("Quarters: "+quarters);
   
   double yeet=remaining%.25;
   double iwo=yeet/.10;
   int dimes=(int)iwo;
   System.out.println("Dimes: "+dimes);
   
   double eat=yeet%.10;
   double yet=eat/.05;
   int nickles=(int)yet;
   System.out.println("Nickles: "+nickles);
   
   double oof=eat%.05;
   double yea=oof/.01;
   int pennies=(int)yea;
   System.out.println("Pennies: "+pennies);
   }
}
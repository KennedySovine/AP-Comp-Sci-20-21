import java.util.*;
import java.lang.Math;
public class root{
   public static void main (String [] args){
   Scanner Input = new Scanner (System.in);
   
   System.out.print("Enter A, B, then C: ");
   int A=Input.nextInt();
   int B=Input.nextInt();
   int C=Input.nextInt();
   
  int eet=(-1*(4*A*C));
  double eat=Math.sqrt((B*B)+eet);
  
  double firstRooot=(-B)+(int)eat;
  double firstRoot=firstRooot/(2*A);
  
  double secondRooot=(B*-1)-(int)eat;
  double secondRoot=(int)secondRooot/(2*A);
  
  System.out.println("The roots are: "+firstRoot+", "+secondRoot);
  }
}
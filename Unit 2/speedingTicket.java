import java.util.*;
public class speedingTicket{
   public static void main (String [] args){
   
   Scanner Input = new Scanner (System.in);
   System.out.print("Enter the speed limit:");
   int Limit=Input.nextInt();
   System.out.print("Enter the vehicle speed:");
   
   int speed=Input.nextInt();
   int overSpeed=(speed-Limit)*5;
   double fine=20.00+overSpeed;
   System.out.print("Fine: $"+fine);
   }
}
  
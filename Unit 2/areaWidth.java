import java.util.*;
public class areaWidth{

   public static void main (String [] args){
   Scanner Input = new Scanner (System.in);
   System.out.println("Input the length.");
    int Length=Input.nextInt();
    System.out.println("Input the width.");
    
    int Width=Input.nextInt();
    int area=Length*Width;
    int peri=(Length*2)+(Width*2);
    
    System.out.println("The length is "+Length);
    System.out.println("The width is "+Width);
    System.out.println("The area is "+area);
    System.out.println("The perimeter is "+peri);
    }
} 
import java.util.*;
public class randomRectangle{
   public static void main (String [] args){
   
   //shifts range from 10-20
   int range = (int)((Math.random()*10)+10);
   int rangeTwo = (int)((Math.random()*10)+10);
   
   int length = range;
   int width = rangeTwo;
   int area = length*width;
   int perimeter = (length*2)+(width*2);
   
   System.out.println("Length: "+length);
   System.out.println("Width: "+width);
   System.out.println("Area: "+area);
   System.out.println("Perimeter: "+perimeter);
   }
}
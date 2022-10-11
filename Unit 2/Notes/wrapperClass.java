import java.util.*;
public class wrapperClass{
   public static void main (String [] args){
   /*
   Primitive Data: boolean, double, int
   Sometimes, you will have a method that needs and object as a parameter, but you want to give it a primitive
   data type. 
   Wrapper classes turn primitive data into objects so that you can use it.
   
   -Capitilize the beginning like String.
   Integer i = new Integer(5);
   Double i = new Double(3.5);
   Boolean i = new Boolean(True);
   
   Can be used to find the minimum/maxiumum values for the type
   */
   System.out.println(Integer.MIN_VALUE); //-2147483648
   System.out.println(Integer.MAX_VALUE); //2147483647
   
   System.out.println(Integer.MIN_VALUE-1); //2147483647
   System.out.println(Integer.MAX_VALUE+1); //-2147483648
   //Overflowing --> it all wraps around and takes you to the opposite end.
   /*
   This is handy if you want to initialize a variable to the smalled possible value/largest possible vlaue.
   
   Unboxing: taking the object and tunring it into the primitive for you.

   num.intValue() will get the calue from an Integer object for what an int should be.
   EX:
      Integer num = new Integer(15);
      int n = num.intValue();
   */
   }
}

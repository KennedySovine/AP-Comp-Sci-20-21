import java.util.*;
public class oop {
   public static void main (String [] args){
   int e=1;
   int f=1;

      for (int row=0; row<5; row++){
         for (int coln=0; coln<f; coln++){
            System.out.print(e);
            e++;
         }
         for (int colt=5; colt>f; colt--){
            System.out.print(".");
            
         }
         e=1;
         f++;
         System.out.println();
      }
   }
}
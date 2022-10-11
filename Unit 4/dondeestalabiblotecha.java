import java.util.*;
public class dondeestalabiblotecha {
   public static void main (String [] args){
      int e=1;
      int f=1;
      int k=3;
      
      for (int row=0; row<k; row++){
         for (int col=0; col<f; col++){
            System.out.print(e);
            e++;
         }
         e=1;
         f++;
         System.out.println();
      }
      f=k;
      for (int row=0; row<k; row++){
         for (int col=0; col<f; col++){
            System.out.print(e);
            e++;
         }
         e=1;
         f--;
         System.out.println();
      }
   }
}
import java.util.*;
public class floydsTriangle {
   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
      System.out.print("Enter a number: ");
      int k = input.nextInt();

      int e=1;
      int f=1;
      
      for (int row=0; row<k; row++){
         for (int col=0; col<f; col++){
            System.out.print(e+" ");
            e++;
         }
         f++;
         System.out.println();
      }
   }
}
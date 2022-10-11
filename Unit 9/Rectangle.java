import java.util.*;
public class Rectangle{
   //Instance variables
   private int length;
   private int width;
   
   //Constructors
   public Rectangle(){
      length=2;
      width=6;
   }
   public Rectangle (int length, int width){
      this.length = length;
      this.width = width;
   }
   
   //Methods
   public void draw(){
      for (int w=0; w<width; w++){
         for (int l=0; l<length; l++){
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
   }
}
      
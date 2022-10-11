import java.util.*;
public class inOrderEqual{
      public static boolean inOrderEqual(int a, int b, int c, boolean equalOk){

      if (c>b&&b>a&&equalOk==false){
         return true;
       }
      else if (equalOk==true){
         if (a==b||b==c){
            return true;
            }
         else 
            return false;
         }
      else
         return false;
      
      }
      
      public static void main (String [] args){
         int score =0;
         if (inOrderEqual(2,5,11,false)==true){
            score++;
         } else System.out.print("EX1 is wrong");
         
         if (inOrderEqual(5,7,6,false)==false){
            score++;
         } else System.out.print("EX2 is wrong");
         
         if (inOrderEqual(5,5,7,true)==true){
            score++;
         } else System.out.print("EX3 is wrong");
        
         if(score ==3){
            System.out.print("Code is correct");
         }
      }
   }
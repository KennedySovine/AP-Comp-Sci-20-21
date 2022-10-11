public class less20{
   public static boolean less20(int n){
      if ((n-1)%20==0||(n-2)%20==0){
         return true;
       }
      else if (n%20==0){
         return false;
      }
      else
         return true;
      }
   
   public static void main(String [] args){
      int score =0; 
      if (less20(18)==true){
         score++;
      } else System.out.print("EX1 is wrong");
      
      if (less20(19)==true){
         score++;
      } else System.out.print("EX2 is wrong");
      
      if (less20(20)==false){
         score++;
      } else System.out.print("EX3 is wrong");
      
      if(score ==3){
         System.out.print("Your code works");
      }
   }
}
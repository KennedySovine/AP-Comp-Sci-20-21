public class old35{
   public static boolean old35(int n){
   if (n%3==0 && n%5!=0){
      return true;
      }
   else if (n%3!=0 && n%5==0){
      return true;
      }
   else
      return false;
   }
   
   
   public static void main(String [] args){
      int score =0; 
      if (old35(3)==true){
         score++;
      } else System.out.print("EX1 is wrong");
      
      if (old35(10)==true){
         score++;
      } else System.out.print("EX2 is wrong");
      
      if (old35(15)==false){
         score++;
      } else System.out.print("EX3 is wrong");
      
      if(score == 3){
         System.out.print("Your code is correct!");
       }
    }
}
   
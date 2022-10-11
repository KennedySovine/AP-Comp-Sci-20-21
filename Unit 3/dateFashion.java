public class dateFashion{
   public static int dateFashion(int you, int date){
      
      if (you>=8||date>=8){
         return 2;
         }
      else if (you<=2||date<=2){
         return 0;
         }
      else
         return 1;
   }
   
   public static void main (String[] args){
      int score = 0; 
   
      if (dateFashion(5,10)==2){
        score++;
      } else System.out.println("EX 1 is wrong");
   
       if (dateFashion(5,2)==0){
         score++;
      } else System.out.println("EX 2 is wrong");
      
       if (dateFashion(5,5)==1){
         score++;
      } else System.out.println("EX 3 is wrong");
      
      if (score==3){
         System.out.println("Your code works");
      }
   }
}
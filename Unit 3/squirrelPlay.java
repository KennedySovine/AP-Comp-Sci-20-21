public class squirrelPlay{
   public static boolean squirrelPlay(int temp, boolean isSummer){
   
   if (isSummer==true){
      if (temp>=60&&temp<=100){
         return true;
         }
      else
         return false;
   }
   else if (isSummer==false){
      if (temp>=60&&temp<=90){
         return true;
         }
      else
         return false;
    }
   else
      return false;    
   }
   
   public static void main (String[] args){
      int score = 0;
      if (squirrelPlay(70,false) == true){
         score++;
      } else System.out.print("EX 1 is wrong");
      
       if (squirrelPlay(95,false) == false){
         score++;
      } else System.out.print("EX 2 is wrong");
      
       if (squirrelPlay(95,true) == true){
         score++;
      } else System.out.print("EX 3 is wrong");
      
      if (score ==3){
         System.out.print("Your code works");
      }
   }
}
      
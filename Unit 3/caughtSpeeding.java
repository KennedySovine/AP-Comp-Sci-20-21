public class caughtSpeeding{
   public static int caughtSpeeding(int speed, boolean isBirthday){
     if (isBirthday==false){
       if (speed<=60){
            return 0;
        }
       else if (speed>=61&&speed<=80){
          return 1;
        }
       else
            return 2;
        }
      else{
         if (speed<=65){
            return 0;
        }
       else if (speed>=66&&speed<=85){
          return 1;
        }
       else
            return 2;
   }
}
   
   
   public static void main (String[] args){
      int score = 0; 
      if (caughtSpeeding(60, false)==0){
         score++;
      } else System.out.print("EX 1 is wrong");
      
      if (caughtSpeeding(65, false)==1){
         score++;
      } else System.out.print("EX 2 is wrong");
      
      if (caughtSpeeding(65, true)==0){
         score++;
      } else System.out.print("EX 3 is wrong");
      
      if (score ==3){
         System.out.print("Your code works");
      }
   }
}
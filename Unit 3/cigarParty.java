public class cigarParty {
   public static boolean cigarParty(int cigars, boolean isWeekend){
   if (isWeekend==false){
      if (cigars>=40&&cigars<=60){
         return true;
      }
      else
         return false;
      }
  else{
      if (cigars>=40){
         return true;
      }
      else
         return false;
     }
      }

public static void main (String [] args){
 int score = 0;
   if (cigarParty(30, false) == false){
      score++;
} else System.out.print("Ex 1 doesn't work");
   if (cigarParty(50, false) == true){ score++;
} else System.out.print("Ex 2 doesn't work");
   if (cigarParty(70, true) == true){ score++;
} else System.out.print("Ex 3 doesn't work");
   if (score == 3){
      System.out.print("Code is correct"); }
} 
}
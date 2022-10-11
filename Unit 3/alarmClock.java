public class alarmClock{
   public static String alarmClock(int day, boolean vacation){
      if (vacation==true){
         if (day>=1&&day<=5){
            return "10:00";
         }
         else
            return "off";
      }
      else{
         if (day>=1&&day<=5){
            return "7:00";
         }
         else
            return "10:00";
   }
 }
   
   public static void main (String [] args){
      int score = 0; 
      
      if (alarmClock(1, false).equals("7:00")){
         score++;
      } else System.out.print("EX1 is wrong");
      
        if (alarmClock(5, false).equals("7:00")){
         score++;
      } else System.out.print("EX2 is wrong");
      
        if (alarmClock(0, false).equals("10:00")){
         score++;
      } else System.out.print("EX3 is wrong");
      
      if (score ==3){
         System.out.print("Your code works");
       }
    }
}
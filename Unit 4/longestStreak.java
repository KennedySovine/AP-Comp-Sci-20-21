public class longestStreak{
   public static void longestStreak(String str){
      String owo = "";
      String streak = "";
      int count=0;
      for (int i=0; i<str.length(); i++){
         owo=str.substring(i, i+1);
         if (str.substring(i+1, i+2).equals(owo)){
            count++;
            streak=str.substring(i, i+1);
         }
         else
            count=0;
      }
      System.out.print(streak);
   }
}
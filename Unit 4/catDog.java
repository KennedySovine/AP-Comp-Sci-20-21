public class catDog{
   public static boolean catDog(String str){
      int cato=0;
      int dogo=0;
      
      for (int i=0; i<str.length()-2; i++){
         if(str.substring(i, i+3).equals("cat")){
            cato++;
            }
      }
      for (int i=0; i<str.length()-2; i++){
         if(str.substring(i, i+3).equals("dog")){
            dogo++;
            }
      }
      if (cato==dogo){
         return true;
      }
      else
         return false;
   }
   public static void main (String [] args){
      int count = 0;
      if (catDog("catdog")==true){
         count++;
      }
      if (catDog("catcat")==false){
         count++;
      }
      if (catDog("cat1cadodog")==true){
         count++;
      } 
      if (catDog("catcatodog")==false){
         count++;
      }
      if (count==4){
         System.out.print("Problem is correct");
      } else System.out.print("try again");
   }
}
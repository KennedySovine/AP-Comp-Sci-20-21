public class stringSplosion{
   public static String stringSplosion(String str){
     String oop="";
     int i=1;
     while (i<str.length()){
       oop+=str.substring(0, i);
       i++;
     }
     oop+=str;
     return oop;
   }
   public static void main (String [] args){
      int count =0;
      if (stringSplosion("Code").equals("CCoCodCode")){
         count ++;
      }
      if (stringSplosion("abc").equals("aababc")){
         count ++;
      }
      if (stringSplosion("ab").equals("aab")){
         count ++;
      }
      if (stringSplosion("x").equals("x")){
         count ++;
      }
      if (stringSplosion("fade").equals("ffafadfade")){
         count ++;
      }
      if (stringSplosion("There").equals("TThTheTherThere")){
         count ++;
      }
      if (stringSplosion("Kitten").equals("KKiKitKittKitteKitten")){
         count ++;
      }
      if (stringSplosion("Bye").equals("BByBye")){
         count ++;
      }
      if (stringSplosion("Good").equals("GGoGooGood")){
         count ++;
      }
      if (stringSplosion("Bad").equals("BBaBad")){
         count ++;
      }
      if (count ==10){
         System.out.print("Problem is correct");
      }
      else System.out.print("try again");
   }
}
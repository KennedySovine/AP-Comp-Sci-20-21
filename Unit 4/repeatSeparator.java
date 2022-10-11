public class repeatSeparator{
   public static String repeatSeparator(String word, String sep, int count){
      String totalStr=word;
      if (count>1){
         for (int i=0; i<count-1; i++){
            totalStr+=sep+word;
         }
      }
      else if (count==1){
         totalStr=word;
      }
      else
         totalStr="";
         
      System.out.println(totalStr);
      return totalStr;
   }
   
   public static void main (String [] args){
      int count = 0;
      if (repeatSeparator("Word", "X", 3).equals("WordXWordXWord")){
         count++;
      }
   
      if (repeatSeparator("This", "And", 2).equals("ThisAndThis")){
         count++;
      }
      if (repeatSeparator("This", "And", 1).equals("This")){
         count++;
      }
      if (repeatSeparator("Hi", "-n-", 2).equals("Hi-n-Hi")){
         count++;
      }
      if (repeatSeparator("AAA", "", 1).equals("AAA")){
         count++;
      }
      if (repeatSeparator("AAA", "", 0).equals("")){
         count++;
      }
      if (repeatSeparator("A", "B", 5).equals("ABABABABA")){
         count++;
      }
      if (repeatSeparator("abc", "XX", 3).equals("abcXXabcXXabc")){
         count++;
      }
      if (repeatSeparator("abc", "XX", 2).equals("abcXXabc")){
         count++;
      }
      if (repeatSeparator("abc", "XX", 1).equals("abc")){
         count++;
      }
      if (repeatSeparator("XYZ", "a", 2).equals("XYZaXYZ")){
         count++;
      }
      if (count == 11){
         System.out.print("Problem Correct");
      } else System.out.print("try again");
   }
}
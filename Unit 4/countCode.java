public class countCode{
   public static int countCode(String str){
      int count=0;
      
      for (int i=0; i<str.length()-3; i++){
         if(str.substring(i, i+2).equals("co")&&str.substring(i+3, i+4).equals("e")){
            count++;
            }
      }
      return count;
   }
   public static void main (String [] args){
      int count = 0;
      if (countCode("aaacodebbb")==1){
         count++;
      }
      if (countCode("codexxcode")==2){
         count++;
      }
      if (countCode("cozexxcope")==2){
         count++;
      }
      if (count==3){
         System.out.print("Problem is correct");
      } else System.out.print("try again");
   }
}
public class countXX{
   public static int countXX(String str){
      int i=0;
      while (str.length()>1){
         if (str.substring(0, 2).equals("xx")){
            i++;
            str=str.substring(1);
         }
         else
            str=str.substring(1);
      }
      return i;
   }
   public static void main (String [] args){
      int count = 0;
      if(countXX("abcxx")==1){
         count++;
      }
      if(countXX("xxx")==2){
         count++;
      }
      if(countXX("xxxx")==3){
         count++;
      }
      if(countXX("abc")==0){
         count++;
      }
      if(countXX("Hello there")==0){
         count++;
      }
      if(countXX("Hexxo thxxe")==2){
         count++;
      }
      if(countXX("")==0){
         count++;
      }
      if(countXX("Kittens")==0){
         count++;
      }
      if(countXX("Kittensxxx")==2){
         count++;
      }
      if (count==9){
         System.out.print("Problem is correct");
      } else System.out.print("Try again");
   }
}
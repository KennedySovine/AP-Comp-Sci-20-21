public class doubleChar{
   public static String doubleChar(String str){
          
       String newSub="";
       String totalSub="";
      
      while(str.length()>1){
        newSub= str.substring(0, 1);
        totalSub+=newSub+newSub;
        str=str.substring(1);
        
      }
      totalSub+=str+str;
      return totalSub;
 }
      
   public static void main (String [] args){
      int count= 0;
      if(doubleChar("The").equals("TThhee")){
         count++;
      }
      if (doubleChar("AAbb").equals("AAAAbbbb")){
         count++;
      }
      if (doubleChar("Hi-There").equals("HHii--TThheerree")){
         count++;
      }
      
      if (count==3){
         System.out.print("Problem is correct");
      } else System.out.print("try again");
      
      
   }
}    
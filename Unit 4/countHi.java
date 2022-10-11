public class countHi{
   public static int countHi(String str){
      int counter=0;
      int hiStart=0;
      
      while (str.indexOf("hi")!=-1){
      
         hiStart = str.indexOf("hi");
         counter++;
         str=str.substring(str.indexOf("hi")+2);
            
      }
         return counter;
      }
   
   public static void main (String [] args){
   int count = 0; 
   if (countHi("abc hi ho")==1){
      count++;
   } 
   if (countHi("ABChi hi")==2){
      count ++; 
   } 
   if (countHi("hihi")==2){
      count++;
   }
   if (countHi("hello world")==0){
      count++;
   } 
   if (count==4){
      System.out.print("Problem is correct");
   } else System.out.print("try again");
   
   }
}
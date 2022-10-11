public class repeatFront{
   public static String repeatFront(String str, int n){
   String temp="";
   
   int count=0;
     for (int i=n; i>0; i--){
      temp+=str.substring(0, i);
     }
     return temp;
   }
   
   public static void main (String [] args){
   int count = 0;
   if (repeatFront("Chocolate",4).equals("ChocChoChC")){
      count++;
   }
   if (repeatFront("Chocolate",3).equals("ChoChC")){
      count++;
   }
   if (repeatFront("Ice Cream",2).equals("IcI")){
      count++;
   }
   if (count ==3){
      System.out.print("Problem is correct");
   } else System.out.print("Try again");
}
}
public class Unit10FRQ{
   public static int gcf(int a, int b){
      if (b%a==0){
         return b;
      }
      else
         return gcf(b, a%b);
   }
   
   public static void reduceFraction(int numerator, int denominator){
      if (numerator%denominator==0){
         int reduced=numerator/denominator;
         System.out.print(numerator+"/"+denominator+" reduces to "+reduced);
      }
      else{
         int g = gcf(numerator, denominator);
         System.out.print(numerator+"/"+denominator+" reduces to "+numerator/g+"/"+denominator/g);
      }
   }
}
public class ew{
   public static void recursionMystery10(int x){
      System.out.print(x+" ");
      if (x<=1){
         System.out.print("END ");
      }
      else if (x%2==0){
         recursionMystery10(x/2);
         System.out.print("+ ");
      }
      else{
         System.out.print("[ ");
         recursionMystery10(3*x+1);
         System.out.print("] ");
      }
   }
   public static int recursionMystery3(int n){
      if (n<0){
         return -recursionMystery3(-n);
      }
      else if (n<10){
         return (n+1)%10;
      }
      else{
         return 100*recursionMystery3(n/10)+(n+1)%10;
      }
   }
   public static void main (String[]args){
      System.out.print(recursionMystery3(-790));
   }
}
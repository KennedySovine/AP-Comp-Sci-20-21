public class e{
   public static void recursionMyster2X(int n){
      System.out.print("( ");
      helper(n);
      System.out.print(") ( ");
      helper(n);
      System.out.print(")");
   }
      
   public static void helper (int n){
      if (n <= 1){
         System.out.print(n+" = ");
      }
      else{
         System.out.print((n%2)+" ");
         helper (n/2);
         System.out.print(n+" ");
         n=n-1;
      }
   }

   public static void main (String[]args){
      recursionMyster2X(46);
   }
}
public class APLine{

   private int a;
   private int b;
   private int c;
   
   public APLine (int a, int b, int c){
      this.a=a;
      this.b=b;
      this.c=c;
   }
   
   public double getSlope(){
      return (double)(-a)/b;
   }
   
   public boolean isOnLine(int d, int e){
      int f;
      f=(a*d)+(b*e)+c;
      if (f==0){
         return true;
      }
      return false;
   }

   public static void main (String [] args){
      APLine ch = new APLine (5, 4, -17);
      System.out.print(ch.getSlope());
      System.out.print(ch.isOnLine(5, -2));
   }

}

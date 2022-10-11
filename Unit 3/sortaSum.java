public class sortaSum{
   public static int sortaSum(int a, int b){
    
    int sum=a+b;
    if (sum>=10&&sum<=19){
      return 20;
      }
      else
         return sum;
   }
   
   public static void main (String [] args){
      int score = 0; 
      if (sortaSum(3,4)==7){
         score++;
      } else System.out.print("EX 1 is wrong");
      
      if (sortaSum(9,4)==20){
         score++;
      } else System.out.print("EX 2 is wrong");
      
      if (sortaSum(10,11)==21){
         score++;
      } else System.out.print("EX 3 is wrong");
      
      if (score ==3){
         System.out.print("Your code Works");
      }
   }
}
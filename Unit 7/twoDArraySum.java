public class twoDArraySum{
   public static int rowSum(int[][] arr){
   // fill in code here that adds up all of the elements in the array arr, going row by row. 
      int sum = 0;
      for (int row=0; row<arr.length; row++){
         for (int col=0; col<arr[0].length; col++){
            sum+=(arr[row][col]);
         }
      }
      return sum;
   }
   
   public static int colSum(int [][] arr){
   // fill in code here that adds up all of the elements in the array arr, going col by col.
      int sum = 0;
      for (int col=0; col<arr[0].length; col++){
         for (int row=0; row<arr.length; row++){
            sum+=arr[row][col];
         }
      }
      return sum;
   }
   
   
   // main method will run tests 
   public static void main (String [] args){
      int countRow = 0;
      int countCol=0;
      int [][] a = {{1,2,3}, {4,5,6}};
      int [][] b = {{-4, 8, 12}, {9, 22, -40}, {3, 6, 1}};
      int [][] c = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
      int [][] d = {{1,2,3,4,5,6}, {1,2,3,4,5,6}};
      
      if (rowSum(a)==21){
         countRow++;
      } 
      if (rowSum(b)==17){
         countRow++;
      } 
      if (rowSum(c)==0){
         countRow++;
      } 
      if (rowSum(d)==42){
         countRow++;
      } 
      if (colSum(a)==21){
         countCol++;
      } 
      if (colSum(b)==17){
         countCol++;
      } 
      if (colSum(c)==0){
         countCol++;
      } 
      if (colSum(d)==42){
         countCol++;
      } 
      
      //checking to see if methods are correct
      if (countRow==4){
         System.out.print("Your rowSum method is correct");
      } else System.out.print("Your rowSum method is wrong");
      
      if (countCol==4){ 
         System.out.print("Your colSum method is correct");
      } else System.out.print("Your colSum method is wrong");
     
    }
}
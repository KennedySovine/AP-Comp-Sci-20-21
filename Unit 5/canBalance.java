public class canBalance{
   public static boolean canBalance(int [] nums){
      for (int i=0; i<nums.length; i++){
         if
      }
   }
   public static void main (String [] args){
      int count = 0; 
   int [] arr1= {1,1,1,2,1};
   int [] arr2 = {2,1,1,2,1};
   int [] arr3 = {10,10};
   int [] arr4 = {10,0,1,-1,10};
   int [] arr5 = {1,1,1,1,4};
   int [] arr6 = {2,1,1,1,4};
   int [] arr7 = {2,3,4,1,2};
   int [] arr8 = {1,2,3,1,0,2,3};
   int [] arr9 = {1,2,3,1,0,1,3};
   int [] arr10 = {1};
   int [] arr11= {1,1,1,2,1};


   if(canBalance(arr1)==true){
      System.out.println("Check 1 correct");
      count++;
   } 
   if(canBalance(arr2)==false){
      System.out.println("Check 2 correct");
      count++;
   } 
   if(canBalance(arr3)==true){
      System.out.println("Check 3 correct");
      count++;
   } 
   if(canBalance(arr4)==true){
      System.out.println("Check 4 correct");
      count++;
   } 
   if(canBalance(arr5)==true){
      System.out.println("Check 5 correct");
      count++;
   } 
   if(canBalance(arr6)==false){
      System.out.println("Check 6 correct");
      count++;
   } 
   if(canBalance(arr7)==false){
      System.out.println("Check 7 correct");
      count++;
   } 
   if(canBalance(arr8)==true){
      System.out.println("Check 8 correct");
      count++;
   } 
   if(canBalance(arr9)==false){
      System.out.println("Check 9 correct");
      count++;
   } 
   if(canBalance(arr10)==false){
      System.out.println("Check 10 correct");
      count++;
   } 
   if(canBalance(arr11)==true){
      System.out.println("Check 11 correct");
      count++;
   } 

  
   if (count==11){
      System.out.print("Problem Correct");
   } else System.out.print("Try again");
   }
}
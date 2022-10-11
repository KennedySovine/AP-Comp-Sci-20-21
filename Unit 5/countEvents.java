public class countEvents{
   public static int countEvens(int[] nums){
      int count = 0;
      for (int i = 0; i<nums.length; i++){
         if (nums[i]%2==0){
            count++;
            }
      }
      return count;
   }
   
   public static void main(String [] args){
   int count = 0; 
   int [] arr1= {2,1,2,3,4};
   int [] arr2 = {2,0,2};
   int [] arr3 = {1,3,5};
   int [] arr4 = {};
   int [] arr5 = {11,9,0,1};
   int [] arr6 = {2,11,9,0};
   int [] arr7 = {2};
   int [] arr8 = {2,5,12};
   if(countEvens(arr1)==3){
      System.out.println("Check 1 correct");
      count++;
   } 
   if(countEvens(arr2)==3){
      System.out.println("Check 2 correct");
      count++;
   } 
   if(countEvens(arr3)==0){
      System.out.println("Check 3 correct");
      count++;
   } 
   if(countEvens(arr4)==0){
      System.out.println("Check 4 correct");
      count++;
   } 
   if(countEvens(arr5)==1){
      System.out.println("Check 5 correct");
      count++;
   } 
   if(countEvens(arr6)==2){
      System.out.println("Check 6 correct");
      count++;
   } 
   if(countEvens(arr7)==1){
      System.out.println("Check 7 correct");
      count++;
   } 
   if(countEvens(arr8)==2){
      System.out.println("Check 8 correct");
      count++;
   } 
   if (count==8){
      System.out.print("Problem Correct");
   } else System.out.print("Try again");
   
   }
}
public class has22{
   public static boolean has22(int[] nums){
      for (int i=0; i<nums.length; i++){
         if (nums[i]==2&&nums[i+1]==2){
            return true;
         }
      }
      return false;
   }
   public static void main (String [] args){
   int count = 0; 
   int [] arr1= {1, 2, 2};
   int [] arr2 = {0};
   int [] arr3 = {0,1,2,3,4,5,6,7,8,9};
   int [] arr4 = {};
   int [] arr5 = {0,1};
   int [] arr6 = {0,1,2,3,4,5,6};
   if(has22(arr1)==true){
      System.out.println("Check 1 correct");
      count++;
   } 
   if(has22(arr2)==false){
      System.out.println("Check 2 correct");
      count++;
   } 
   if(has22(arr3)==false){
      System.out.println("Check 3 correct");
      count++;
   } 
   if(has22(arr4)==false){
      System.out.println("Check 4 correct");
      count++;
   } 
   if(has22(arr5)==false){
      System.out.println("Check 5 correct");
      count++;
   } 
   if(has22(arr6)==false){
      System.out.println("Check 6 correct");
      count++;
   } 
   
   if (count==6){
      System.out.print("Problem Correct");
   } else System.out.print("Try again");
   
   }
   }
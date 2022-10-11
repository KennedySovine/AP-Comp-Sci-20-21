public class lucky13{
   public static boolean lucky13(int[] nums){
      for (int i=0; i<nums.length; i++){
         if (nums[i]==1||nums[i]==3){
            return false;
         }
      }
      return true;
   }
   public static void main (String [] args){
    int count = 0; 
   int [] arr1= {0,2,4};
   int [] arr2 = {1,2,3};
   int [] arr3 = {1,2,4};
   int [] arr4 = {2,7,2,8};
   int [] arr5 = {2,7,1,8};
   int [] arr6 = {3,7,2,8};
   int [] arr7 = {2,7,2,1};
   int [] arr8 = {1,2};
   int [] arr9 = {2,2};
   int [] arr10 = {2};
   int [] arr11= {3};
   int [] arr12= {};

   if(lucky13(arr1)==true){
      System.out.println("Check 1 correct");
      count++;
   } 
   if(lucky13(arr2)==false){
      System.out.println("Check 2 correct");
      count++;
   } 
   if(lucky13(arr3)==false){
      System.out.println("Check 3 correct");
      count++;
   } 
   if(lucky13(arr4)==true){
      System.out.println("Check 4 correct");
      count++;
   } 
   if(lucky13(arr5)==false){
      System.out.println("Check 5 correct");
      count++;
   } 
   if(lucky13(arr6)==false){
      System.out.println("Check 6 correct");
      count++;
   } 
   if(lucky13(arr7)==false){
      System.out.println("Check 7 correct");
      count++;
   } 
   if(lucky13(arr8)==false){
      System.out.println("Check 8 correct");
      count++;
   } 
   if(lucky13(arr9)==true){
      System.out.println("Check 9 correct");
      count++;
   } 
   if(lucky13(arr10)==true){
      System.out.println("Check 10 correct");
      count++;
   } 
   if(lucky13(arr11)==false){
      System.out.println("Check 11 correct");
      count++;
   } 
   if(lucky13(arr12)==true){
      System.out.println("Check 12 correct");
      count++;
   } 
  
   if (count==12){
      System.out.print("Problem Correct");
   } else System.out.print("Try again");
   
   }
   }
public class sum13{
   public static int sum13(int[] nums){
      int total=0;
      for (int i=0; i<nums.length; i++){
         if (nums[i]==13){
            i++;
         }
         else
            total+=nums[i];
      }
      return total;
   }
   public static void main (String [] args){
   int count = 0; 
   int [] arr1= {1,2,2,1};
   int [] arr2 = {1,1};
   int [] arr3 = {1,2,2,1,13};
   int [] arr4 = {1,2,13,2,1,13};
   int [] arr5 = {13,1,2,13,2,1,13};
   int [] arr6 = {};
   int [] arr7 = {13};
   int [] arr8 = {13,13};
   int [] arr9 = {13,0,13};
   int [] arr10 = {13,1,13};
   int [] arr11= {5,7,2};
   int [] arr12= {5,13,2};
   int [] arr13= {0};
   int [] arr14= {13,0};
   if(sum13(arr1)==6){
      System.out.println("Check 1 correct");
      count++;
   } 
   if(sum13(arr2)==2){
      System.out.println("Check 2 correct");
      count++;
   } 
   if(sum13(arr3)==6){
      System.out.println("Check 3 correct");
      count++;
   } 
   if(sum13(arr4)==4){
      System.out.println("Check 4 correct");
      count++;
   } 
   if(sum13(arr5)==3){
      System.out.println("Check 5 correct");
      count++;
   } 
   if(sum13(arr6)==0){
      System.out.println("Check 6 correct");
      count++;
   } 
   if(sum13(arr7)==0){
      System.out.println("Check 7 correct");
      count++;
   } 
   if(sum13(arr8)==0){
      System.out.println("Check 8 correct");
      count++;
   } 
   if(sum13(arr9)==0){
      System.out.println("Check 9 correct");
      count++;
   } 
   if(sum13(arr10)==0){
      System.out.println("Check 10 correct");
      count++;
   } 
   if(sum13(arr11)==14){
      System.out.println("Check 11 correct");
      count++;
   } 
   if(sum13(arr12)==5){
      System.out.println("Check 12 correct");
      count++;
   } 
   if(sum13(arr13)==0){
      System.out.println("Check 13 correct");
      count++;
   } 
   if(sum13(arr14)==0){
      System.out.println("Check 14 correct");
      count++;
   } 
   if (count==14){
      System.out.print("Problem Correct");
   } else System.out.print("Try again");
   
   }
   }
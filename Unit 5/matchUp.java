public class matchUp{
   public static int matchUp(int[] nums1, int [] nums2){
      int count=0;
      for (int i=0; i<nums1.length; i++){
         if (nums1[i]-nums2[i]>=-2&&nums1[i]-nums2[i]!=0&&nums1[i]-nums2[i]<=2){
            count++;
         }
      }
      return count;
   }
   public static void main (String [] args){
    int count = 0; 
   int [] arr1= {1,2,3};
   int [] arr2 = {2,3,10};
   int [] arr3 = {1,2,3};
   int [] arr4 = {2,3,5};
   int [] arr5 = {1,2,3};
   int [] arr6 = {2,3,3};
   int [] arr7 = {5,3};
   int [] arr8 = {5,5};
   int [] arr9 = {5,3};
   int [] arr10 = {4,4};
   int [] arr11= {5,3};
   int [] arr12= {3,3};
   int [] arr13 = {5,3};
   int [] arr14= {2,2};
   int [] arr15= {5,3};
   int [] arr16 = {1,1};
   int [] arr17= {5,3};
   int [] arr18= {0,0};
   int [] arr19= {4};
   int [] arr20= {4};
   int [] arr21 = {4};
   int [] arr22= {5};
    if(matchUp(arr1,arr2)==2){
      System.out.println("Check 1 correct");
      count++;
   } 
   if(matchUp(arr3,arr4)==3){
      System.out.println("Check 2 correct");
      count++;
   } 
   if(matchUp(arr5,arr6)==2){
      System.out.println("Check 3 correct");
      count++;
   } 
   if(matchUp(arr7,arr8)==1){
      System.out.println("Check 4 correct");
      count++;
   } 
   if(matchUp(arr9,arr10)==2){
      System.out.println("Check 5 correct");
      count++;
   } 
   if(matchUp(arr11,arr12)==1){
      System.out.println("Check 6 correct");
      count++;
   } 
   if(matchUp(arr13,arr14)==1){
      System.out.println("Check 7 correct");
      count++;
   } 
   if(matchUp(arr15,arr16)==1){
      System.out.println("Check 8 correct");
      count++;
   } 
   if(matchUp(arr17,arr18)==0){
      System.out.println("Check 9 correct");
      count++;
   } 
   if(matchUp(arr19,arr20)==0){
      System.out.println("Check 10 correct");
      count++;
   } 
   if(matchUp(arr21,arr22)==1){
      System.out.println("Check 11 correct");
      count++;
   } 
    if (count==11){
      System.out.print("Problem Correct");
   } else System.out.print("Try again");
   

   }
}
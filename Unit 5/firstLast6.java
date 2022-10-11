public class firstLast6{
   public boolean firstLast6(int[] nums){
   
      int index = nums.length-1;
      int first = nums[0];
      int last = nums[index];
      if (first==6){
         return true;
      }
      if (last==6){
         return true;
      }
      else
         return false;
   }
}
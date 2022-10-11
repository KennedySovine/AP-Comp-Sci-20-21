//Homework Problems not meant to run
int index = nums.length-1;
int first = nums[0];
int last = nums[index];

if(nums.length>=1){
   if(first==last){
      return true;
   }
   else
      return false;
      
//

int firsta = a[0];
int firstb= b[0];
int lasta = a[(a.length-1)];
int lastb = b[(b.length-1)];

if (firsta==firstb){
   return true;
}
else if (lasta==lastb){
   return true;
}
else
   return false;
   
//

int[] rotateLeft = {nums[1], nums[2], nums[0]};

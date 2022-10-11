public class recursion{
      //Recursion is a method that calls itself.
   public static void neverEnd(){
      System.out.println("This is the method that never ends!");
      neverEnd();
   }
      //Example of an infinite recursion
   /*
      Recursion is most helpful when it's used to solve problems where the structure repeats itself.
      Any recursive solution could also be written as a loop.
      
      A call stack is something that Java uses to keep track of what mehtods have been called and what emthods need to be executed.
      
      Every recursive method base case that stops the recursion.
      This is typically an if statement that causes the recursion to stop by giving an answer without having to call the recursive method call.
   */
   //Factorial Method (Base Case EX 1)
   public static int factorial (int n){
      if (n==1){
         return 1;
      }
      else
         return n*factorial(n-1);
   }
  //Base Case EX 2
   public static int bunnyEars(int bunnies){
      if (bunnies == 0){
         return 0;
      }
      else if (bunnies == 1){
         return 2;
      }
      else
         return 2+bunnyEars(bunnies-1);
   }
   //To trace through recursive methods, you have to trace through all of the method calls and then work backwards.
   
   //Base cases for binary search recursion
   int middle = right+left/2;
   if (target==arr[middle];
      return middle;
   }
   if (left>right){
      return -1;
   }
   
   //Recursive calls for binary search recursion
   if (target>arr[middle]){
      recursive(arr, target, middle+1, right);
   }
   else if (target<arr[middle]){
      recursive(arr, target, left, middle-1);
   }
   
   /*
   A merge sort is also known as the divide and conquer algorithm.
   
   Identifying:
      1) mergeSort, mergeSortHelper, merge
      2) The mergeSortMethod is recursive
   
   */
}
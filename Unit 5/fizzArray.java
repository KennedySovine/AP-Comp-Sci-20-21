import java.util.*;
public class fizzArray{
   public static int[] fizzArray(int n){
      int[] array = new int[n];
      for (int i=0; i<array.length; i++){
         array[i]=i;
      }
      return array;
   }
   
   public static void main (String [] args){
   int count = 0; 
   int [] arr1= {0,1,2,3};
   int [] arr2 = {0};
   int [] arr3 = {0,1,2,3,4,5,6,7,8,9};
   int [] arr4 = {};
   int [] arr5 = {0,1};
   int [] arr6 = {0,1,2,3,4,5,6};
   if(Arrays.equals(fizzArray(4),arr1)){
      System.out.println("Check 1 correct");
      count++;
   } 
   if(Arrays.equals(fizzArray(1),arr2)){
      System.out.println("Check 2 correct");
      count++;
   } 
   if(Arrays.equals(fizzArray(10),arr3)){
      System.out.println("Check 3 correct");
      count++;
   } 
   if(Arrays.equals(fizzArray(0),arr4)){
      System.out.println("Check 4 correct");
      count++;
   } 
   if(Arrays.equals(fizzArray(2),arr5)){
      System.out.println("Check 5 correct");
      count++;
   } 
   if(Arrays.equals(fizzArray(7),arr6)){
      System.out.println("Check 6 correct");
      count++;
   } 
   
   if (count==6){
      System.out.print("Problem Correct");
   } else System.out.print("Try again");
   }
}
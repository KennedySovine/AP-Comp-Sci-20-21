import java.util.*;
public class arrays {
   public static void main (String [] args){
   
   /*
   Arrays are blocks of memory that store a collection of data items of the same type under one name.
   
   1-D arrays are more like a train with a bunch of cars behind it.
   You can create an array of any length.
   
   Declaring an array is similar to declaring a single variable
   - int [] scores;
   - double [] averages;
   - boolean [] isRaining;
   - String [] names;
   
   Arrays are objects, so we use the word new when we initialize them
   - scores = new int[5];
   - averages = new double[5];
   - isRaining = new boolean[5];
   - names = new String[5];
   
   You can initialize and declare in one line.
   
   If you dont know the elements you want to put inside of the array yet, but you do know how long to make it:
   - int[] scores = new int[5];
   */
   double[] prices = new double[5];
   String[] items = new String[5];
   /*
   Initializer list
   - int[] scores = {80, 85, 90, 95, 100};
   */
   boolean[] complete = {true, true, false, true};
   String[] names = {"Tom", "Alice", "Sue", "Bob"};
   /*
   When finding the length of an array, use .length with no () at the end.
   
   Assigning/Re-Assigning Elements --> arrayName[index] = value;
   
   If you want to acess an element in an array, type:
      arrayName[index];
      
   System.out.print(arrayName[index]);
   
   Parrallel arrays are 2 or more arrays whose elements are connected through some way and are stores in the same indexes.
   
   Using loops, you use variables as your index.
   
   Start i at 0 so you can access the very first array.
   for(int i = 0; i<arrayName.length; i++){
      System.out.print(arrayName[i]);
   }
   */
   
   int a=0;
   int[] array;
   }
}
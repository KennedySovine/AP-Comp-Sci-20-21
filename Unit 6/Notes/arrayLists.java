import java.util.*;
public class arrayLists {
   public static void main (String [] args){
   
   /*
   Arraylists are a class that has been made in Java, because someone wanted to resize arrays.
   Because they are a class, we use METHODS on them. [object.method(modifier(s))]
   
   Use arrays when you have a group of the same type of objects and there is a finate amount of them.
   Use arraylists when you have a group of the same type of objects and the amount may change.
   
   Have to import java.util.*
   
   ArrayList<Type> name = new ArrayList<Type>();
   Types:
      -int = Integer
      -double = Double
      -String
      -Boolean
      
   Turn an array into an array list: Arrays.asList(arrayname)
   Print entire lists: System.out.print(listname)
   
   .add(object)
      -This will add objects to the back of the list
   .add(index, object)
      -This will add an object as the specific index and shift everything down
   .size()
      -Will give you the size (length) of a list
      -Starts at 0
   .remove(index)
      -Removes the element at the index you provide and move all other items down
   .get(index)
      -Gets the element at the index provided
   .set(index, object)
      -Set certain elements in the list. Like the .add method but it does not shift/increase list size
      
    There are two kinds of searching: linear and binary searching
    Linear starts at the very first element in an array or list and looks through things one by one until it 
      either finds what it was looking for or will search through the entire list, and if it was not found, it 
      will retrun -1.
    Binary can only be used on data that is already sorted in order. Checks the middle of the data to see 
      if that middle value is less than, equal to, or greater than the desired value.
      
    Binary search calculates the middle index as (left+right)/2
    Left starts at 0 and right starts at length-1
    
    
   
   Selection sort selects the smallest item from the current location to the end of the array, and swap it
   with the value at the current position.
   Does this from index 0 to arr.length-2.
   
   Insertion sort starts at index 1 and inserts the valye at index 1 into the correct place in the already sorted part
   (everything to the left of the current index). It moces any value larger than the value storied in temp to the right
   until it either finds the appropriate place to put temp or gets to the front of the array.
   
   
   Ethis
   1) Legally and ethically, you must ask the users for permission to acces and store their data.
   2) If there are data breaches where data is stolen, we inform the affected users.
   */
   
   }
}
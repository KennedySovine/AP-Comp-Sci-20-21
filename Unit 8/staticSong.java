import java.util.*;
public class staticSong{
   //Instance variable
   private static int count;
   
   //Chorus method
   public static void chorus(){
      System.out.println("The ants go marching one by one, hurrah, hurrah");
      System.out.println("The ants go marching one by one, hurrah, hurrah");
      System.out.println("The ants go marching one by one,");
   }
      
    /**
       *@param change: the different lyrics in the song.
   */
   public static void verse(String change){
      System.out.println("The little one stops to " + change);
      System.out.println("And they all go marching down to the ground\n");
    
   }
   
   public static void main (String [] args){
      chorus();
      verse("suck his thumb");
      count++;
      chorus();
      verse("tie his shoe");
      count++;
      chorus();
      verse("climb a tree");
      count++;
      
      System.out.println("Number of verses: "+count);
      
   }
}
import java.util.*;
public class Song{
   //Chorus method
   public void chorus(){
      System.out.println("The ants go marching one by one, hurrah, hurrah");
      System.out.println("The ants go marching one by one, hurrah, hurrah");
      System.out.println("The ants go marching one by one,");
   }
      
    /**
       *@param change: the different lyrics in the song.
   */
   public void verse(String change){
      System.out.println("The little one stops to " + change);
      System.out.println("And they all go marching down to the ground");
   }
   
   public static void main (String [] args){
      Song mySong = new Song();
      
      mySong.chorus();
      mySong.verse("suck his thumb");
      mySong.chorus();
      mySong.verse("tie his shoe");
      mySong.chorus();
      mySong.verse("climb a tree");
   }
}
import java.util.*;
public class digitList {
   public static void main (String[] args){
   
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> oop = new ArrayList<Integer>();
      int e=0;
   
      System.out.println("Input an integer of any size");
      int you = input.nextInt();
   
      while (you!=0){
         e=you%10;
         oop.add(0, e);
         you=you/10;
      }
   }
}
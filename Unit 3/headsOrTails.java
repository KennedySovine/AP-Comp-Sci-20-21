import java.util.*;
public class headsOrTails{
   public static void main (String [] args){
   
   System.out.println("Type in heads or tails");
   Scanner headsTails = new Scanner(System.in);
   String Answer = headsTails.nextLine();
   
   if (Answer.equals("heads")){
      System.out.println("Go out to eat");
   }
   else
      System.out.println("Eat in tonight");
   }
}
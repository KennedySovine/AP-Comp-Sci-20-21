import java.util.*;
public class changeList{
   public static void main (String[] args){
         ArrayList<String> list = new ArrayList<String>();
         
         list.add("Do homework");
         list.add("Help make dinner");
         list.add("Call grandma");
         
         list.set(1, "Order Pizza");
         
         System.out.println(list.size() + " things to do");
         System.out.println("Here's the first thing to do: "+list.get(0));
         
         list.remove(0);
         
         System.out.println("Here's the next thing to do: "+list.get(0));
   }
}
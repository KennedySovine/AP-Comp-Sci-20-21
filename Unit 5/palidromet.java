import java.util.*;
public class palidromet {
   public static void main (String [] args){
   
      String a = "dog God";
      a=a.toLowerCase();
      String temp="";
      
      for (int i=a.length(); i>0; i--){
         a=a.substring(0, i);
         temp+=a.substring(a.length()-1);
      }
      temp=temp.toLowerCase();
      System.out.print(temp);
   }
}
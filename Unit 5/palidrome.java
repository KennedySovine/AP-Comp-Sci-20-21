import java.util.*;
public class palidrome {
   public static void main (String [] args){
   
      String[] a={"Madam", "raceCAR", "", "hi", "A", "Abba", "banana", "dog God"};
      String temp="";
      String oof="";
      boolean yeet=true;
      for (int e=0; e<a.length; e++){
         temp=a[e];
         temp=temp.toLowerCase();
         
         oof="";
         for (int i=temp.length(); i>0; i--){
            temp=temp.substring(0, i);
            oof+=temp.substring(temp.length()-1);
         }
         temp=a[e];
         temp=temp.toLowerCase();
         oof=oof.toLowerCase();
         yeet=temp.equals(oof);
         
         if (temp.length()==0){
            a[e]="";
         }
         else if (yeet){
            a[e]="";
         }
      }
   }
}
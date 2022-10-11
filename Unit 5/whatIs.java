import java.util.*;
public class whatIs {
   public static void main (String [] args){
   
   Scanner input = new Scanner (System.in);
   System.out.println("Pick a number 0-9");
   int uinput = input.nextInt();
   
   String[] country = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
   String[] capital = {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
   String[] language = {"Mandarin", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "No Language"};
   
   System.out.print(country[uinput]+": Its' capital is "+capital[uinput]+" and the language is "+language[uinput]);
   }
}
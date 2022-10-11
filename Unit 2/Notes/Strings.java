import java.util.*;
public class Strings{
   public static void main (String [] args){
   
   /*
    In Java, all strings you create are objects in the String class.
    The String class has already been created and has many methods that can be used.
    
    String name = new String (" ");
    String name = " ";
    */
    
    String greeting = "he";
    greeting+="llo";
    System.out.println(greeting);
    
    /*
    -When you add two strings together, it does not automatically add spaces for you.
    -If you add a number and a string together, the number will be converted to a string, and will no longer have the same type as before.
    
    \" -> escape sequence to print a quote
    \\: -> esccape sequence to print a blackslash (\)
    \n -> escape sequence to move something to a new line.
    
    In Java, Strings, lists, and arays, are all indexed. That means that each letter in the string, or each element in the list/array us assigned to a number.
    
    *ALL INDEXES START AT 0*
    
    .length();
    -Using the .length() method will RETURN the number (int) of characters in a string, including spaces and any special characters in the string.
    -The indices always go from 0 to string.length()-1.
    */
    
    String s1="baby";
    int len = s1.length();
    System.out.println(len);
    //length is 4 but the indecies is 3
    
    /*
    .substing(int from, int to);
    -This method returns a part of a string. The first parameter is the index of the first character of the string, and the second parameter is the index you want the string to go to, 
     but does not include that index.
    
     HELLO WORLD
     string.substring(0,5) ->HELLO
     string.substring(6,11) OR string.substring(8, string.length()) ->WORLD

     -If you do not include a second parameter, the substring will go all the way untik the end.
     -If you try to use this method and you use a number that is greater or less than an index number for your string, you will get an error that reads "Out of Bounds Exception".
      */
    
    String s2 = s1.substring(0,3);
    //Prints bab
    
    /*
   .indexOf(String str)
     -This method's parameter is a string. It returns the starting index (int) of your string within another string. If the parameter string does not exist inside the larger string, the
       method will return a -1
     -Only returns the index of the first instance of the parameter string
    */
    String ello="Hello Helen";
    ello.indexOf("lo"); //would return 3
    ello.indexOf("ASPCSA"); //would retrun -1
    ello.indexOf("He"); //would return 0
  
    /*
   (string1) .compareTo(string2)
    -This method has 2 parameters (2 strings) and is most helpful in comparing complete strings to see if they are the same. It will return type. 
    -If the strings are the same, it will return a 0.
    -If the first string is greater than the second, it will return a number greater than 0 equal to the difference in characters.
    -If the second string is greater than the second, it will return a number less than 0 equal to the difference in characters.
    
    .equals()
    -This method has no parameters. It checks to see if the strings are equal but will return true or false depending on the answer.
    
    *Using these methods on strings does not change the original string, but produces a new one.*
    
    String str; --> null
    If you declare a string without initializing, it will have the value "null".
   */
   }
}
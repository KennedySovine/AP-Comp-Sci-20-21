import java.util.*;
public class Person{
   private String eyeColor;
   private String hairColor;
   private String height;
   
   public Person(){
      eyeColor = "";
      hairColor = "";
      height = "";
   }
   public Person(String eyeC, String hairC, String tall){
      eyeColor = eyeC;
      hairColor = hairC;
      height = tall;
   }
   
   public static void main(String [] args){
      Person John = new Person();
      Person Jane = new Person("Blue", "Brown", "5'5");
   }
}
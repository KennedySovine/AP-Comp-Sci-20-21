import java.util.*;
public class Pet{
   //instance variables
   private String name;
   private int age;
   private double weight;
   private String type;
   
   //Default constructor for a pet object
   public Pet(){
      name="";
      age=0;
      weight=0.0;
      type="";
   }
   /**
      *Default constructor for a pet object
      *Preconditions: parameters initName and initType are strings.
      *Preconditions: parameter initAge is an integer
      *Preconditions: parameter initWeight is a double
      *@param initName the name of the pet
      *@param initAge the age of the pet
      *@param initWeight the weight of the pet
      *@param initType the type of pet
   */
   public Pet(String initName, int initAge, double initWeight, String initType){
      name=initName;
      age=initAge;
      weight=initWeight;
      type=initType;
   }
   
   //Getter methods
   //@return String
   public String getName(){
      return name;
   }
   //@return int
   public int getAge(){
      return age;
   }
   //@return double
   public double getWeight(){
      return weight;
   }
   //@return String
   public String getType(){
      return type;
   }
   
   //Prints out the information for specefied pet
   public String toString(){
      return name+" is a "+type+", "+age+" years old and weighs "+weight+" pounds";
   } 
   
   public static void main (String [] args){
      Pet one = new Pet();
      Pet two = new Pet("Alyna", 2, 8.7, "dog");
      Pet three = new Pet("Nick", 3, 4.5, "cat");
      
      System.out.println(one);
      System.out.println(one.getName()+one.getAge()+one.getWeight()+one.getType());
      System.out.println(two);
      System.out.println(two.getName()+two.getAge()+two.getWeight()+two.getType());
      System.out.println(three);
      System.out.print(three.getName()+three.getAge()+three.getWeight()+three.getType());
   }
}
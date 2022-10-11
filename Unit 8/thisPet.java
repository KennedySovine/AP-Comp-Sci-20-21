import java.util.*;
public class thisPet{
   //instance variables
   private String name;
   private int age;
   private double weight;
   private String type;
   
   //Default constructor for a pet object
   public thisPet(){
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
      *@param name the name of the pet
      *@param age the age of the pet
      *@param weight the weight of the pet
      *@param type the type of pet
   */
   public thisPet(String name, int age, double weight, String type){
      this.name=name;
      this.age=age;
      this.weight=weight;
      this.type=type;
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
   
   public void print(){
      System.out.println(this);
   }
   
   public static void main (String [] args){
      thisPet one = new thisPet();
      thisPet two = new thisPet("Alyna", 2, 8.7, "dog");
      thisPet three = new thisPet("Nick", 3, 4.5, "cat");
      
      one.print();
      two.print();
      three.print();
      
   }
}
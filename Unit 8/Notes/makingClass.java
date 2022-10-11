import java.util.*;
public class makingClass {
   public static void main (String [] args){
      /*
      Classes define new abstract data types
      
      public class ____name_____{
      }
      
      Goes inside the class:
         -Instance Variables
         -Constructors
         -Methods
         -Main Method
      
      Instance variables hold the data for an object.
      Attributes, fields, or properties.
      Go right after the class declaration.
      !!YOU DO NOT INITIALIZE INSTANCE VARIABLES AT THE TOP OF THE CLASS.
      YOU ONLY DECLARE THEM. YOU WILL INITIALIZE THEM IN YOUR CONSTRUCTOR
      METHOD!!!
      
      ~
      
      Methods define what an obkect can do/the behavior of an object.
      Most methods are public, meaning they can be accessed outside of the class.
      Void:
         Do not return anything.
         Write "void"
      Non-void:
         Must return something.
         Write the return type.
      Static:
         Dont need to be called on a specific object
         Write "Static" in header
      Non-Static:
         Needs to be called on a specific object.
         Dont write anything
         
      Parameters are the extra pieces of information the method needs to do its job.
      Each method has access to the instance variables in the class.
      Any extra informaiton would need to be given as a parameter.
      
      public (static/remove space) (void/return type) name (parameters/empty paranthesis)
      Examples:
         public static void print();
         public int nums (int answer);
         public void nums (int answer);
         public static int nums();
         public static int nums(int answer);
      
      ~
      
      Constructors are the first methods in the class.
      Set the initial values for the instance variables because they are only declared at the top
      of the code.
      They need to be initialized so they can be used.
      Always go after you declare the instance variables.
      
      The constructor method MUST have the same name as the class
      
      public className(possibleparameters){
      }
      
      No void/return type or static in the header.
      
      Example: 
         public Person(){
            name="";
            email="";
            phoneNumber="";
         }
         public Person(String initName, String initEmail, String initPhone){
            name = initName;
            email - initEmail;
            phoneNumber = initPhone;
         }
         Person("Joe", "joe@gmail.com", "5555555555"); --> Creates a person
      
      If you create a class with no constrctors written, Java will provide a no-parameter
      default constructor for you.
      int = 0
      double = 0.0
      string = null
      
      className objectName = new constructor(parameters);
      
      Examples:
         Person student = new Person();
         Person student = new Person(String name);
      
      ~
      
      Comments make it easier to read/understand your code.
      //: Single line
      /*: multi line comment
      /**: Documentation Comment.
      
      Documentation comments are often put at the top of the class or before methods.
      Common things to put inside:
         @author : author of the program
         @since : date released
         @version : version of the program
         @param : parameter of a method
         @return : return value for a method
         
      Preconditions are conditions that must be true in order for your code to work.
      Preconditions are what the method assumes is true to do its job.
      Preconditions are normally requirements about parameters.
      Sometimes methods will check for preconditions.
      
      Post conditions are the conditions that are true after the method.
      They describe the outcome of the method.
      
      ~
      
      Acessor Methods = Getter Methods
      Allow you a way to get the vlaue of a private instance variable outside of your class.
      Typically, there is a getter method for each instacne variable in the class.
      
      Example:
      
         //Instance declaration
         private typeOfVar varName;
         //Getter method template
         public typeOfVar getName(){
            return varName;
         }
      
      Common Errors:
         -Forgetting a return type before the method name
         -putting the incorrect return type
         -Forgettubg to use "return" inside the method
         
      The toString() method is a method you create in your class, but you don't directly call.
      Returns a String description of all of your instance variables.
      If you try to print your object, this method is automatically called by the computer to 
      print all instance variables.
      
      public String toString(){
         return id+": "+name+", "+email;
      }
      
      ~
      
      For each getter method there is a setter method to change the value
      of a private instance variable.
      
      They are void methods, so they do not return something, they just change something.
      
      Always have a parameter that is the new value of the instance variable.
      
      public void setVarName (typeOfVar newValue){
         varName = newValue;
      }
      
      ~
      
      Why write methods?
      1) Reduce redunancy
      2) Reduce risk of error
      3) Helps organize your code
      4) Allows you to break a large task into small sections
      
      Steps
      1) Write your method in your code above your main method.
      2) Create an instance of the class (an object) in the main method.
      3) Call the method on your object
      
      ~
      
      We can make methods even more useful by giving parameters for the methods that allow us to customize 
      certain parts of our code.
      
      When you create your own method, the variables you define for it in the method header are called formal
      parameters.
      
      When you actually call the method to do its job, those are called arguments or actual parameters.
      
      Java used Call By Value to pass arguments to methods.
         A copy of the value in the argument is saved in the parameter variable. If the parameter variable changes
         its value inside the method, the original value outside the method is not changed.
      
      ~
      
      Static variables and methods belong to the CLASS and are not called on a specific object.
      There is only one copy of static variables for the whole class, rather than with the instance
         variables, where each object has their own copy of the variable.
      
      Same class:
         public static void main (String [] args){
            System.out.print(variableName);
            methodName(parameters);
         }
         
     Different class:
        public static void main (String [] args){
           System.out.print(className.variableName);
           className.methodName(parameters);
        }
        
     Static methods only have access to static variables and static methods.
     Static methods cannot access or change the values of instance variables, but they can access or change
      the values of static variables.
      
     ~
     
     The scope of a variable describes where the variable can be accessed or used.
     It is determined by where the variable is declared.
     
     Levels of scope:
        1) Class level
           -The entire class has access to it
        2) Method level
           -Variables declared inside of a method
           -Parameter variables
        3) Block level
           -Variables declared inside of a loop
      
      ~
           
     The this. keyword is mostly used by programmers to distinguish between variables.
     They do this when the formal parameter has the same name as an instance variable.
     
     private String name;
     
     public Person (String name){
        //Set this object instance variable name to the parameter variable name
        this.name=name;
     }
     
     You can use the this. keyword to represent an object.
     
     public void doSomethign(){
        System.out.println(this);
     }
     
     c.doSomething();
      */
   }
}
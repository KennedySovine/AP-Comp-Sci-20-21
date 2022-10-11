public class inheritance {
   public static void main (String[]args){
   
   /* In java, all classes can inherit attributes (instance variables) and behaviors (methods) from other classes.
   Parent class is the class that is being inherited FROM
      -Superclass
   Child class is the class that is inheriting things
      -Subclass
   
   1) Inheritance allows you to reuse data and behavior frrom a parent class.
   2) If you notice several classes share the same data/behavior, you can pull that out to a parent class so
       you dont have to rewrite a bunch of times.
   
   public class Car extends Vehicle //Parent class comes after extends.
   public class Motorcycle extends Vehicle.
   //Classes can have only 1 parent class.
   
   Use Has-a to see if something should inherit another class or just be an attribute.
      See if it has a has-a relationship. If so, it should be an attribute. Not inherit
   Use Is-a to see if something shouild inherit another class or just be an attrivute
      See if it has a is-a relationship. If so, then it should inherit.
   
   ~
   
   Subclasses cannot directly access the instance variables and constructors are not inherited.
   
   You can xall the constructor from the parent constructor by calling super(); or super(parameters); as the
   FIRST line in the constructor.
   */
   public class Employee extends Person{
      public Employee(){
         super(); //Calls the Person() constructor
      }
      public Employee(String theName){
         super(theName); //Calls Person(theName) constructor
      }
   }
   /*
   Overriding is when you modify an existing inherited method.
   To override a method, you have to provide a public method in the subclass with THE SAME method signiture.
      -toString() method is a common override method.
   
   Overloading a method is when several methods have the same name but the parameter types, order, or number 
   are different.
   
   Since instance variables are private, then you cannot directly access them, so you must use the getter and setter
   methods in the subclasses.
   
   2 ways to use the Super Keyword:
      1) In constructors
      2) In methods to call the superclass method
         -super.methodName();
         
   If you add an instance variable in your subclass, you may want to change the toString method to include the new
   variables.
   
   public String toString(){
      return super.toString()+"\n"+subclassInstnaceVariables;
   }
   
   With classes that inherit each other, you always look to find a method in the CLASS WHERE THE OBJECT WAS
    CREATED. If you don't find the method, you look in the parent class and find that. If it's not there, you keep going
    up the chain until you find it.
   Find out where the object was created by looking at what constructor was used.
   
   
   If you have multiple subclasses inherit from a superclass, you can form an inheritance hierarchy.
   Every subclass has an "is-a" relationship with the superclass.
   The class object is at the top of every heirarchy.
   
   Shape s1 = new Shape();
   Shape s2 = new Rectangle();
   Shape s3 = new Square();
   You cannot do Square q = new Shape();
   
   You can write methods with parameters of type Shape and be ableto put any shape you want.
   public void hello (Rectangle name) --> Only rectangle
   public void hello (Shape hello) --> Use any shape you want
   
   We can have an array of type Shape and use them to store any of its subclasses.
   Rectangle [] names --> Only store Rectangles
   Shapes [] names --> Any shape you want
   
   
   In java, an object variable has two different types: A declared type and an actual type.
   Declared type is the type that is used in the declaration
      Shape p = new Rectangle();
   The actual type is the class that actually creates the object using the keyword "new"
   
   When run is selected, the computer will check if the declared type has the methods or inherits the methods being
   used in the code and give an error if it doesn't find the method or methods.
      Shape p = new Rectangle();
   If you call p.fill(), the computer will have first checked if the Shape class has the method fill when you press the
   turn button. If it doesn't, it will not compile. HOWEVER, when the actual call of p.fill() is made, the computer will
   look in the Rectangle class for the method.
   
   The Object class is the superclass of all other classes in Java. If a parent class isn't specified using the entends
   keyword, the class will inherit from the Object class.
   
   The toString method is a very commonly overridden method. The reason that java can create a toString method
   for you if you haven't created one is because there is already one in the Object class.
   
   The .equals method is one of the most important method is one of the most important methods inherited from the
   object superclass.
   The equals method from the object class compares if two objects are equal. (In the same storage place)
   The string class overrides the equals method in the object class, which is why it works differently on strings.
   
   How to override the equals method
      1) Use the *public boolean equals (Object other)* method signature
      2) Type cast other to your Classname
      3) Return whether this object's attribute(s) equals the other object's attribute(s) with == for primitive types like
          int and double, or equals for reference types like String or another class.
   */
   public boolean equals (Object other){
      //Step 2
      Classname otherObj = (Classname) other;
      //Check if attributes are equal
      return (this.attribute == otherObj.attribute);
      //or this.attribute.equals(otherObj.attribute) if attribute is a String.
   }
}
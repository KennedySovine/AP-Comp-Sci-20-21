public class Customer{
   //Instance Variables
   private String name;
   private String address;
   
   //Constructor
   public Customer(String name, String address){
      this.name=name;
      this.address=address;
   }
   
   //Methods
   public String toString(){
      return name+" lives at "+address;
   }
}
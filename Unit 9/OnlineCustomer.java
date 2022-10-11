public class OnlineCustomer extends Customer{
   //Instance variable
   private String email;
   
   //Constructor
   public OnlineCustomer(String name, String address, String email){
      super(name, address);
      this.email=email;
   }
   
   public String toString(){
      String temp = super.toString();
      return temp+" ("+email+")";
   }
}
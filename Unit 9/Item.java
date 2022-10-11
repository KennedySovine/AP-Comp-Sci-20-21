public class Item extends ShoppingCart{
   private String Name;
   private double Price;
   
   public Item(String name, double price){
      this.Name=name;
      this.Price=price;
   }
  
   public String getName(){
      return Name;
   }
   public double getPrice(){
      return Price;
   }
   public void setName(String name){
      Name=name;
   }
   public void setPrice(double price){
      Price=price;
   }
   public String toString(){
      return Name+": "+Price;
   }
}
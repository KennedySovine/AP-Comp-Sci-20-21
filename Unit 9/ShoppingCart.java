import java.util.*;
public class ShoppingCart{
   private double totalPrice;
   private ArrayList<Item> order;
   
   public ShoppingCart(){
      order = new ArrayList<Item>();
      totalPrice=0.0;
   }
   
   public void addItem(Item name){
      order.add(name);
      totalPrice+=name.getPrice();
   }
   public String toString(){
      String temp = order+"\n"+totalPrice;
      return temp;
   }
   
   public static void main (String[]args){
      ShoppingCart Cart = new ShoppingCart();
      Item Bread = new Item("Bread", 3.25);
      Item Milk = new Item("Milk", 2.50);
      Item IceCream = new discountedItem("Ice Cream", 4.50, 1.50);
      Item Apples = new discountedItem("Apples", 1.35, 0.25);
      
      Cart.addItem(Bread);
      Cart.addItem(Milk);
      Cart.addItem(IceCream);
      Cart.addItem(Apples);
      
      System.out.print(Cart);
   }
}
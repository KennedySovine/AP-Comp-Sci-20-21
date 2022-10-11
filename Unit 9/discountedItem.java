public class discountedItem extends Item{
   private double discountedPrice;
   
   public discountedItem(String name, double price, double discount){
      super(name, price-discount);
      discountedPrice=price-discount;
   }
   
   public double getDiscount(){
      return discountedPrice;
   }
   public void setDiscount(double discount){
      discountedPrice = this.getPrice()-discount;
   }
   public String toString(){
      return this.getName()+": "+discountedPrice;
   }
}
      
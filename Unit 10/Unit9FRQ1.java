public class PictureBook extends Book{
   private String illustrator;
   
   public PictureBook (String t, String a, String i){
      super(t, a);
      illustrator=i;
   }
   
   public static void printBookInfo(){
      printBookInfo.super();
      System.out.print(" and illustrated by "+illustrator);
   }
}


Book book1 = new Book("Frankenstein", "Marry Shelly");
Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");


public class BookListing{
   private double price;
   private Book book;
   
   public BookListing(Book b, double p){
      book=b;
      price=p;
   }
   
   public static void printDescription(){
      this.printBookInfo();
      System.out.print(", $"+price);
   }
}
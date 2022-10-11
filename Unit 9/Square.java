public class Square extends Rectangle{
   //Constructors
   public Square(){
      super();
   }
   public Square(int length){
      super(length, length);
   }
   
   public static void main(String[]args){
      Rectangle one = new Rectangle();
      one.draw();
      Square two = new Square();
      two.draw();
      Square three = new Square(4);
      three.draw();
   }
}
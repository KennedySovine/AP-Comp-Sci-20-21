public class Account{
   private String Name;
   private double Balance;
   
   public Account (String name, double balance){
      this.Name=name;
      this.Balance=balance;
   }
   public String toString(){
      return Name+": "+Balance;
   }
   
   public boolean equals(Account other){
      if (this.Name.equals(other.Name)){
         if (this.Balance==(other.Balance)){
            return true;
         }
      }
      return false;
   }
   
   public static void main (String[] args){
      Account a = new Account ("John", 400.21);
      System.out.println(a);
      Account b = new savingsAccount ("Jane", 300.72, .3);
      Account c = new savingsAccount ("Jane", 300.72, .3);
      System.out.println(b.equals(c));
      System.out.print(a.equals(c));
   }
}
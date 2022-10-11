public class savingsAccount extends Account{
   private double interestRate;
   
   public savingsAccount(String name, double balance, double interest){
      super(name, balance);
      interestRate=interest;
   }
   
   public String toString(){
      String temp = super.toString()+"; "+interestRate;
      return temp;
   }
   
   public boolean equals(savingsAccount other){
      boolean temp = super.equals(other);
      if (this.interestRate==other.interestRate){
         if (temp==true){
            return true;
         }
         return false;
      }
      return false;
   }
}
      
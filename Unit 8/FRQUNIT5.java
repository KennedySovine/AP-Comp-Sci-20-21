public String getHostName(){
   return hostName;
}

public void newAddress(String address){
   this.address=address;
}

public String nameAddress (String invitee){
   return "Dear "+invitee+", please attend my event at "+address+". See you then, "+hostName+".";
}

public Invitation (String address){
   this.address=address;
   hostName="Host";
}




public class PasswordGenerator{
   //Instance variables
   private int count;
   private String prefix;
   private int length;
   
   //Constructor
   public pw1(int length, String prefix){
      this.length=length;
      this.prefix=prefix+".";
      count++;
   }
   
   public pw2(int length){
      this.length=length;
      prefix="A."
      count++;
   }
   
   //Methods
   public static int pwCount(){
      return count;
   }
      
   public static String pwGen(){
      int temp = (int)((Math.random*length)+1);
      return prefix+temp;
   }
}
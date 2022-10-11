import java.util.*;
public class homework{

   //instance variables
   private int dueDay;
   private int dueMonth;
   private String subject;
   
   public homework(String subject, int dueDay, int dueMonth){
      this.subject=subject;
      this.dueDay=dueDay;
      this.dueMonth=dueMonth;
   }
   
   //Getter methods
   public String getSubject(){
      return subject;
   }
   public int getDueDay(){
      return dueDay;
   }
   public int getDueMonth(){
      return dueMonth;
   }
   
   //Setter methods
   public String setSubject(String subject){
      this.subject=subject;
   }
   public int setDueDay(int dueDay){
      this.dueDay=dueDay;
   }
   public int setDueMonth(int dueMonth){
      this.dueMonth=dueMonth;
   }
   
   //toString
   public String toString(){
      return subject+": "+dueDay+"/"+dueMonth;
   }
   public void print(){
      System.out.print(this);
   }
   
   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
      
      System.out.println("What do you want to do?");
      System.out.println("New = add new subject");
      System.out.println("Check = check assignments on that day"
      
      System.out.println("What subject?");
      int tempSub = input.nextInt();
      
   }
}
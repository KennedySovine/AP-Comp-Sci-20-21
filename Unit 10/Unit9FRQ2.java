public class Animal{
   private String eat;
   private String species;
   private String name;
   
   public Animal(String e, String s, String n){
      eat=e;
      species=s;
      name=n;
   }
   
   public static String toString(){
      return name+" the "+species+" is a "+eat;
   }
}


public class Herbivore extends Animal{

   public Herbivore(String s, String n){
      super("herbivore", s, n);
   }
}


public class Elephant extends Herbivore{
   private double length;
   
   public Elephant(String n, double l){
      super("elephant", n);
      length=l;
   }
   
   public static String toString(){
      return super.toString()+" with tusks "+length+" meters long";
   }
}
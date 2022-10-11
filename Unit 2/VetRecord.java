import java.util.*;
public class VetRecord{
   //Attributes
   private String name;
   private int age;
   private int weight;
   private boolean needsVaccine;
   
   public VetRecord(String nameP, int ageP, int weightP, boolean needsVaccineP){
   //overloading --> cannot have two constuctors with the same amount of parameters. Needs to have different amounts.
      name = nameP;
      age = ageP;
      weight = weightP;
      needsVaccine = needsVaccineP;
      }
   public VetRecord(String nameP, int ageP, int weightP){
      name = nameP;
      age = ageP;
      weight = weightP;
      needsVaccine = true;
      }
   }
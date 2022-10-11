import java.util.*;
public class OlympicJudge{
   public static double average (ArrayList<Double> scores){
      for (int i=1; i<scores.size(); i++){
         double temp = scores.get(i);
         int possibleIndex = i;
         while (possibleIndex > 0 && temp < scores.get(possibleIndex-1)){
            double e = scores.get(possibleIndex-1);
            scores.set(possibleIndex, e);
            possibleIndex--;
         }
         scores.set(possibleIndex, temp);
      }
      double yeut = 0.0;
      scores.remove(0);
      scores.remove(scores.size()-1);
      for (int u = 0; u<scores.size(); u++){
         yeut = yeut + scores.get(u);
   }
   yeut = yeut/scores.size();
   return yeut;
}
      
      
   
   public static void main (String [] args){
      ArrayList<Double> List1 = new ArrayList<Double>(Arrays.asList(20.0,5.0,15.0,30.0,10.0));
       if (average(List1)==15){
          System.out.println("Test 1 Passed");
       } else System.out.println("Test 1 Failed");
        ArrayList<Double> List2 = new ArrayList<Double>(Arrays.asList(-4.0, 100.0, 123.0, 56.0, 2.0, 2.0));
       if (average(List2)==40.0){
          System.out.println("Test 2 Passed");
       } else System.out.println("Test 2 Failed");
        ArrayList<Double> List3 = new ArrayList<Double>(Arrays.asList(35.0, 22.0, 90.0, -200.0, -42.0));
       if (average(List3)==5.0){
          System.out.println("Test 3 Passed");
       } else System.out.println("Test 3 Failed");
        ArrayList<Double> List4 = new ArrayList<Double>(Arrays.asList(-20.0, -16.0, -16.0, -10.0, -4.0));
      if (average(List4)==-14.0){
          System.out.println("Test 4 Passed");
       } else System.out.println("Test 4 Failed");      
}
}
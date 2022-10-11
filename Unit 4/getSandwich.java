public class getSandwich{
      public static String getSandwich(String str){
         int oop= str.indexOf("bread");
         int oof= str.lastIndexOf("bread");
         if (oop!=-1){
            if (oop!=oof){
               str=str.substring(oop+5, oof);
             }
             else
               str="";
         }
         else
            str="";
         
         System.out.println(str);
         return str;
      }
      public static void main(String [] args){
         int count =0; 
         if(getSandwich("breadjambread").equals("jam")){
            count++;
         }
         if(getSandwich("xxbreadjambreadyy").equals("jam")){
            count++;
         }
         if(getSandwich("xxbreadyy").equals("")){
            count++;
         }
         if(getSandwich("xxbreadbreadjambreadyy").equals("breadjam")){
            count++;
         }
         if(getSandwich("breadAbread").equals("A")){
            count++;
         }
         if(getSandwich("breadbread").equals("")){
            count++;
         }
         if(getSandwich("abcbreaz").equals("")){
            count++;
         }
         if(getSandwich("xyz").equals("")){
            count++;
         }
         if(getSandwich("").equals("")){
            count++;
         }
         if(getSandwich("breadbreaxbread").equals("breax")){
            count++;
         }
         if(getSandwich("breaxbreadybread").equals("y")){
            count++;
         }
         if(getSandwich("breadbreadbreadbread").equals("breadbread")){
            count++;
         }         
         
         if (count==12){
            System.out.print("Problem is correct");
         } else System.out.print("Try again");
   }
}
         
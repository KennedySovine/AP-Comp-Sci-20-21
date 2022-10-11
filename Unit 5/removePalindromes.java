public class removePalindromes{
   public static void removePalindromes(String[] a) {
      String temp="";
      String oop="";
      for (int i=0; i<a.length; i++){
         if (a.length==1){
            a[i]="";
         }
         else{
            temp=a[i];
            while (temp.length()>1){
               oop+=temp.substring(temp.length()-1);
               temp=temp.substring(1);
            }
            oop=oop.toLowerCase();
            temp=temp.toLowerCase();
            oop+=temp;
            if (temp==oop){
               a[i]=oop;
            }
         }
      }
      System.out.println(a[1]);
   }
}
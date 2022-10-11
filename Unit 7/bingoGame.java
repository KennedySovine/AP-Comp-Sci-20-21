import java.util.*;
public class bingoGame {
   public static void main (String [] args){
      //Variables
      Scanner bingoInput = new Scanner (System.in);
      boolean bingoTrue = false;
      int [][] bingoBoard = new int [5][5];
      int indicator = 0;
      int temp;
      boolean wasThere=false;
      boolean notThere=false;
      
      //Sets board == WORKS
      for (int row = 0; row<bingoBoard.length; row++){
         for (int col=0; col<bingoBoard[0].length; col++){
            bingoBoard[row][col]=(int)((Math.random()*30)+1);
         }
      }
      bingoBoard[2][2]=0;
         
      while (bingoTrue==false){
         //Shows board == WORKS
         for (int row = 0; row<bingoBoard.length; row++){
            for (int col=0; col<bingoBoard[0].length; col++){
               System.out.print((bingoBoard[row][col])+" ");
            }
            System.out.println();
         }
         
         //User input == WORKS
         System.out.println("Enter B,I,N,G,O");
         String bingoL = bingoInput.next();
         
        System.out.println("Enter the number");
         int bingoN = bingoInput.nextInt();
         
         //BINGO to num
         if (bingoL.equals("B")){
            indicator=0;
         }
         else if (bingoL.equals("I")){
            indicator=1;
         }
         else if (bingoL.equals("N")){
            indicator=2;
         }
         else if (bingoL.equals("G")){
            indicator=3;
         }
         else if (bingoL.equals("O")){
            indicator=4;
         }
         
         //Change it to 0 if there
         for (int i=0; i<bingoBoard.length; i++){
            temp=bingoBoard[i][indicator];
            if (temp==bingoN){
               bingoBoard[i][indicator]=0;
               wasThere=true;
            }
         }
         
         //announce if it was there or not == WORKS
         if (wasThere){
            System.out.println(bingoN+" was there!");
            wasThere=false;
         }
         else
            System.out.println(bingoN+" was not there!");
         
         //Check for in the col. == WORKS
         for (int row = 0; row<bingoBoard.length; row++){
            int e = 1;
            for (int col=0; col<bingoBoard[0].length; col++){
               e+=bingoBoard[row][col];
            }
            if (e==1){
               bingoTrue=true;
            }
         }
         
         //Check bingo by row. == WORKS
         for (int col = 0; col<bingoBoard[0].length; col++){
            int f=1;
            for (int row=0; row<bingoBoard.length; row++){
               f+=bingoBoard[row][col];
            }
            if (f==1){
               bingoTrue=true;
            }
         }
         if (bingoTrue){
            System.out.println("Bingo!");
         }
      }
   }
}
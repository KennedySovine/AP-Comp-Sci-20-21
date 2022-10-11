if (round%3!=0){
   if (round%2=0){
      return 2;   
   }   
   else 
      return 1;
}
else
   return 3;
   
   
if (getPlayer1Move>getPlayer2Move){
   System.out.print("player 1 wins");
   }
else if (getPlayer1Move<getPlayer2Move){
   System.out.print("player 2 wins");
   }
else if (getPlayer1Move==getPlayer2Move){
   System.out.print("tie game");
   }
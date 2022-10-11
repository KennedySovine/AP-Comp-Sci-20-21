boolean found = false;
int max=0;

for (int row=0; row<farmPlots.length; row++){ //1
   for (int col=0; col<farmPlots[0].length; col++){ //1
      farmPlots[row][col].getCropType();
      farmPlots[row][col].getCropYield(); //1
      if (cropType.equals(c)){ //1
         if (cropYield>max){ //1
            Plot maxP = new Plot (c, cropYield);
            found=true;
            max=cropYield;
         }
      }
   }
}
if (found){
   return maxP; //1
}
else
   return null;
   

for (int j : farmPlots){
   j.getCropType();
   if (cropType.equals(c)){
      j.getCropYield();
      Plot maxP = new Plot (cropType, cropYield);
   }
}



String first;
farmPlots[0][col].getCropType();
first=cropType;
boolean sameType=false;

for (int row=1; row<farmPlots.length; row++){  //1
   farmPlots[row][col].getCropType();  //1
   if (cropType.equals(first)){
      sameType=true;
   }
}
return sameType; //1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

/**
 *
 * @author Harry
 */
public class PipeTypeIII extends LongPipe {
    
    public PipeTypeIII(int newGrade ,int newLength, int newDiameter, int newNumColour, int newNumOfPipes, boolean newChemicalResist, boolean newInsulation, boolean newReinforcement) {
        super(newGrade ,newLength, newDiameter, newNumColour, newNumOfPipes, newChemicalResist, newInsulation, newReinforcement);
    }
    public double cost(double volume,double price,boolean ChemResist){
      double costOfPipe = volume*price;
      double extra = 1+0.16;
      if (ChemResist == true){
          extra += 0.14;
      }
      
      return costOfPipe*extra;
}
    
}

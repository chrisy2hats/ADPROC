/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

/**
 *
 * @author up808621
 */
public class PipeTypeI extends LongPipe {
    
    public PipeTypeI(int newLength, int newDiameter, int newNumColour, int newNumOfPipes, boolean newChemicalResist, boolean newInsulation, boolean newReinforcement) {
        super(newLength, newDiameter, newNumColour, newNumOfPipes, newChemicalResist, newInsulation, newReinforcement);
    }
    public double cost(double volume,double price,double extra){
       return (volume*1)*extra;
}

}
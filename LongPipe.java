/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipe;

/**
 *
 * @author up808621
 */
public class LongPipe {

    private int lengthInMeters , diameterInInches , numOfColour , numOfPipes;
    private boolean chemicalResist;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public LongPipe(int newLength,int newDiameter,int newNumColour, int newNumOfPipes,boolean newChemicalResist){
        lengthInMeters = newLength;
        diameterInInches = newDiameter;
        numOfColour = newNumColour;
        numOfPipes = newNumOfPipes;
        chemicalResist = newChemicalResist;
    }
    public double canculateVolume(int newLength,int newDiameter){
        return 7.0;
    }
    public double convertMeterToInch(int newLength){
        return newLength / 0.0254;
    }
}

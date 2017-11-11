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
        //The volume of a cylinder = V=πr^2h
        double totalVolume;
        double innerVolume;
        double volume;
        double radius = newDiameter /2;
        double innerRadius = radius * 0.9;
        totalVolume = Math.PI*Math.pow(radius,2)*newLength;
        innerVolume = Math.PI*Math.pow(innerRadius,2)*newLength;
        volume = totalVolume - innerVolume;
        return volume;
        
    }
    public double convertMeterToInch(int newLength){
        return newLength / 0.0254;
    }
}

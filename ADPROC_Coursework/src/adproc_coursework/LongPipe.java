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
public abstract class LongPipe {

    private int lengthInMeters , diameterInInches , numOfColour , numOfPipes;
    private boolean chemicalResist,insulation,reinforcement;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public LongPipe(int newLength,int newDiameter,int newNumColour, int newNumOfPipes,boolean newChemicalResist,boolean newInsulation,boolean newReinforcement){
        lengthInMeters = newLength;
        diameterInInches = newDiameter;
        numOfColour = newNumColour;
        numOfPipes = newNumOfPipes;
        chemicalResist = newChemicalResist;
        insulation = newInsulation;
        reinforcement = newReinforcement;
    }
    public double calculateVolume(int newLength,int newDiameter){
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
    public abstract double cost(double volume,double price,double extra);
        
    
    
    public double calculateExtra(){
        double extra = 1;
        if (numOfColour == 1){
            extra+=0.12;
        }
        if (numOfColour == 2){
            extra+=0.16;
        }
         if (insulation == true){
            extra+=0.13;
        }
        if(reinforcement == true){
            extra +=0.17;
        }
        if (chemicalResist == true){
            extra+=0.14;
        }
        return extra;
    
}
    public void choose(int grade,int colour,boolean insulation,boolean reinforcement){
        if (grade <=3 && grade > 0 && colour == 0 && insulation == false  && reinforcement == false){
            //create a object of pipe I
        }
        if (grade <=4 && grade > 1 && colour == 1 && insulation == false  && reinforcement == false){
            //create a object of pipe II
        }
        if (grade <=5 && grade > 1 && colour == 2 && insulation == false  && reinforcement == false){
            //create a object of pipe III
        }
        if (grade <=5 && grade > 1 && colour == 2  && insulation == true  && reinforcement == false){
            //create o object of pipe IV
        }
         if (grade <=5 && grade > 2 && colour == 2  && insulation == true  && reinforcement == true){
             //create a object of pipe V
         }
    }
   public double priceGrade(double grade){
        if (grade == 1){
            return 0.4;
        }
        else if (grade == 2){
            return 0.6;
        }
        else if (grade == 3){
            return 0.75;
        }
        else if (grade == 4){
            return 0.8;
        }
        else if (grade == 5){
            return 0.95;
        }
        else{
            return 0;
        }
    }
}


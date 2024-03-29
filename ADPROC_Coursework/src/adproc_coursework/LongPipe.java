package adproc_coursework;

/**
 *
 * @author up808621
 */
public abstract class LongPipe {

	private float lengthInMeters, diameterInInches;
	private int numOfColour, numOfPipes, grade;
	private boolean chemicalResist, insulation, reinforcement;

	public static void main(String[] args) {
		// TODO code application logic here
	}

	public LongPipe(int newGrade, float newLength, float newDiameter, int newNumColour, int newNumOfPipes, boolean newChemicalResist, boolean newInsulation, boolean newReinforcement) {
		lengthInMeters = newLength;
		diameterInInches = newDiameter;
		numOfColour = newNumColour;
		numOfPipes = newNumOfPipes;
		chemicalResist = newChemicalResist;
		insulation = newInsulation;
		reinforcement = newReinforcement;
		grade = newGrade;
	}

	public double calculateVolume(float newLength, float newDiameter) {
		//The volume of a cylinder = V=πr^2h
		double totalVolume;
		double innerVolume;
		double volume;
		double radius = newDiameter / 2;
		double innerRadius = radius * 0.9;
		totalVolume = Math.PI * Math.pow(radius, 2) * convertMeterToInch(newLength);
		innerVolume = Math.PI * Math.pow(innerRadius, 2) * convertMeterToInch(newLength);
		volume = totalVolume - innerVolume;
		return volume;

	}

	public double convertMeterToInch(float newLength) {
		return newLength / 0.0254;
	}

	public abstract double cost(double volume, double price, boolean ChemResist);


	public String[] getPipeData() {
		//Return a string displaying the pipes attributes to be put into the text box on the user interface
		String pipeGrade = String.valueOf(this.grade);
		String pipeLength = String.valueOf(this.lengthInMeters);
		String pipeDiameter = String.valueOf(this.diameterInInches);
		String pipeColour = String.valueOf(this.numOfColour);
		String insulation;
		if (this.insulation) { //If the pipe is insulated
			insulation = "\tInsulated";
		} else {
			insulation = "\tNot insulated";
		}
		String reinforcement;
		if (this.reinforcement) {//Pipe is reinforced
			reinforcement = "\tReinforced";
		} else {
			reinforcement = "\tNot reinforced";
		}
		String chemicalResistance;
		if (this.chemicalResist) {
			chemicalResistance = "\tResistance to chemical resistance";
		} else {
			chemicalResistance = "\tNot resistant to chemicals";
		}

		double volume = this.calculateVolume(this.lengthInMeters, this.diameterInInches);
		double price = priceOfGradePlastic(this.grade); //Price of the grade of plastic being used
		double costOfPipe = this.cost(volume, price, this.chemicalResist);
		String pipeQuantity = String.valueOf(this.numOfPipes);
		double finalPrice = ( costOfPipe * this.numOfPipes);
		return new String[]{("Grade Of Plastic: "+pipeGrade),("Length of pipe: "+pipeLength),("Diameter of pipe: "+pipeDiameter),("Number of colours: "+pipeColour),insulation,reinforcement,chemicalResistance,("Quantity: "+pipeQuantity),""+finalPrice};
	}

	public double priceOfGradePlastic(int gradeOfPlastic) {
		switch (gradeOfPlastic) {
			case 1:
				return 0.4;
			case 2:
				return 0.6;
			case 3:
				return 0.75;
			case 4:
				return 0.8;
			case 5:
				return 0.95;
			default://This code should never be reached.
				return 0;
		}

	}
}

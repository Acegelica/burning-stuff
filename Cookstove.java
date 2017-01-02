package firewoooo;

public class Cookstove {
	/**
	* Class that represents a type of stove and the relative
	* information assossiated with the type of stove
	*\\Will make note here of the final types of stoves we want to use in the end
	*
	*/
	//format of input file: name, gCO/MJ, cost, notes
	private double gramsOfFuelPerMegaJouel;
	private double CO2ReleasedMJ; //Mega Jouel
	private double costPerStove;
	private double MJPerPersonPerMeal; //How many Mega jouels are needed to cook a meal for 1 person in where we are talking about, per meal
	
	public Cookstove(double gofpmj, double co2rmj, double cps, double mjpppm){
		gramsOfFuelPerMegaJouel = gofpmj;
		CO2ReleasedMJ = co2rmj;
		costPerStove = cps;
		MJPerPersonPerMeal = mjpppm;
	}
	
	public Cookstove(){
		this(0, 0, 0, 0);
	}

	public double getPrice(){
		return costPerStove;	
	}
	
	public double getCO2PerPerson(){
		return CO2ReleasedMJ * MJPerPersonPerMeal;	
	}
}

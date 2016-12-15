package firewoooo;

public class Cookstove {
	/**
	* Class that represents a type of stove and the relative
	* information assossiated with the type of stove
	*/
	private double amountOfFuelNeed;
	private double CO2ReleasedPerUse;
	private double costPerStove;
	private double howManyPeopleAUseFeeds; //As in how many people cn eat from one meal from it
	
	public Cookstove(double aofn, double co2rpu, double cps, double hmpauf){
		amountOfFuelNeed = aofn;
		CO2ReleasedPerUse = co2rpu;
		costPerStove = cps;
		howManyPeopleAUseFeeds = hmpauf;
	}
	
	public Cookstove(){
		this(0, 0, 0, 0);
	}


	/**
	 * Only takes into account the CO2 from the cookstoves
	 * 
	 * @author Skyler Matuska
	 * @return the amount of CO2 added to the air by the current number of
	 *         cookstoves distributed.
	 */
	public double newCO2level() {
		// TODO
		return 0;
	}
}

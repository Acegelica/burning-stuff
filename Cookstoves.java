package firewoooo;

public class Cookstoves {
	private int totalCookstoves;
	
	public Cookstoves(){
		totalCookstoves=0;
	}
	
	public Cookstoves(int startingCookstoves){
		totalCookstoves=startingCookstoves;
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

	/**
	 * This number should always be positive
	 * 
	 * @return the current total number of cookstoves
	 */
	public int numCookstoves() {
		return totalCookstoves;
	}

	/**
	 * @param newCookstoves
	 *            number of additional cookstoves
	 */
	public void addCookstoves(int newCookstoves) {
		totalCookstoves += newCookstoves;
	}
}

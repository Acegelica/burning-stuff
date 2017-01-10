package pack;

public class Atmosphere {
	/**
	 * This class represents the information about the atmosphere as it will be
	 * affected by the things changing in the model
	 */

	private double CO2; // this is in ppm
	private double prevCO2;
	private double temperature;
	public final double STEFAN = 5.670367 * Math.pow(10, -8);

	public Atmosphere() {
		this(0, 0);
	}

	public Atmosphere(double startingCO2, double startingTemperature) {
		CO2 = startingCO2;
		prevCO2 = startingCO2;
		temperature = startingTemperature;
	}

	public void addCO2(double addedCO2) {
		prevCO2 = CO2;
		setCO2(addedCO2 + CO2);
	}

	/*
	 * Sections just for getters and setters
	 */

	public void setCO2(double co2) {
		CO2 = co2;
	}

	public void setTemp(double temp) {
		temperature = temp;
	}

	public double getCO2() {
		return CO2;
	}

	/**
	 * also updates temperature
	 */
	public double getDeltaTemp() {
		double dT = (5.35 * Math.log(CO2 / prevCO2)) / (4 * Math.pow(temperature, 4) * STEFAN) * temperature;
		temperature += dT;
		// Just making a note that the population doesn't actually care about
		// the rest of the global population since we
		// Are only tracking the delta T with the adjustments, not the actual
		// current T.
		// Unfortinantly, the current formula I have to calculate delta T
		// requires knowledge of the current T.
		// dT = [5.35*ln(PPMC/PPMS)]/[4*CT^4 * stefan] * CT;
		// change in temperature equals the change in flux divided by 4 times
		// the flux times current temprature
		// where the change in flux is given by 5.35 times the natural log of
		// the quotient between the current parts per million of CO2 and the
		// starting parts per million
		// and flux is given by the current temperature to the 4th power and
		// multiplying by the Stefan constant
		return dT;
	}

}

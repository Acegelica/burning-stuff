package pack;

import java.io.*;
import java.util.*;

public class actualModel {

	public static void main(String[] args) {
		/**
		 * Stuff does end up getting inputed later when we get to that stage of
		 * the game
		 */
		try {
			Scanner reader = new Scanner(new File("atmosphereInfo.csv"));
			String[] atmostic = reader.nextLine().split(",");
			Atmosphere atmos = new Atmosphere(Double.valueOf(atmostic[0]), Double.valueOf(atmostic[1]));

			reader = new Scanner(new File("cookstove values.csv"));
			String[] cooktotic = reader.nextLine().split(",");
			Cookstove stove = new Cookstove(0, Double.valueOf(cooktotic[1]), Double.valueOf(cooktotic[2]), 104.4); // MJ/year
																													// for
																													// rwanda

			reader = new Scanner(new File("peoplesInfo.csv"));
			String[] peptotic = reader.nextLine().split(",");
			PeoplePopulation peoples = new PeoplePopulation(Double.valueOf(peptotic[0]), Double.valueOf(peptotic[1]));

			reader.close();

			BufferedWriter moneySpent = new BufferedWriter(new FileWriter(new File("Budget.csv")));
			BufferedWriter CO2 = new BufferedWriter(new FileWriter(new File("AtmosphericCO2.csv")));
			BufferedWriter temps = new BufferedWriter(new FileWriter(new File("TemperatureChanges.csv")));

			for (int i = 0; i <= 10000; i++) { // Years will be the required number
											// of years the model wants to run
											// for
				moneySpent.write(peoples.getPopWOut() * .1 + "\n"); // 10%
																	// conversion
																	// happens
				peoples.setPopWCookstove(peoples.getPopWCookstove() + peoples.getPopWOut() * .1);
				peoples.setPopWOut(peoples.getPopWOut() * .9);

				CO2.write(atmos.getCO2() + "\n");

				temps.write(atmos.getDeltaTemp() + "\n"); // Also increments the
															// temperature

				// Now the yearly increment section happens
				double amountOfCO2 = calcCO2(peoples, stove);
				atmos.addCO2(amountOfCO2);
				System.out.println(atmos.getCO2());
				peoples.grow(i);

			}

			moneySpent.close();
			CO2.close();
			temps.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static double calcCO2(PeoplePopulation peoples, Cookstove stove) {
		double pureCO2 = peoples.getPopWCookstove() * stove.getCO2PerPerson();
		double ppmCO2 = pureCO2 * 1000 / (3.845 * Math.pow(10, 21));
		return ppmCO2;
	}

}

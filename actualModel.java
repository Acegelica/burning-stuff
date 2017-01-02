import java.io.*;
import java.util.*;

public class actualModel{

  public static void main(String[] args){
    /**
    * Stuff does end up getting inputed later when we get to that
    * stage of the game
    */
    Scanner reader = new Scanner("atmosphereInfo.csv");
    String[] atmostic = reader.nextLine().split(",");
    Atmosphere atmos = new Atmosphere(Doule.valueOf(atmostic[0]), Double.valueOf(atmostic[1]));
    
    reader = new Scanner("cookstove values.csv")
    String[] cooktotic = reader.nextLine().split(",");
    Cookstove stove = new Cookstove(0, Double.valueOf(cooktotic[1]), Double.valueOf(cooktotic[2]), 104.4); //MJ/year for rwanda
    
    reader = new Scanner("peoplesInfo.csv");
    String[] peptotic = reader.nextLine().split(",");
    PeoplePopulation peoples = new PeoplePopulation(Double.valueOf(peptotic[0]), Double.valueOf(peptotic[1]));
    
    reader.close();
    
    FileWriter moneySpent = new FileWriter("Budget.csv");
    FileWriter CO2 = new FileWriter("AtmosphericCO2.csv");
    FileWriter temps = new FileWriter("TemperatureChanges.csv");
    
    for (int i = 0; i <= years; i++){ //Years will be the required number of years the model wants to run for
      moneySpent.println(peoples.getPopWOut() * .1); //10% conversion happens
      peoples.setPopWCookstove(peoples.getPopWCookstove() + peoples.getPopWOut()*.1);
      peoples.setPopWOut(peoples.getPopWOut()*.9);
      
      CO2.println(atmos.getCO2());
      
      temps.println(atmos.getDeltaTemp()); //Also increments the temperature
      
      //Now the yearly increment section happens
      double amountOfCO2 = calcCO2(peoples ,stove);
      atmos.addCO2(amountOfCO2);
      peoples.grow();
      
    }
    
    moneySpent.close();
    CO2.close();
    temps.close();
  }

  private static double calcCO2(PeoplePopulation peoples, Cookstove stove){
    double pureCO2 = peoples.getPopWCookstove() * stove.getCO2PerPerson();
    double ppmCO2 = pureCO2 * 1000 / (3.845 * Math.pow(10, 21));
    return ppmCO2;
  }
  
}

public class Atmosphere{
/**
* This class represents the information about the atmosphere
* as it will be affected by the things changing in the model
*/
  
  private double CO2;
  private double temperature;
  
  public Atmosphere(){
    this(0,0);
  }
  
  public Atmosphere(double startingCO2, double startingTemperature){
    CO2 = startingCO2;
    temperature = startingTemperature;
  }
  
  /*
  * Sections just for getters and setters
  */
  
  public void setCO2(double co2){
    CO2 = co2;
  }
  
  public void setTemp(double temp){
    temperature = temp;
  }
  
  public double getCO2(){
    return CO2;
  }

  public double getTemp(){
    return temperature;
  }

  public void increase(){
    //Like very seriously this method and related methods are like the core of the 
    //model and this is the main thing that they need to have done for the thing
  }
  
}

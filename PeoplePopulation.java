package //Will be made when we get the file directory done

public class PeoplePopulation{


  //The time unit is in years, for the sake of understanding
  private double popWCookstove;
  private double popWOut;
  public double withCC;
  public double final OUT_CC=7.720802564*Math.pow(10,7);
  public double final GROWTH_RATE=2.41;
  public double final MIDPOINT=50;

  public PeoplePopulation(double startingWCookstove, double startingWOut){
    popWCookstove = startingWCookstove;
    popWOut = startingWOut;
  }
  
  /**
  * Getters and setters get introduced in here
  */
  
  public double getPopWCookstove(){
    return popWCookstove;
  }
  public double getPopWOut(){
    return popWOut;
  }
  //The setters should see no use as they are not how the class is supposed to
  //interact with these values
  public void setPopWCookstove(double newWC){
    popWCookstove = newWC;
  }
  public void setPopWOut(double newWO){
    popWOut = newWO;
  }
  /**
  * This method has each of the populations grow from what would be considered
  * natural factors, such as avalibilty of food, avoiding disease, and having
  * clean vs. unclean air
  * @author Everest Bloomer
  */
  public void grow(int year){
    popWCookstove=withCC/(1+Math.e^((-GROWTH_RATE)*(year-MIDPOINT)))      
    popWOut=OUT_CC/(1+Math.e^((-GROWTH_RATE)*(year-MIDPOINT)))

  }


  
}

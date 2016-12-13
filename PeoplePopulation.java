package //Will be made when we get the file directory done

public class PeoplePopulation{


  //The time unit is in years, for the sake of understanding
  private double popWCookstove;
  private double popWOut;

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
    return popWCookstove;
  }
  //The setters should see no use as they are not how the class is supposed to
  //interact with these values
  public void setPopWCookstove(){
    return popWCookstove;
  }
  public void setPopWOut(){
    return popWCookstove;
  }
  /**
  * This method has each of the populations grow from what would be considered
  * natural factors, such as avalibilty of food, avoiding desieses, and having
  * clean vs. unclean air
  * @author Everest Bloomer
  */
  public void annualGrowth(){
    popWCookstove //Need to decide exactly how these would increase, and whether or not we want to hard code it in
                  //May have variables of the growthrate that can be inputed at the beginning of the creation of the object
    popWOut       //Similar to the other section, we need to decide how to have the growth be done,
                  //Talking about like exponential or logisitic growth or some other model of growth
    //Just making a note that the population doesn't actually care about the rest of the global population since we
    //Are only tracking the delta T with the adjustments, not the actual current T.
    //Unfortinantly, the current formula I have to calculate delta T requires knowledge of the current T.
    // dT = [5.35*ln(PPMC/PPMS)]/[4*CT^4 * stefan] * CT;
    // change in temperature equals the change in flux divided by 4 times the flux times current temprature
      // where the change in flux is given by 5.35 times the natural log of the quotient between the current paarts per million of CO2 and the starting parts per million
      // and flux is given by the current temperature to the 4th power and multiplying by the Stefan constant
  }


  
}

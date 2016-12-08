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
  }


  
}

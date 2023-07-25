public class Human{
  private String name;
  private double foodInStomach;
  private static final double maxFood = 10.5;

  public Human(String name, double food){
    this.name=name;
    this.foodInStomach=food;
  }

  public void eat(double food) throws StomachTooFullException{

    double checkFood = food + foodInStomach;
    
    if (checkFood < Human.maxFood) {
      foodInStomach = checkFood;  
    } else {
      throw new StomachTooFullException();
    }
    
  }
}
public class HumanTester{
  public static void main(String[] args){
    Human h = new Human("Darrel", 3.5);
    try {
    h.eat(50);
    } catch (StomachTooFullException e) {
      System.out.println(e.getMessage());
    }
  }
}
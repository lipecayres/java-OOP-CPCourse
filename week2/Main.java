public class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
  
      Human person = new Human();
  
      // Default values
      person.displayInfo();
  
      // Step 2 and 3
      person.eat(5000);
      person.exercise(5000);
      
      person.eat(4100);
      person.eat(3000);
  
      person.exercise(4100);
      person.exercise(3000);
      person.exercise(5000);
  
      // Step 4 and 5
      person.getCurrentAge();
      person.displayCurrentAge();
  
      // Step 6
  
      person.calculateBMI();
  
      // Step 7
  
  
      person.checkHealthStatus();
  
      // final display
      person.displayInfo();
      person.checkHealthStatus();
    }
  }
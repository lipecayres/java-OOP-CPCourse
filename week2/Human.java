public class Human {
    String name;
    int birthYear;
    int maxAge;
    double weight;
    double height;
    int currentAge;
    double bodyMassIndex;
  
    public Human(){
      name="no name";
      birthYear=2000;
      maxAge=100;
      weight = 70;
      height = 1.84;
      currentAge = 0;
      bodyMassIndex = 0;
    }
  
    public Human(String n, int b,int a, double c, double d, int e, double f){
      name=n;
      birthYear=b;
      maxAge=a;       
      weight = c;
      height = d;
      currentAge = e;
      bodyMassIndex = f;
    }
    
    public void smoke(int numOfCigarettes){
      
     maxAge-=2*numOfCigarettes; 
      
    }
  
    public void exercise(int numOfHours){
      maxAge+= numOfHours/300;
      
    }
  
    public void displayInfo(){
      System.out.println("----------");
      System.out.println("Name:"+name);
      System.out.println("Year of birth:"+birthYear);
      System.out.println("Maximum age:"+maxAge);
      System.out.println("Height:"+ height);
      System.out.println("Current Weight:"+ weight);
      System.out.println("Current Age:"+ currentAge);
      System.out.println("Current BMI:"+ bodyMassIndex);
      System.out.println("----------");
      
      
    }
  
      // step 2
    public void eat (int calories) {
      if (calories >= 4000) {
        weight += 0.5;
        System.out.println("Weight increased. New weight: " + weight);
      } else {
        System.out.println("Safe! Weight keeps the same. Weight: " + weight); 
      }
    }
    
        // step 3
    public void exercises (int calories) {
      if (calories >= 4000) {
        weight -= 0.2;
        System.out.println("Weight decreased. New weight: " + weight);
      } else {
        System.out.println("Weight keeps the same. Do more exercises. Weight: " + weight); 
      }
    }
    
        // step 4
    public int getCurrentAge() {
        currentAge = 2023 - birthYear;
        return currentAge;
    }
    
        // step 5
    public int displayCurrentAge(){
        currentAge = 2023 - birthYear;
      System.out.println("Current Age: " + currentAge);
        return currentAge;
    }
    
      // step 6
    public double calculateBMI() {
      bodyMassIndex = weight/(height*height);
      return bodyMassIndex;
    }
    
        // step 7
    public void checkHealthStatus() {
      bodyMassIndex = weight/(height*height);
      
      String status;
      if (bodyMassIndex< 25) {
        status = "healthy";
      } else {
        status = "unhealthy";      
      }
        System.out.println("Health Status: "+ status);
    
    }
  
    
  }
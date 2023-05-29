class Main {
  public static void main(String[] args) {
    double answer;

    // initializing objects
    Calculator calculator = new Calculator();
    Customer felipe = new Customer("1234", "Felipe", "10203040");
    Phone phone = new Phone("01020", "Apple", "Iphone");

    // calculator classes test
    System.out.println("Calculator methods:");
    answer = Calculator.performCalculation(1, 1, "+");
    System.out.println(answer);
    Calculator.performCalculation2(3, 5, "avg");

    System.out.println("");

    // phone classes test
    System.out.println("Phone methods:");
    System.out.printf("Dialling %s", Phone.emergency);

    System.out.print("\n\n");

    // customer classes test

    System.out.println("Customer methods");
    felipe.calculateOverallAverage(felipe);
  }
}
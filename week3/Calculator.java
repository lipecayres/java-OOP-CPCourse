public class Calculator {

  public static double performCalculation(double num1, double num2, String operation) {

    double math = 0;

    if (operation.equals("+")) {
      math = num1 + num2;
    } else if (operation.equals("-")) {
      math = num1 - num2;
    } else if (operation.equalsIgnoreCase("avg")) {
      math = (num1 + num2) / 2;
    } else {
      System.out.println("Enter a valid operation");
    }
    return math;
  }

  public static void performCalculation2(double num1, double num2, String operation) {

    double math = 0;
    switch (operation) {
      case "+":
        math = num1 + num2;
        break;
      case "-":
        math = num1 - num2;
        break;
      case "avg":
        math = (num1 + num2) / 2;
        break;
    }
    System.out.println(math);

  }
}

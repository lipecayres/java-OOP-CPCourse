public class Calculator{

    public static double performCalculation(int num1, int num2, String operation) {
  
      double math = 0;
  
      if (operation == "+") {
        math = num1+num2;
      } else if (operation == "-") {
        math = num1-num2;
      } else if (operation == "avg") {
        math = (num1+num2)/2;
      } else {
        System.out.println("Enter a valid operation");
      }
      return math;
    }
  
    
    public static void performCalculation2(int num1, int num2, String operation) {
  
      double math = 0;
      switch(operation){
              case "+":
                math = num1+num2;
                System.out.println(math);
              case "-":
                math = num1-num2;
                System.out.println(math);
              case "avg":
                math = (num1+num2)/2;
                System.out.println(math);
              default:
                System.out.println("Enter a valid operation");
              }
    }
  }
  
  
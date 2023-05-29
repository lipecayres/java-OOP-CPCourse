import java.util.Scanner;

public class Customer {
  String SIN, Name, Contact_No;
  Phone workPhone, personalPhone;

  Scanner sc = new Scanner(System.in);

  public Customer(String SIN, String Name, String Contact_No) {
    this.SIN = SIN;
    this.Name = Name;
    this.Contact_No = Contact_No;
  }

  // Getters ans setters
  public void setSIN(String SIN) {
    this.SIN = SIN;
  }

  public String getSIN() {
    return SIN;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public String getName() {
    return Name;
  }

  public void setContact_No(String Contact_No) {
    this.Contact_No = Contact_No;
  }

  public String getContact_No() {
    return Contact_No;
  }

  // Step 5 - Calculate bill work account

  public double calculateAverageBillWork() {
    int months;
    double averageBill = 0;

    System.out.println("\nWork bill average calculator:");
    System.out.print("How many months?: ");
    months = sc.nextInt();

    for (int i = 0; i < months; i++) {
      System.out.printf("Insert the value of bill %s: $", i + 1);
      averageBill += sc.nextDouble();
    }
    averageBill /= months;

    System.out.printf("Average is: $%s", averageBill);
    return averageBill;

  }

  // Step 6 - Calculate bill personal account
  public double calculateAverageBillPersonal() {
    int months, counter;
    double averageBill = 0;

    System.out.println("\nPersonal bill average calculator:");
    System.out.print("How many months?: ");
    months = sc.nextInt();

    counter = 0;
    while (counter < months) {
      System.out.printf("Insert the value of bill %s: $", counter + 1);
      averageBill += sc.nextDouble();
      counter++;
    }
    averageBill /= months;

    System.out.printf("Average is: $%s", averageBill);
    return averageBill;

  }

  // Step 7 - Calculate Overall Average
  public void calculateOverallAverage(Customer customer) {
    double x, y, z;

    // methods to get average
    x = customer.calculateAverageBillWork();
    System.out.println("");
    y = customer.calculateAverageBillPersonal();
    System.out.println("");

    // average math
    z = Calculator.performCalculation(x, y, "avg");

    // invoking calculator
    System.out.printf("\nAverage of both bills: $%s", z);

  }

}
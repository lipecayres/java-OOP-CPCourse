public class Employee extends Person{
  private int ID;
  private double hourlyPay;

  public Employee(){};
  
  public Employee (String firstName, String lastName, double height, int ID, double hourlyPay) {
      super(firstName, lastName, height);
      this.ID = ID;
      this.hourlyPay = hourlyPay;
  }


  public void setID(int ID){
    this.ID = ID;
  }

  public int getID() {
      return ID;
  }

  public void setHourlyPay(double hourlyPay){
    this.hourlyPay = hourlyPay;
  }

  public double getHourlyPay() {
      return hourlyPay;
  }

// step 2
  public double getRaise() {
    hourlyPay = hourlyPay * 1.15;
    return hourlyPay;
  }

  // step 3

  public double payDay (double workedHours) {
    double salary = hourlyPay * workedHours;

    if (workedHours > 40){
      double extraTime = workedHours - 40;
      double extraSalary = extraTime * (hourlyPay*1.5);

      double newSalary = 40*hourlyPay + extraSalary;
      return newSalary;
    }
    
    return salary;
  }
  
  @Override
  public String toString() {
    return super.toString() + "\n" + "They make $" + hourlyPay + "\n" + "They have the employee ID " + ID;
  }
}
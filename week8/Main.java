class Main {
  public static void main(String[] args) {

    Employee e1 = new Employee ();

    e1.setFirstName("Felipe");
    e1.setLastName("Cayres");
    e1.setID(1234);
    e1.setHourlyPay(30.75);

    System.out.println(e1.toString());
    
  }
}
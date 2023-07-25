public class Person {
    protected  String firstName;
    protected  String lastName;
    protected double height;

    public Person() {};
  
    public Person(String firstName, String lastName, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private double getHeight(){
      return height;
    }

    public void setFirstName(String firstName){
      this.firstName = firstName;
    }

    public void setLastName(String lastName){
      this.lastName = lastName;
    }

    private void setHeight(double height){
      this.height=height;
    }

    public String toString(){
      return "Name:" + firstName + " " + lastName + "\n" + "They are height: " + height;
    }
  
}
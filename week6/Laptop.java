public class Laptop {
  private String model, brand, idNumber;

  // empty constructor
  public Laptop (){}

public Laptop(String idNumber, String brand, String model) {
        this.idNumber = idNumber;
        this.brand = brand;
        this.model = model;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }




  
}
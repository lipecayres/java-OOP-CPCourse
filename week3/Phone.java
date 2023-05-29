public class Phone{
    String IMEI, brand, model;
  
    public Phone (String IMEI, String brand, String model) {
          this.IMEI = IMEI;
          this.brand = brand;
          this.model = model;
    }
  
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
    public String getIMEI(){
        return IMEI;
    }
  
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
  
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    
  }
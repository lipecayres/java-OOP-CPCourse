
public abstract class Electronics extends Product implements Warranty{
   
    private String manufacturer;
   
    /** Creates a new instance of Electronics */
    public Electronics(double regularPrice,
            String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.6;
    }
   
    public String getManufacturer() {
        return manufacturer;
    }
   
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

  @Override
  public void usage(){
    System.out.println("This product can be used for fun");
  };


  public void payWarrantyFees(){};
  
}
public class TV extends Electronics {
   
    int size;
   
    /** Creates a new instance of TV */
    public TV(double regularPrice,
              String manufacturer,
              int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.8;
    }

    @Override
  public void usage(){
    System.out.println("This product can be used for watch series and TV shows.");
  };

    @Override
  public void payWarrantyFees(){
    System.out.println("You have to pay $120 for warranty each year on this product");
  };

}
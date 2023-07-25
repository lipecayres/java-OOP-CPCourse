public class MP3Player extends Electronics{
   
    private String color;
   
    /**
     * Creates a new instance of MP3Player
     */
    public MP3Player(double regularPrice,
                String manufacturer,
                String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
  public void usage(){
    System.out.println("This product can be used for listening to musics");
  };

  @Override
  public void payWarrantyFees(){
    System.out.println("You have to pay $50 for warranty each year on this product");
  };
}
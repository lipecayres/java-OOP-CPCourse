import java.util.ArrayList;

public class Main {
   
    public static void main(String[] args) {
       
        // Declare and create Product array of size 5
        ArrayList<Product> products = new ArrayList<Product>();       
        
      // Create object instances
        products.add(new TV(1000, "Samsung", 30));
        products.add(new TV(2000, "Sony", 50));
        products.add(new MP3Player(250, "Apple", "blue"));
        products.add(new Book(34, "Sun press", 1992));
        products.add(new Book(15, "Korea press", 1986));
       
        // Compute total regular price and total
        // sale price.
        double totalRegularPrice = 0;
        double totalSalePrice = 0;
       
        for (int i=0; i<products.size(); i++){
           
            // Call a method of the super class to get
            // the regular price.
            totalRegularPrice += products.get(i).getRegularPrice();
           
            // Since the sale price is computed differently
            // depending on the product type, overriding
            // method of the object instance of the sub-class
            // gets invoked.  This is runtime polymorphic
            // behavior.
            totalSalePrice += products.get(i).computeSalePrice();
           
            System.out.println("Item number " + i +
                    ": Type = " + products.get(i).getClass().getName() +
                    ", Regular price = " + products.get(i).getRegularPrice() +
                    ", Sale price = " + products.get(i).computeSalePrice());
        
            products.get(i).usage();

          if(products.get(i) instanceof Electronics){
             ((Electronics) products.get(i)).payWarrantyFees();           
          }

          System.out.println("\n");
        }
      
        System.out.println("totalRegularPrice = " + totalRegularPrice);
        System.out.println("totalSalePrice = " + totalSalePrice);

    }
}
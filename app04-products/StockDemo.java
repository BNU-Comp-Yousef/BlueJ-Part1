/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Yousef Abobaker.
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(101, "Fifa 21"));
        manager.addProduct(new Product(102, "COD: Cold War"));
        manager.addProduct(new Product(103, "Devil May Cry 5"));
        manager.addProduct(new Product(104, "Rocket League"));
        manager.addProduct(new Product(105, "Crash Bandicoot"));
        manager.addProduct(new Product(106, "Uncharted 5"));
        manager.addProduct(new Product(107, "Demon Souls"));
        manager.addProduct(new Product(108, "NBA 2k21"));
        manager.addProduct(new Product(109, "Fallout 6"));
        manager.addProduct(new Product(110, "Ghost of Tsushima"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 5);
        manager.delivery(102, 2);
        manager.delivery(103, 4);
        manager.delivery(104, 5);
        manager.delivery(105, 1);
        // Take delivery of 10 items of one of the products.
        manager.delivery(106, 10);
        manager.delivery(107, 9);
        manager.delivery(108, 10);
        manager.delivery(109, 7);
        manager.delivery(110, 6);
        manager.printAllProducts();
    }
    
   
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}

import java.util.Random;

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
    
    private Random randomNumGenerator;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomNumGenerator = new Random();
        
        manager.addProduct(new Product(101, "Playstation: Fifa 21"));
        manager.addProduct(new Product(102, "Playstation: COD: Cold War"));
        manager.addProduct(new Product(103, "Playstation: Devil May Cry 5"));
        manager.addProduct(new Product(104, "PC: Rocket League"));
        manager.addProduct(new Product(105, "Xbox: Crash Bandicoot"));
        manager.addProduct(new Product(106, "Xbox: Uncharted 5"));
        manager.addProduct(new Product(107, "Playstation: Demon Souls"));
        manager.addProduct(new Product(108, "Xbox: NBA 2k21"));
        manager.addProduct(new Product(109, "PC: Fallout 6"));
        manager.addProduct(new Product(110, "Playstation: Ghost of Tsushima"));
    }
    
    public void runDemo()
    {
        manager.printAllProducts();
        deliveryDemo();
        manager.printAllProducts();
    }

    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void deliveryDemo()
    {
        int quantity = 0;
        
        for (int id = 101; id <= 110; id++)
        {
            quantity = randomNumGenerator.nextInt(11);
            manager.deliveryOfProducts(id, quantity);
        }
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

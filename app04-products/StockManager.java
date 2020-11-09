import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author: David J. Barnes and Michael Kölling. 
 * @version: Version 1.1     08/11/2020.
 * Modified by Yousef Abobaker.
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            printDetails(id);
            product.sellOne();
            printDetails(id);
        }
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliveryOfProducts(int id, int amount)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("New delivery of products: " + " " + product);
        }
        else 
        {
            System.out.println("ERROR, Product ID " + id + " Not Found.");
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for (Product product : stock)
        {
            if (product.getID() == id) 
            {
                return product;
            }
        }
        return null;
    }

    public Product findByName(String productName)
    {
        for (Product product : stock)
        {
            if (product.getName().contains(productName))
            {
                return product;
            }
            else 
            {
                System.out.println("Product name not found.");
            }
        }
        return null;
    }
    
    public void printLowStock()
    {
        for (Product stocks : stock) 
        {
            if (stocks.getQuantity() <= 2)
            {
                System.out.println("Products low in stock: " + stocks);
            }
        }
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
        for (Product product : stock)
        {
            System.out.println();
            System.out.println("Ajdabiya's Gaming Junkyard");
            System.out.println("==========================");
            System.out.println();
            System.out.println();
        }
    }
}

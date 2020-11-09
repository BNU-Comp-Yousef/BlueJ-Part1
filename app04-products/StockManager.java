import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * This class will be used to run most of the stock in the business, it ranges from
 * finding items to changing their names and selling products.
 * Products added through an array list.
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
     * Constructor to initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Adds a product to the list.
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
     * Made a method to remove a product by using the ID number.
     * Returns an error message if ID does not exist.
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            stock.remove(product);
            System.out.println("This product has been removed.");         
        }
        else
        {
            System.out.println(" This product does not exist.");
        }
    } 

    /**
     * Sell one or more of the given item.
     * Show the before and after status of the product once it is sold.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            if (quantity > product.getQuantity())
            {
                quantity = product.getQuantity();
            }
            printDetails(id);

            for (int count = 0; count <= quantity; count++)
            {
                product.sellOne();
            }

            printDetails(id);
        }
    }

    /**
     * Receives a delivery of a particular product.
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
     * Tries to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     * with a matching ID as well as error message.
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
        System.out.println("Product with ID: " + id +
            " is not recognised.");
        return null;
    }

    /**
     * Added a method to change the name of a product and to return an
     * error message if an incorrect ID number is put in.
     */
    public void changeProductName(int id, String replacement)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.setName(replacement);
        }
        else
        {
            System.out.println( " The product is not found on the database");
        }
    }

    /**
     * Made a method to look for a product if it contains the string or 
     * characters that is entered in the field. Returns an error message
     * if an incorrect ID is put in.
     */
    public Product findByName(String productName)
    {
        for (Product product : stock)
        {
            if (product.getName().contains(productName))
            {
                System.out.println("Product found: " + product);
            }
            else 
            {
                System.out.println("Product name not found.");
            }
        }
        return null;
    }

    /**
     * A method that looks through all products and prints the products that
     * have a stock level lower than a certain amount. (3)
     */
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
     * match any product, returns an error message.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public void numberInStock(int id)
    {
        Product product = findProduct(id);
        if (product.getQuantity() > 0)
        {
          System.out.println("Stock remaining: " + product.getQuantity());  
        }
        else
        {
            System.out.println("No stock left.");
        }
    }

    /**
     * Print details of all the products. Contains stock level as well as their ID number.
     */
    public void printAllProducts()
    {
        for (Product product : stock)
        {
            System.out.println(product);
        }
    }

    /**
     * Prints all the available products and stock values.
     */
    public void printStock()
    {
        printHeading();
        for (Product product : stock)
        {
            System.out.println(product);
        }
    }

    /**
     * a method that prints the heading which is implemented in the
     * print stock method.
     */
    public void printHeading()
    {
        System.out.println("Ajdabiya's Gaming Junkyard");
        System.out.println("==========================");
        System.out.println();
    }
}

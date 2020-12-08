/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;

    public static final char CLEAR_CODE = '\u000c';
    public static final String QUIT = "quit";
    public static final String ADD = "add";

    public final int FIRST_ID = 200;
    
    
    private StockManager manager;
    private StockDemo demo;
    private int nextID = FIRST_ID;
    private String [] menuChoices;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);

        setUpMenu();
    }

    private void setUpMenu()
    {
        menuChoices = new String[]
        {
            "Add new product",
            "Remove old product",
            "Deliver quantity of product",
            "Sell quantity of product",
            "Restock product",
            "Print all products",
            "Quit program",
        };
    }

    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        while(!finished)
        {
            printHeading();
            getMenuChoice();
            String choice = input.getInput().toLowerCase();

            if (choice.equals(QUIT))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }

    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getInput();
            choice = choice.toLowerCase();

            if (choice.equals("quit")) finished = true;

            else executeMenuChoice(choice);

        }
    }

    /**
     * 
     */
    private void executeMenuChoice(String choice)
    {
        if (choice.equals(ADD)) addProduct();

        else if (choice.equals("remove")) removeProduct();

        else if (choice.equals("printall")) printAllProducts();

        else if (choice.equals("deliver")) deliverProduct();

        else if (choice.equals("restock")) restockProduct();

        else if (choice.equals("low stock")) displaylowstockProduct();
    }

    /**
     * 
     */
    public void addProduct()
    {
        System.out.println ("Add new Product");
        System.out.println ();
        System.out.println ("Please enter name of product");
        String name = input.getInput();

        Product product = new Product(nextID, name);
        manager.addProduct(product);

        System.out.println ("\nAdded " + product + " to stock.");
        nextID++;
    }

    /**
     * 
     */
     public void removeProduct()
    {
        System.out.println ("Remove old product");
        System.out.println ();
        System.out.println ("Please enter ID of product");
        String number = input.getInput();

        int id = Integer.parseInt(number);
        manager.removeProduct(id);

        nextID++;
    }

    /**
     * T
     */
    public void sellProduct()
    {
        System.out.println ("Sell a quantity of Product");
        System.out.println ();

        System.out.println ("Please enter the id of the product");
        String number = input.getInput();

        int id = Integer.parseInt(number);

        manager.sellQuantity(id);

        nextID++; 
    }

    /**
     * T
     */
    public void displaylowstockProduct()
    {
        System.out.println ("The product stock is low ");
        System.out.println ();

        manager.displaylowstock();

        nextID++; 
    }

    /**
     * T
     */
    public void deliverProduct()
    {
        System.out.println ("Deliver quantity of Product");
        System.out.println ();
        System.out.println ("Please enter ID of product");
        String number = input.getInput();

        int id = Integer.parseInt(number);

        System.out.println ("Please enter amount of product");
        String amount = input.getInput();

        int amount1 = Integer.parseInt(amount);

        manager.deliveryOfProducts(id, amount1);
        System.out.println("\nAdded " + amount + " product to stock");
        
        nextID++; 
    }

    /**
     * T
     */
    public void restockProduct()
    {
        System.out.println ("Product has been restocked.");
        System.out.println ();

        manager.restock();

        nextID++;  
    }    

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Sell:       Sell quantity of product");
        System.out.println("    Deliver:    Deliver quantity of product");
        System.out.println("    Low Stock:  Stock is low");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * T
     */
    public void printAllProducts()
    {
         manager.printAllProducts();
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Yousef Abobaker");
        System.out.println("******************************");
    }
}

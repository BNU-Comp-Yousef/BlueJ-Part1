import java.util.Date;

/**
 * This class represents the tickets of the ticket machine for 
 * the customer to have.
 * @author Yousef Abobaker
 * @version 1.1
 */
public class Ticket
{
    // Attributes, fields, variables.
    
    private String destination;
    //price is set in pence.
    private int price;
    
    private Date issueDateTime;
    
    /**
     * Constructor for objects of class Ticket setting the
     * desitnation and price in pence. The date will contain
     * the current system date and time.
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;

        issueDateTime = new Date();
    }
    
    /**
     * This method will print the ticket for the customer showing 
     * the date, price and destination.
     */
    public void print()
    {
        System.out.println("Ticket: " + destination + 
            "," + " Price: " + price + " pence" +
            " Issued: " + issueDateTime);
    }
    //end of class

}

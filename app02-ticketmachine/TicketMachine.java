/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Yousef Abobaker
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    private int priceAylesbury;
    private int priceAmesham;
    private int priceHighWycombe;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private Ticket issuedTicket;
    
    private Ticket aylesburyTicket;
    
    private Ticket amershamTicket;
    
    private Ticket highWycombeTicket;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        createTickets();
        priceAylesbury = 220;
        priceAmesham = 300;
        priceHighWycombe = 330;
        
        
        
        
        issuedTicket = null;
    }
    
    /**
     * Made a new method to create new tickets.
     */
    private void createTickets()
    {
        aylesburyTicket = new Ticket("Aylesbury", 220);
        
        amershamTicket = new Ticket("Amersham", 300);
        
        highWycombeTicket = new Ticket("High Wycombe", 330);
    }
    
     //start of methods to add coins.
    /**
     * The following methods will show money being added via coins and 
     * printing the new balance after each coin is added.
     * Adds 10p 
     */
    public void add10p()
    {
        balance = balance + 10;
        System.out.println("10 pence has been added. The balance is now: "
                          + balance + " " + "pence.");
    }
    
    /**
     * adds 20p (pence)
     */
    public void add20p()
    {
        balance = balance + 20;
        System.out.println("20 pence has been added. The balance is now: "
                          + balance + " " + "pence.");
    }
    
    /**
     * adds 100p (pence)
     */
    public void add100p()
    {
        balance = balance + 100;
        System.out.println("100 pence has been added. The balance is now: "
                          + balance + " " + "pence.");
    }
    
    /**
     * adds 200p (pence)
     */
    public void add200p()
    {
        balance = balance + 200;
        System.out.println("200 pence has been added. The balance is now: "
                          + balance + " " + "pence.");
    }
    //end of add money methods
       

    
    
    /**
     * @Returns The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    /**
     * Print a ticket for each destination if enough money 
     * has been inserted, and reduce the current balance by 
     * the ticket price. Print an error message if more money is required.
     */

    public void selectAylesburyTicket()
    {
        issuedTicket = aylesburyTicket;
        int price = 220;
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to Aylesbury");
            System.out.println("# " + price + " pence.");
            System.out.println("##################");
            aylesburyTicket.print();
            

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more pence.");
                    
        }
    }
    
        public void selectAmershamTicket()
    {
        issuedTicket = amershamTicket;
        int price = 300;
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to Amersham");
            System.out.println("# " + price + " pence.");
            System.out.println("##################");
            amershamTicket.print();
            

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more pence.");
                    
        }
    }
    
    

        public void selectHighWycombeTicket()
    {
        issuedTicket = highWycombeTicket;
        int price = 330;
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to High Wycombe");
            System.out.println("# " + price + " pence.");
            System.out.println("##################");
            highWycombeTicket.print();
            

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more pence.");
                    
        }
    }
    
    

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        System.out.println("You have been refunded: " + amountToRefund +
                " pence.");
        return amountToRefund;
    }
    
    /**
     * Print all available tickets.
     */
    public void printAllTickets()
    {
        aylesburyTicket.print();
        amershamTicket.print();
        highWycombeTicket.print();
    }
}



/**
 * This contains the modules that are specific to the course. In them
 * are the course title, the code for the course and a percentage mark.
 *
 * @author Yousef Abobaker
 * @version 1.1 (26/10/2020)
 */
public class Module
{
    private String title;
    
    private String codeNumber;
    
    private int mark;

    /**
     * Constructor for objects of class Module. Initialises the variables.
     */
    public Module(String title, String codeNumber)
    {
        mark = 0;
        this.title = title;
        this.codeNumber = codeNumber;
    }
    
    /**
     * Made a method to award marks. Uses an if statement to determine
     * the correct value.
     */
    public void awardMark(int mark)
    {
        if((mark >= 0 ) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.println("Sorry this mark value is invalid.");
        }
    }
    
    /**
     * prints out the information for the module the course needs.
     */
    public void print()
    {
        System.out.println("Module: " + codeNumber + "-"
                + title + ". " + "Mark: " + mark);
    }
}

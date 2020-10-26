
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
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNumber)
    {
        mark = 0;
        this.title = title;
        this.codeNumber = codeNumber;
    }

    
}

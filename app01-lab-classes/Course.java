
/**
 * This course class represents information about the university courses.
 * courses will have a course code and a course title.
 *
 * @author Yousef Abobaker
 * @version 1.0 17/10/2020
 */
public class Course
{
    // instance variables
    private String title;
    
    private String codeNumber;

    /**
     * Constructor for objects of class Course
     * This is where course and code is stored
     */
    public Course(String title, String codeNumber)
    {
    this.title = title;
    this.codeNumber = codeNumber;
    }
    
    /**
     * This will print the course and the code number of the course.
     */
    public void print()
    {
        System.out.println("Course: " + title + " " + codeNumber);
    }
}

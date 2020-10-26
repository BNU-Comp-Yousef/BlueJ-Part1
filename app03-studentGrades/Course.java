
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
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMarks;
    
    private Grades finalGrade; 

    /**
     * Constructor for objects of class Course
     * This is where course and code is stored
     */
    public Course(String title, String codeNumber)
    {
    this.title = title;
    this.codeNumber = codeNumber;
    
    module1 = new Module("Application Development", "AD200");
    module2 = new Module("Programming Concepts", "PC452");
    module3 = new Module("Data Analysis", "DA101");
    module4 = new Module("Web Design", "WD953");
    }
    
    public void addMarks(int mark, int moduleNumber)
    {
        if(moduleNumber == 1)
        {
            module1.awardMark(mark);
        }
        else if(moduleNumber == 2)
        {
            module2.awardMark(mark);
        }
        else if(moduleNumber == 3)
        {
            module3.awardMark(mark);
        }
        else if(moduleNumber == 4)
        {
            module4.awardMark(mark);
        }
    }
    
    /**
     * This will print the course and the code number of the course.
     */
    public void print()
    {
        System.out.println("Course: " + title + " " + codeNumber);
    }
}

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
    
    private int mark;
    
    private int finalMarks;
    
    private Grades finalGrade; 
    
    private int credits;

    /**
     * Constructor for objects of class Course
     * This is where course and code is stored
     */
    public Course(String title, String codeNumber)
    {
    this.title = title;
    this.codeNumber = codeNumber;
    this.mark = mark;
    this.credits = 0;
    
    module1 = new Module("Application Development", "AD200");
    module2 = new Module("Programming Concepts", "PC452");
    module3 = new Module("Data Analysis", "DA101");
    module4 = new Module("Web Design", "WD953");
    }
    
    /**
     * made an if statement to add marks depending on which module it is.
     */
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
     * Added a conversion method using if statements to give a grade from 
     * a percentage.
     */
    public Grades convertToGrade(int mark)
    {
      if((mark >= 0) && (mark < 40))
     {
         return Grades.F;
        }
        else if((mark >= 40) && (mark < 50))
        {
            return Grades.D;
        }
        else if((mark >= 50) && (mark < 60))
        {
            return Grades.C;
        }
        else if((mark >= 60) && (mark < 70))
        {
            return Grades.B;
        }
        else if((mark >=70) && (mark <= 100))
        {
            return Grades.A;
        }
        return Grades.X;
    }
    
    public int getMarks()
    {
        return mark;
    }
    
    public boolean awardCredits(int mark)
    {
        if(mark <= 0)
        {
            return true;
        }
        return false;
  
    }
    
    /**
     * method to get final marks.
     */
    public int getFinalMarks()
    {
        
        return finalMarks;
    }
    
     /**
     * This will print the course and the code number of the course.
     */
    public void print()
    {
        System.out.println("Course: " + title + " " + codeNumber);
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
}

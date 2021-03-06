/**
 * This course class represents information about the university courses.
 * courses will have a course code and a course title. Course has 4 
 * modules. Also I have calculated the final mark as well as the final 
 * grade for the course.
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

    //private int mark;

    private int finalMark;

    private Grades finalGrade; 

    private int credits;

    /**
     * Constructor for objects of class Course
     * This is where course and code is stored.
     * Also the final grade and credits are stored
     * as well as the new modules
     */
    public Course(String title, String codeNumber)
    {
        this.title = title;
        this.codeNumber = codeNumber;

        this.credits = 0;
        this.finalGrade = finalGrade;

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
            if (mark >=40) credits += 15;
        }
        else if(moduleNumber == 2)
        {
            module2.awardMark(mark);
            if (mark >=40) credits += 15;
        }
        else if(moduleNumber == 3)
        {
            module3.awardMark(mark);
            if (mark >=40) credits += 15;
        }
        else if(moduleNumber == 4)
        {
            module4.awardMark(mark);
            if (mark >=40) credits += 15;
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
            System.out.print("Unlucky, you failed with an F.");
            return Grades.F;
        }
        else if((mark >= 40) && (mark < 50))
        {
            System.out.print("You barely passed with a D.");
            return Grades.D;
        }
        else if((mark >= 50) && (mark < 60))
        {
            System.out.print("Not bad. You got a C.");
            return Grades.C;
        }
        else if((mark >= 60) && (mark < 70))
        {
            System.out.print("Good job, You got a B.");
            return Grades.B;
        }
        else if((mark >=70) && (mark <= 100))
        {
            System.out.print("Congratulations, You got an A.");
            return Grades.A;
        }

        return Grades.X;
    }

    /**
     * This method returns the course credits
     */
    public int getCredits()
    {
        return credits;
    }


    /**
     * made a method to calculate the final mark when all 4 modules
     * are added together.
     */
    public void calculateFinalMark()
    {
        int total = module1.getMark() + module2.getMark() + 
                    module3.getMark() + module4.getMark();

        finalMark = total / 4; 

    }

    /**
     * method to get final marks.
     */
    public int getFinalMark()
    {
        return finalMark;
    }

    /**
     * This will print the course and the code number of the course as
     * well as the modules.
     */
    public void print()
    {
        System.out.println("Course: " + title + " " + codeNumber);
        
        module1.print();
        module2.print();
        module3.print();
        module4.print();
        
        System.out.println("Final mark: " + finalMark + ".");
    }
}

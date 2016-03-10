
/**
 * Write a description of class Docent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    // instance variables - replace the example below with your own
    private String course;
    
    /**
     * Constructor for objects of class Docent
     */
    public Teacher(String fullName, String teacherID)
    {
        super(fullName, teacherID);
    }
    
    /**
     * Print the course the teacher gives
     */
    public void print()
    {
        System.out.println("The course of the teacher: " + course);
    }
    
    
}


/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{ 
    // The name of a person
    private String name;
    // The id of a person
    private String id;

    /**
     * Constructor for objects of class Person
     */
    public Person(String fullName, String personID)
    {
        this.name = fullName;
        this.id = personID;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }
    
      /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }
    
    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }

     /**
     * Print the persons name and id number
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id);
    }
}

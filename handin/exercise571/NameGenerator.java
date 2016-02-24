
/**
 * Generate a star-wars name
 * 
 * @author Jouke Rienstra
 * @version 1.0
 */
public class NameGenerator
{
    private String first; //The firstname of the star-wars name
    private String last; //The lastname of the star-wars name

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {

    }

    /**
     * Generates a star-wars name
     * The firstname contains the first 3 letters of the surname & the last 2 letters of a firstname.
     * The lastname contains the first 2 letters of mothersname & the last 3 letters of the birthplace name
     * @param firstName The first name of a person
     * @param lastName The last name of a person
     * @param mothersName The mothers name of a person
     * @param birthPlace The birthplace of a person
     */
    public String NameGenerator(String firstName, String lastName, String mothersName, String birthPlace){
        if(firstName != null && lastName != null && mothersName != null && birthPlace != null){
            first = lastName.toUpperCase().substring(0,1)  + lastName.toLowerCase().substring(1,3) + firstName.toLowerCase().substring(0,2);
            last = mothersName.toUpperCase().substring(0,1) + mothersName.toLowerCase().substring(1,2) + birthPlace.toLowerCase().substring(0,3);
        }
        return first + " " + last;
    }
    

    
}

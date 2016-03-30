
/**
 * Write a description of class Testor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testor
{


    /**
     * Constructor for objects of class Testor
     */
    public Testor()
    {
    NewsFeed newsFeed2 = new NewsFeed();
Post post1 = new Post("post1");
MessagePost messageP1 = new MessagePost("jouke", "Had vanochtend een gewldig idee. Maar ik ben vergeten wat het was. Het had te maken met vliegen..");
messageP1.like();
newsFeed2.addPost(messageP1);
newsFeed2.show();

    }
}

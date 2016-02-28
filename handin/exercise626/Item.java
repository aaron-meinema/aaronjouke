
/**
 * Items in the game.
 * 
 * @author Jouke Rienstra
 * @version 1.0
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String description;
    private int weight;

    /**
     * Constructor for objects of class item
     */
    public Item()
    {
        description = "";
        weight = 0;
    }

    /**
     * Display the weight of an item
     * @return the weight of the item
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * Display the description of the item
     * @return the description of the item
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Set the weight of an item
     * @param weight The weight of the item
     */
    public void setWeight(int weight){
        this.weight = weight;
    }

    /**
     * Set the description of an item
     * @param description The description of the item
     */
    public void setDescription(String description){
        this.description = description;
    }
}

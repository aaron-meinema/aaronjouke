import java.util.*;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits; //hashmap containing a room with its exist
    private HashMap<Room, Item> items; //hashmap containing a room with its ite

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String,Room>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.   
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            exits.put("north", north); //insert the room with its corresponding exit in the hashmap
        if(east != null)
            exits.put("east", east); //insert the room with its corresponding exit in the hashmap
        if(south != null)
            exits.put("south", south); //insert the room with its corresponding exit in the hashmap
        if(west != null)
            exits.put("west", west); //insert the room with its corresponding exit in the hashmap
    }

    /**
     * Get the current possible exits based on the location
     */
    public Room getExit(String direction){
        return exits.get(direction); //get the current exit based on the "key" input example north returns exit north
        
    }
    
   
    /**
     * Print all exits
     * Make a collection of the exits hashmap
     * Print every "value" exit
     */
    public void printExits(){
        for(String exit : exits.keySet() )
        {
            System.out.print(exit);
            System.out.print(" ");
        }
    }
    
   /**
    * Add an item to a room
    */
   public void addItem(Room room, Item item){
       items.put(room,item);
    }
   
   /**
    * Get all items in a room
    */
   public HashMap<Room, Item> getItems(){
       return items;
   }
   
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
}

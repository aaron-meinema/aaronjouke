
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    private String clockType; //12 or 24 hour clock

    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     * @param clockType 12 or 24
     */
    public ClockDisplay()
    {
        clockType = "24"; //default is a 24 hour clock
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     * @param clockType 12 or 24
     */
    public ClockDisplay(int hour, int minute)
    {
        clockType = "24"; //default is a 24 hour clock
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }

    
    /**
     * Set the clock to a 12 or 24 hour display
     * @param type can be 12 or 24 clock
     */
    public void setClockType(String type){
        clockType = type;
    }

    /**
     * Update the internal string that represents the display.
     * If the hours are lower than 12 return am
     * If the hours are higher than 12 return pm
     */
    private void updateDisplay()
    {
        int hour = hours.getValue(); //Make an int called hour with the value of hours

        if(clockType == "12"){
            if (hour == 0) { 
                //when the clock is on 24 hours or 12 hours
                //See numberDisplay, when the rolloverlimit is reached the value is set to 0
                displayString = "12:" + minutes.getDisplayValue() + "am";
            } else if (hour < 12) {
                displayString = hour + ":" + minutes.getDisplayValue() + "am";
            } else if (hour == 12) {
                displayString =  "12" + ":" + minutes.getDisplayValue() + "pm";
            } else if (hour < 24) {
                displayString =  (hour-12) + ":" + minutes.getDisplayValue() + "pm";
            }
        }else{
            displayString = hours.getDisplayValue() + ":" + 
            minutes.getDisplayValue();
        }
    }
}

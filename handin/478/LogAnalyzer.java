/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     * @param fileName the file that has to be analyzed
     */
    public LogAnalyzer(String fileName)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(fileName);
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Return the ammount of hits the logfile has saved
     */
    public int numberOfAccesses(){
        int total = 0;
        //for each hourCounts as count(kan van alles heten)
        for(int count : hourCounts){
            total = total + count; //totaal is totaal + de waarde uit de array hourCounts
        }
        return total;
    }
    
   public int bussiestHour(){ 
        int bussiestHour = 0; 
        //for each hourCounts as count(kan van alles heten) 
        for(int count : hourCounts){ 
            if(bussiestHour == 0 ||  hourCounts[count] > bussiestHour){ 
                bussiestHour = hourCounts[count]; 
            } 
        } 
        return bussiestHour; 
    } 
    
    /**
 * Return the quietest hour of day
 */
 public int quietestHour()
 {
 int quietestHour = 0;
 for(int hour = 1; hour < hourCounts.length; hour++) {
 if(hourCounts[hour] < hourCounts[quietestHour]) {
 quietestHour = hour;
 }
 }
 return quietestHour;
 } 
    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        /**for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }**/
        
        int hour = 0;
        while(hour < hourCounts.length){
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}

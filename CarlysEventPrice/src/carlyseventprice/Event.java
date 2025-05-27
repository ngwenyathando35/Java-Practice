/*
 * Filename Event.java
 * Written by Thando Ngwenya
 * Written on 12/04/2020
   Modified on 27/04/2020 
 * Description : Holds data fields for the CarlysEventPrice class */
package carlyseventprice;
public class Event 
{
    public final static int LOWER_PRICE = 32;
    public final static int HIGHER_PRICE = 35;
    public final static int CUTOFF_VALUE = 50;
    private String eventNumber;
    private int numGuests, price;
    private int eventType;
    public final String[] eventTypes = {"Wedding", "Baptism", "Birthday", "Corporate", "Other"};
    public void setEventNumber(String eventNum)
    {
        eventNumber = eventNum;
    }
    public String getEventNum()
    {
        return eventNumber;
    }
    public void setGuests(int numOfGuests)
    {
        if(isLargeEvent())
            setPrice(LOWER_PRICE);
        else
            setPrice(HIGHER_PRICE);
        numGuests = numOfGuests;
    }
    public int getGuests()
    {
        return numGuests;
    }
    public void setPrice(int pricePerGuest)
    {
        price = numGuests * pricePerGuest;
    }
    public int getPrice()
    {
        return price;
    }
    public void setEventType(int typeOfEvent)
    {
        if(typeOfEvent > eventTypes.length)
            eventType = 4;//If the argument sent to this methd is larger than the array size,  
        else              //    it is set to "other" which is element[4] in the eventTypes array
            eventType = typeOfEvent;
    }
    public int getEventType()
    {
        return eventType;
    }
    public String getEventType(int i)
    {
        String x;
        x = eventTypes[i];
        return x;
    }
    public Event(String eventNum, int numOfGuests /*int eventType*/)
    {
        setEventNumber(eventNum);
        setGuests(numOfGuests);
        //setEventType(eventType);
    }
    public boolean isLargeEvent()
    {
        if(numGuests > 50);
            return true;
    }
    public Event()
    {
        Event data = new Event("A000", 0);
    }
}

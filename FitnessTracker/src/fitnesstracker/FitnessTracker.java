/*
 * Filename FitnessTracker.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : Data fields, set and get methods, and a constructor for the FitnessTrackerTest class 
 */
package fitnesstracker;
public class FitnessTracker 
{
    private int  minutesSpent;
    private String activity, date;
    public void setMinutesSpent(int minutesSpentParticipating)
    {
        minutesSpent = minutesSpentParticipating;
    }
    public void setDate(String datE)
    {
        date = datE;
    }
    public void setActivity(String act)
    {
        activity = act;
    }
    public int getMinutesSpent()
    {
        return minutesSpent;
    }
    public String getDate()
    {
        return date;
    }
    public String getActivity()
    {
        return activity;
    }
    public FitnessTracker()
    {
        activity = "Running";
        minutesSpent = 0;
        date = "1 January 2020";
    }
    /*I cannot figure out why the the constructor below does not work
    //public FitnessTracker(String activity, int minutesSpent, String date)
    {
        this("Running",0, "1 January 2020");
    }*/
}
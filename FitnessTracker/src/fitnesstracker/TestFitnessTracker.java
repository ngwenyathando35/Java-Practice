/*
 * Filename .java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : The class asks for the user for an activity, how long they did that
                 activity for, and the date they did that activity on
 */
package fitnesstracker;
public class TestFitnessTracker 
{
    public static void main(String[] args) 
    {
        String date, activity;
        int minutesSpent;
        FitnessTracker data1 = new FitnessTracker();
        activity = data1.getActivity();
        date = data1.getDate();
        minutesSpent = data1.getMinutesSpent();
        System.out.println("Activity >> " + activity +
                "\nMinutes spent participating >> " + minutesSpent +
                "\nDate >> " + date);
    }
}
package timedresponse;
import javax.swing.JOptionPane;
import java.time.*;
/*
 * Filename TimedResponse.java
 * Written by the Texbook page 228
 * Written on 11/04/2020
 * Description : Using an explicitly imported, prewritten class;
 */
public class TimedResponse 
{
    public static void main(String[] args) 
    {
        LocalDateTime time1, time2;
        int seconds1, seconds2, seconds3;
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
        JOptionPane.showMessageDialog(null,"Is stealing ever justified");
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
        int difference = seconds2 - seconds1;
        difference = seconds2 - seconds1;
        JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 +
        "\nStart seconds: " + seconds1 +
        "\nIt took " + difference + " seconds for you to answer");
    }
}
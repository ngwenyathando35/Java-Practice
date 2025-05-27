/* This program is giving me stress
 * Filename RecordingSort.java
 * Written by Thando Ngwenya
 * Written on 30/07/2020
 * Description : This application instantiates five Recording objects and prompts the user for values for the 
    data fields. Then it prompts the user to enter which field the Recordings should be sorted by—song title,
    artist or playing time. It then perform the requested sort procedure, and display's the Recording objects.*/
package recording;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class RecordingSort 
{
    public static void main(String[] args) 
    {
        String artist, title, duration;
        promptDetails();
        Recording data1 = new Recording();
        Recording data2 = new Recording();
        Recording data3 = new Recording();
        Recording data4 = new Recording();
        Recording data5 = new Recording();
        String[][] data = new String[5][3];
        fillRecordingData(data1);
        populateTable();
    }
    private static String[][] populateTable() 
    {
        String[][] data = new String[5][3];
        int[][] rents = { {400 , 450 , 510},
                          {500 , 560 , 630},
                          {625 , 676 , 740},
                          {1000, 1250, 1600} };
        String entry;
        int floor, bedrooms;
        entry = JOptionPane.showInputDialog(null,"Enter a floor number ");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null,"Enter number of bedrooms ");
        bedrooms = Integer.parseInt(entry);
        JOptionPane.showMessageDialog(null,"The rent for a " + bedrooms + " bedroom apartment on floor " 
                + floor + " is R" + rents[floor][bedrooms]);
        return data;
    }
}
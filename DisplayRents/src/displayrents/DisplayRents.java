/*
 * Filename DisplayRents.java
 * Written by The Textbook
 * Description : To demonstrate the length field for a multidimensional array.The application uses the length 
    fields associated with the rents array to display all the rents. The floor variable varies from 0 through one
    less than 4 in the outer loop, and the bdrms variable varies from 0 through one less than 3 in the inner 
    loop. The program does what it is intended to do */
package displayrents;
public class DisplayRents
{
    public static void main(String[] args) 
    {
        int[][] rents = { {400, 450, 510},
                          {500, 560, 630},
                          {625, 676, 740},
                          {1000, 1250, 1600} };
        int floor;
        int bdrms;
        for(floor = 0; floor < rents.length; ++floor)
            for(bdrms = 0; bdrms < rents[floor].length; ++bdrms)
                System.out.println("Floor " + floor + " Bedrooms " + bdrms + 
                        " Rent is $" + rents[floor][bdrms]);
    }
}
/* Filename EventDemo.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Modified on 17/08/20. Creates an array of Event objects;
 * Description : The program accepts and displays data for an array of three Event objects    */
package carlyseventprice;
import java.util.Scanner;
public class EventDemo 
{
    public static void main(String[] args)
    {
        Event data[] = new Event[8];
        CarlysEventPricewithMethods.displayMotto();
        fillArray(data);
        display(data);
        sortArray(data);
    }
    private static void display(Event data[]) 
    {
        for(int x = 0; x < data.length - 1; x++)
        {
            System.out.println("Event number :        " + data[x].getEventNum());
            System.out.println("Number of guests of : " + data[x].getGuests());
            System.out.println("Type of event :       " + data[x].getEventType(x));
        }
    }
    public static Event whichIsLarger(Event data1, Event data2) 
    {
        if (data1.getGuests() > data2.getGuests())
            return data1;
        else
            return data2;
    }
    private static Event[] fillArray(Event[] data) 
    {
        Scanner input = new Scanner(System.in);
        String eventNum = null;
        int numGuests, eventType;
//         The user is supposee to fill in the values but because, it's too long the input will not be prompted from the user
//        for(int x = 0; x < data.length; x++)
//        {
//            System.out.println("Please enter the event number");
//            eventNum = input.nextLine();
//            System.out.println("Please enter the number of guests");
//            numGuests = input.nextInt();
//            System.out.println("What type of Event is it?\n"
//                    + "Enter : 1 for Wedding\n2 for Baptism\n3 for Birthday\n4 for Corporate\n"
//                    + "5 for  Other");
//            eventType = input.nextInt();
//            data[x] = new Event(eventNum, numGuests, eventType);
//        }
        data[0] = new Event("A154", 21);
        data[1] = new Event("B224", 50);
        data[2] = new Event("E253", 10);
        data[3] = new Event("F254", 52);
        data[4] = new Event("D254", 45);
        data[5] = new Event("G654", 98);
        data[6] = new Event("A754", 22);
        data[7] = new Event("C284", 11);
        return data;
    }
    private static void sortArray(Event[] data) 
    {
        //This method is suppose to sort the array using one of the fields
    }
}
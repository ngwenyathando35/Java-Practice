/*
/*
Programmer	: Textbook
Date		: July 2018
Program		: PassArrayElement
Description	:
*/
package passarrayelement;

public class PassArrayElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //The application creates an array of four integers and displays them.
        final int NUM_ELEMENTS = 4;
        int[] someNums = {5, 10, 15, 20};
        int x;
        System.out.print("At start of main: ");
        //Then, the application calls the methodGetsOneInt() method four times, passing each element in turn.
        for (x = 0; x < NUM_ELEMENTS; ++x) 
        {
            System.out.print(" " + someNums[x]);
        }
        System.out.println();
        
        //The method displays the number, changes the number to 999, and then displays the number again.
        for (x = 0; x < NUM_ELEMENTS; ++x) {
            methodGetsOneInt(someNums[x]);
        }
        System.out.print("At end of main: ");
        for (x = 0; x < NUM_ELEMENTS; ++x) {
            System.out.print(" " + someNums[x]);
        }
        System.out.println();
    }
    //Finally, back in the main() method, the four numbers are displayed again.
    public static void methodGetsOneInt(int one) {
        System.out.print("At start of method one is: " + one);
        one = 999;
        System.out.println(" and at end of method one is: " + one);
    }

}

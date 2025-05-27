/* Filename PassArray.java
 * Written by The textbook
 * Description :This class creates an array of four integers. After the integers are displayed, the array name 
    (its address) is passed to a method named methodGetsArray(). Within the method, the numbers are displayed, 
    which shows that they retain their values from main(), but then the value 888 is assigned to each number. 
    Even though methodGetsArray() is a void method—meaning nothing is returned to the main() method—when the 
    main() method displays the array for the second time, all of the values have been changed to 888. Because the
    method receives a reference to the array, the methodGetsArray() method “knows” the address of the array 
    declared in main() and makes its changes directly to the original array.                                 */
package passarray;
public class PassArray 
{
    public static void main(String[] args) 
    {
        final int NUM_ELEMENTS = 4;
        int[] someNums = {5, 10, 15, 20};
        int x;
        System.out.print("At start of main: ");
        for (x = 0; x < NUM_ELEMENTS; ++x) 
            System.out.print(" " + someNums[x]);
        System.out.println();
        methodGetsArray(someNums);
        System.out.print("At end of main: ");
        for (x = 0; x < NUM_ELEMENTS; ++x) 
            System.out.print(" " + someNums[x]);
        System.out.println();
    }
    public static void methodGetsArray(int[] arr)
    {
        int x;
        System.out.print("At start of method arr holds: ");
        for(x = 0; x < arr.length; ++x)
            System.out.print(" " + arr[x]);
        System.out.println();
        for(x = 0; x < arr.length; ++x)
            arr[x] = 888;
        System.out.print(" and at end of method arr holds: ");
        for(x = 0; x < arr.length; ++x)
            System.out.print(" " + arr[x]);
        System.out.println();
    }
}
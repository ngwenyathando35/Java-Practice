/* Exception Handling
 * Filename DemoStackTrace.java
 * Written by Thando Ngwenya
 * Written on 07Oct2020
 * Description : Demonstrating Tracing an Exception through the CallStack. This program has a printStackTrace()
        method which produces a trace of the trail taken by a thrown exception. The call to methodB() has been 
        placed in a try block so that the exception can be caught. Instead of throwing the exception to the 
        operating system, this program catches the exception and displays a stack trace history list, and 
        continues to execute. This program does not end abruptly.
 */
package demostacktrace;
public class DemoStackTrace2 
{
    public static void main(String[] args)
    {
        methodA(); // line 5
    }
    public static void methodA()
    {
        System.out.println("In methodA()");
        try
        {
            methodB(); // line 12
        }
        catch(ArrayIndexOutOfBoundsException error)
        {
            System.out.println("In methodA() - The stack trace:");
            error.printStackTrace();
        }
        System.out.println("methodA() ends normally.");
        System.out.println("Application could continue " + "from this point.");
    }
    public static void methodB()
    {
        System.out.println("In methodB()");
        methodC(); // line 26
    }
    public static void methodC()
    {
        System.out.println("In methodC()");
        int[] array = {0, 1, 2};
        System.out.println(array[3]); // line 32
    }
}
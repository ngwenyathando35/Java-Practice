/* Exception Handling
 * Filename DemoStackTrace.java
 * Written by Thando Ngwenya
 * Written on 07Oct2020
 * Description : Demonstrating Tracing Exceptions through the call stack. The main() method of this program calls 
        methodA(), which displays a message and calls methodB(). Within methodB(), another message is displayed 
        and methodC() is called. In methodC(), yet another message is displayed. Then, a three-integer array is 
        declared, and the program attempts to display the fourth element in the array. This program compiles 
        correctly—no error is detected until methodC() attempts to access the out-of-range array element. 
*/
package demostacktrace;
public class DemoStackTrace 
{
    //public static void main(String[] args)
    {
        methodA(); // line 5
    }
    public static void methodA()
    {
        System.out.println("In methodA()");
        methodB(); // line 10
    }
    public static void methodB()
    {
        System.out.println("In methodB()");
        methodC(); // line 15
    }
    public static void methodC()
    {
        System.out.println("In methodC()");
        int [] array = {0, 1, 2};
        System.out.println(array[3]); // line 21
    }
}
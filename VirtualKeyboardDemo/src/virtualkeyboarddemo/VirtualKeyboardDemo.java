/*
 * Filename VirtualKeyboardDemo.java
 * Written by The Textbook pg 650
 * Written on 7/01/2021
 * Description : A virtual keyboard is a computer keyboard that appears on the screen. A user operates it by using
        a mouse to point to and click keys; if the computer has a touch screen, the user touches keys with a 
        finger or stylus. This program shows how to bring up the virtual keyboard in the Windows operating system
 */
package virtualkeyboarddemo;
import java.util.Scanner;
import java.io.IOException;
public class VirtualKeyboardDemo 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        try
        {
            Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        String name;
        System.out.print("Enter name >> ");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
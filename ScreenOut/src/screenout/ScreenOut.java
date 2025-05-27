/* File Input and Output : Using Java's IO Classes
 * Filename ScreenOut.java
 * Written by The Textbook pg 683
 * Written on 23Jan2020
 * Description : Demonstrating OutputStream methods. Works as intended */
package screenout;
import java.io.*;
public class ScreenOut 
{
    public static void main(String[] args) 
    {
     // A string of letter grades allowed in a course are declared
        String s = "ABCDF";
     // The getBytes() method converts the String to an array of bytes
        byte[] data = s.getBytes();
     // An OutputStream object is declared
        OutputStream output = null;
        try
        {
         // System.out is assigned to the OutputStream reference 
            output = System.out;
         // The write() method accepts the byte array and sends it to the output device
            output.write(data);
         // the output stream is then flushed and closed   
            output.flush();
            output.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}
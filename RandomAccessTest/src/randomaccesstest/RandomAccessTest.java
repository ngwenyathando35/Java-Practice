/* File Input and Output
 * Filename RandomAccessTest.java
 * Written by The Textbook pg 695
 * Written on 02/02/2021
 * Description : Learning About Random Excess Files. The FileChannel class is used to create random access files. A file channel object is an avenue for 
        reading and writing to a file. Works as intended. */
package randomaccesstest;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class RandomAccessTest 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\Numbers.txt");
     // In the following two lines, a byte array is being built from a string using the getBytes() method
        String s = "RSV";
        byte[] data = s.getBytes();
     // The byte array is being wrapped into a ByteBuffer so that changes being made to the array will also be made into the buffer and vice versa
        ByteBuffer out = ByteBuffer.wrap(data);
        FileChannel fc = null;
        try
        {
            fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
            fc.position(0); // Sets the channels file position
            while(out.hasRemaining())// Checks if the contents of the ByteBuffer - out - have been used up
                fc.write(out);// The filled ByteBuffer is being written to the declared FileChannel 
            out.rewind();// Writes the same info to the ByteBuffer and then repositions the ByteBuffer to the beginning of the buffer
            fc.position(22);
            while(out.hasRemaining())
                fc.write(out);
            out.rewind();
            fc.position(12);
            while(out.hasRemaining())
                fc.write(out);
            fc.close();
        }
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}
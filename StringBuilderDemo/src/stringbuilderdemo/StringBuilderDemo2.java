/* Filename StringBuilderDemo2.java
 * Written by Thando Ngwenya
 * Description : 
 */
package stringbuilderdemo;
public class StringBuilderDemo2 
{
    public static void main(String[] args) 
    {
        StringBuilder phrase = new StringBuilder("Happy");
        System.out.println("Original Word                    >> " + phrase);
        phrase.append(" birthday");
        System.out.println("After appending                  >> " + phrase);
        phrase.insert(6, "30th ");
        System.out.println("Ater inserting values            >> " + phrase);
        phrase.setCharAt(6,'4');
        System.out.println("Ater changing a single character >> " + phrase);
        
        System.out.println("Ater changing a single character >> " + phrase);
        
    }
}
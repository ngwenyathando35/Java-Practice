/* Filename FormLetterWriter.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : Method to demonstrate method overloading                
*/
package formletterwriter;
public class FormLetterWriter 
{
    private static String lastName;
    private static String firstName;
    public static void main(String[] args) 
    {
        String firstName = "Thando", lastName = "Ngwenya";
        displaySalutation(lastName);
        displaySalutation(firstName, lastName);
        System.out.println("Thank you for your recent order");
    }
    public static void displaySalutation(String lstNme, String frstNme)
    {
        lastName = lstNme;
        firstName = frstNme;
        System.out.println("Dear " + firstName + " " + lastName);
    }
    public static void displaySalutation(String lstNme)
    {
        lastName = lstNme;
        System.out.println("Dear Mr or Mrs " + lastName);
    }
}
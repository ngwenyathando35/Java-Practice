/*
 * Filename .java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : The program assigns an id number, age and a blood type of a patient. It runs and compiles
                 successfully but there seems to be a logic error with the bloodtype
 */
package blooddata;
public class TestPatient 
{
    public static void main(String[] args) 
    {
        
        Patient data = new Patient();
        long idNum = data.getIdNum();
        byte age = data.getAge();
        //There is a logic error in the following code because it returns a hash code on, not the required data
        //There's a possibility that the bug might be on line 21
        BloodData bloodtype = new BloodData(); 
        System.out.println("ID number >> " + idNum + 
                "\nAge >> " + age + 
                "\nBloodType >> " + bloodtype);
    }
}
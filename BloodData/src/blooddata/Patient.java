package blooddata;
import blooddata.BloodData;
/*
 * Filename .java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : A class that has set and get methods, and an overloaded constructor for the TestPatient class
                 It imports the BloodData class
 */
public class Patient 
{
    private long idNum;
    private byte age;
    private BloodData bloodtype;
    public Patient()
    {
        idNum = 9707095302080L;
        age = 0;
        bloodtype = new BloodData();
    }
    public Patient(long id, byte age, BloodData data1)
    {
        idNum = 2021549865475L;
        this.age = 9;
        //The hash code problem might be here
        bloodtype = new BloodData("AB",'-');
    }
    public void setIdNum(long id)
    {
        idNum = id;
    }
    public long getIdNum()
    {
        return idNum;
    }
    public void setAge(byte age)
    {
        this.age = age;
    }
    public byte getAge()
    {
        return age;
    }
   
}

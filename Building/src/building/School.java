/*
 * Filename School.java
 * Written by Thando Ngwenya
 * Written on 29/09/2020
 * Description : This is a subclass that has two data fields that have set and get methods for the fields*/
package building;
public class School extends Building
{
    private int numRooms;
    private String gradeLevel;
    public void setNumRooms(int classrooms)
    {
        numRooms = classrooms;
    }
    public int getNumClassrooms()
    {
        return numRooms;
    }
    public void setGradeLevel(String gradeLevel)
    {
        this.gradeLevel = gradeLevel;
    }
    public String getGradeLevel()
    {
        return gradeLevel;
    }
}
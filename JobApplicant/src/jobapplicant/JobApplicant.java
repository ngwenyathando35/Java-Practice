/*
 * Filename Thando Ngwenya.java
 * Written by Thando Ngwenya
 * Written on 06/05/2020
 * Description : This class holds data about a job applicant. It includes a name, a phone number, and four 
    Boolean fields that represent whether the applicant is skilled in each of the following areas: word 
    processing, spreadsheets, databases, and graphics.
 */
package jobapplicant;
public class JobApplicant 
{
    private String name, number;
    private boolean word, excel, access, graphics;
    public JobApplicant(String name, String number,boolean word,boolean excel,boolean graphics, boolean access)
    {
        this.name = name;
        this.number = number;
        this.word = word;
        this.excel = excel;
        this.graphics = graphics;
        this.access = access;
    }
    public String getName()
    {
        return name;
    }
    public String getNumber()
    {
        return number;
    }
    public boolean getWord()
    {
        return word;
    }
    public boolean getExcel()
    {
        return excel;
    }
    public boolean getGraphics()
    {
        return graphics;
    }
    public boolean getAccess()
    {
        return access;
    }
}
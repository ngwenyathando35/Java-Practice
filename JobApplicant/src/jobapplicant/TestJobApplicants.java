/* Filename TestJobApplicants.java
 * Written by Thando Ngwenya
 * Written on 06/05/2020
 * Description : This class instantiates several job applicant objects and passes each in turn to a method that 
    determines whether each applicant is qualified for an interview. It then displays an appropriate method for 
    each applicant. A qualified applicant has at least three of the four skills.
 */
package jobapplicant;
public class TestJobApplicants 
{
    public static void main(String[] args) 
    {
        JobApplicant applicant1 = new JobApplicant("Phillip","0658479548",true,true,true, false);
        JobApplicant applicant2 = new JobApplicant("Mxolisi","0784962214",true,false,false,true);
        JobApplicant applicant3 = new JobApplicant("Nqobile","0119314587",true,true,true,false);
        qualifiedApplicant(applicant1);
        qualifiedApplicant(applicant2);
        qualifiedApplicant(applicant3);
    }
    public static void qualifiedApplicant(JobApplicant yah)
    {
        byte score = 0;
        String name, number;
        boolean canWord, canExcel, canAccess, canGraphics;
        name = yah.getName();
        number = yah.getNumber();
        canWord = yah.getWord();
        canExcel = yah.getExcel();
        canAccess = yah.getAccess();
        canGraphics = yah.getGraphics();
        if(canWord == true)
            score++;
        if(canExcel == true)
            score++;
        if(canAccess == true)
            score++;
        if(canGraphics == true)
            score++;
        if(score >= 3)
            System.out.println("Hi " + name + " You qualify for the job");
        else
            System.out.println("Hi " + name + " Unfortunately, you don't qualify for the job");
    }
}
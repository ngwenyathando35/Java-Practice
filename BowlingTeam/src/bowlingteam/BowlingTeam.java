/* Filename BowlingTeam.java
 * Written by The textbook on page 409
 * Description : Demonstrates creating an array of objects */
package bowlingteam;
public class BowlingTeam 
{
    private String teamName;
    private String[] members = new String[4];
    public void setTeamName(String team)
    {
        teamName = team;
    }
    public String getTeamName()
    {
        return teamName;
    }
    public void setMember(int number, String name)
    {
        members[number] = name;
    }
    public String getMember(int number)
    {
        return members[number];
    }
}
/* Filename BowlingTeamDemo.java
 * Written by The textbook
 * Description : Demonstrates the array for objects using the BowlingTeam class */
package bowlingteam;
import java.util.Scanner;
public class BowlingTeamDemo4
{
    public static void main(String[] args) 
    {
        String name;
        final int NUM_OF_TEAMS = 4;
        BowlingTeam teams[] = new BowlingTeam[NUM_OF_TEAMS];
        int x, y = 0;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);
        getTeamData(teams);
        System.out.println("\nMembers of team " + teams[y].getTeamName());
        for(y = 0; y < NUM_OF_TEAMS; ++y)
        {
            System.out.println("\nMembers of team " +
            teams[y].getTeamName());
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            System.out.print(teams[y].getMember(x) + " ");
            System.out.println();
            
        }
        System.out.println();
        System.out.print("\n\nEnter a team name to see its roster >> ");
        name = input.nextLine();
    }
    public static void getTeamData(BowlingTeam[] teams)
    {
        String name;
        final int NUM_OF_TEAMS = 4;
        int x, y;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);
        for(y = 0; y < NUM_OF_TEAMS; ++y)
        {
            teams[y] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }
    }
}
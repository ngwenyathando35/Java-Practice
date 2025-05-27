package dogtriathlonparticipant;
/*
 * Filename DogTriathlonParticipant.java
 * Written by The Tecxbook pg 217
 * Written on 29/04/2020
 * Description : To demonstrate the use of Static and Nonstatic final Fields, and decision Making
 */
public class DogTriathlonParticipant2
{
    private final int NUM_EVENTS ;  
    private int totalCumulativeScore = 0;
    private String name;
    private int obedienceScore;
    private int agilityScore;
    private int total;
    private double avg;
    private int conformationScore;
    private boolean scoresAgree;
    public DogTriathlonParticipant2(String name,int numEvents, int score1, int score2, int score3)
    {
        
        this.name = name;
        NUM_EVENTS = numEvents;
        int totalNot0 = 0;
        if(score1 != 0)
            totalNot0 = totalNot0 + 1;
        if(score2 != 0)
            totalNot0 = totalNot0 + 1;
        if(score3 != 0)
            totalNot0 = totalNot0 + 1;
        if(numEvents == totalNot0)
            scoresAgree = true;
        else
            scoresAgree = false;
        if(scoresAgree)
        {
            obedienceScore = score1;
            conformationScore = score2;
            agilityScore = score3;
        }
        else
        {
            obedienceScore = 0;
            conformationScore = 0;
            agilityScore = 0;
        }
        total = obedienceScore + conformationScore + agilityScore;
        if(NUM_EVENTS == 0)
            avg = 0;
        else
            avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
    }
    public void display()
    {
        if(!scoresAgree)
            System.out.println("\nNotice! Number of events for " +
                name + " does not agree with scores reported.");
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has "
            + "an average score of " + avg);
        System.out.println(" " + name + " has a total score of " + total + " bringing"
            + " the total cumulative score to " + totalCumulativeScore);
    }
}
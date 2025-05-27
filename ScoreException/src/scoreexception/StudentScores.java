package scoreexception;
/* Filename StudentScores.java
 * Written by Thando Ngwenya
 * Written on 11Jan2021 pg660
 * Description : /* I did't finish this program*/
public class StudentScores 
{
    private String id;
    private int score;
    public StudentScores(String id, int score) throws ScoreException
    {
        this.id = id;
        this.score = score;
        if(score < 0 || score > 100)
            throw (new ScoreException());
    }
}
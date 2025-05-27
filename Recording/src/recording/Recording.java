/*
 * Filename Recording.java
 * Written by Thando Ngwenya
 * Written on 30/07/2020
 * Description : The program has fields to hold methods for setting and getting a Recording’s title, artist, and 
    playing time in seconds.  */
package recording;
public class Recording 
{
    private String title, artist, duration;
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    public String getArtist()
    {
        return artist;
    }
    public void setDuration(String lengthInSeconds)
    {
        duration = lengthInSeconds;
    }
    public String getDuration()
    {
        return duration;
    }
}
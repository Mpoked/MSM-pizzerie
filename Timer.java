import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiemr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    public static int casovacT = 1000;
    
    public Timer()
    {
        casovacT = 1000;
    }
    public void act()
    {
        getWorld().showText("čas: " + casovacT, getX(), getY());
        casovacT--;
        
        if (casovacT <= 0)
        {
            Greenfoot.setWorld(new GameOver());
        }
    }
}

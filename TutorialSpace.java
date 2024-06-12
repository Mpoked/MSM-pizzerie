import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialSpace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialSpace extends Actor
{
    /**
     * Act - do whatever the TutorialSpace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new Podlaha());
        }
    }
}

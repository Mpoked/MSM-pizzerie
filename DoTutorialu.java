import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoTutorialu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoTutorialu extends Actor
{
    /**
     * Act - do whatever the DoTutorialu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("shift")) {
            Greenfoot.setWorld(new Tutorial());
        }
    }
}

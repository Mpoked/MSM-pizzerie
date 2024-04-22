import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chef extends Actor
{
    /**
     * Act - do whatever the Chef wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int zd = 0;
    public void act()
    {
        if(isTouching(Zed.class)){
            zd = 1;
        }
        else{
            zd = 0;
        }
        if(Greenfoot.isKeyDown("a") & zd == 0){
            setRotation(180);
            move(2);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("s")){
            setRotation(90);
            move(2);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("w")){
            setRotation(-90);
            move(2);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("d")){
            setRotation(0);
            move(2);
        }

    }

        
    
}

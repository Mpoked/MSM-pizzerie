import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chef extends Actor
{
    GreenfootImage Pizza = new GreenfootImage("tělo-pizza-right.png");
    GreenfootImage Telo = new GreenfootImage("tělo-right.png");
    
    private boolean pizzaTesto = false;
    private boolean pizza = false;
    private int zd = 0;
    public void act()
    {
        pohyb();
        pizza();
    }
    public void pohyb()
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
        }
        if(Greenfoot.isKeyDown("s")){
            setRotation(90);
            move(2);
        }
        if(Greenfoot.isKeyDown("w")){
            setRotation(-90);
            move(2);
        }
        if(Greenfoot.isKeyDown("d")){
            setRotation(0);
            move(2);
        }

    }
    public void pizza()
    {
        if (isTouching(Storage.class) && Greenfoot.isKeyDown("space"))
        {
            setImage(Pizza);
        }
    }
    public void zmenaObrazku()
    {
        
    }
}

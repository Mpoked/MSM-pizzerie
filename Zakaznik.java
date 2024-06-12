import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zakaznik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zakaznik extends Actor
{
    private int poradiStolu;
    private boolean odchod = false;
    private Actor casovac2; 
    public Zakaznik(int poradi, Actor timer)
    {
        poradiStolu = poradi;
    }
    public void act()
    {
        poradiStolu1();
        poradiStolu2();
        poradiStolu3();
        poradiStolu4();
        odchod();
        metodaCasovac();
        
        
    }
    public void poradiStolu1()
    {
        if (poradiStolu == 1 && !isTouching(Zidle.class) && odchod == false)
        {
            turnTowards(280, 90);
                move(2);
                setRotation(0);
        }
    }
    public void poradiStolu2()
    {
        if (poradiStolu == 2 && !isTouching(Zidle.class) && odchod == false)
        {
            turnTowards(280, 190);
                move(2);
                setRotation(0);
        }
    }
    public void poradiStolu3()
    {
        if (poradiStolu == 3 && !isTouching(Zidle.class) && odchod == false)
        {
            turnTowards(280, 290);
                move(2);
                setRotation(0);
        }
    }
    public void poradiStolu4()
    {
        if (poradiStolu == 4 && !isTouching(Zidle.class) && odchod == false)
        {
            turnTowards(280, 390);
                move(2);
                setRotation(0);
        }
    }
    
    public void odchod()
    {
        if (isTouching(Odejdi.class))
        {
            
            odchod = true;
        }
        if (odchod == true)
        {
            turnTowards(0, 222);
            move(2);
            setRotation(0);
        }
        if (getX() == 0 && getY() == 222)
        {
            odchod = false;
        }
        if (isAtEdge())
        {
            setLocation(60, 0);
            
        }
    }
    
    public void metodaCasovac()
    {
        if (getX() == 20)
        {
            Timer.casovacT += 600;
        }
    }
}

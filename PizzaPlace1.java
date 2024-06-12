import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PizzaPlace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PizzaPlace1 extends Actor
{
    /**
     * Act - do whatever the PizzaPlace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage Pizza1 = new GreenfootImage("pizzaOdevzdana.png");
    private boolean pizzaPick = true;
    private int poziceOdejdi;
    public PizzaPlace1(int pozice)
    {
        poziceOdejdi = pozice;
    }
    public void act()
    {


        if(Greenfoot.isKeyDown("space") ){   
            if(pizzaPick = true){
                if(isTouching(Chef.class) && Chef.postupPizzi == 4){
                    setImage(Pizza1);
                    
                    Chef.postupPizzi = 0;
                    
                    Odejdi odejdi = new Odejdi();
                    getWorld().addObject(odejdi,280,poziceOdejdi);
                }
            }
        }
        
        if (isTouching(Odejdi.class))
        {
            setImage("Wall.jpg");
        }
    }
}

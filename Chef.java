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
    private int tb = 0;
    public static int postupPizzi = 0;
    public Chef()
    {
        postupPizzi = 0;
    }
    public void act()
    {
        pohyb();
        pizza();
        omacka();
        syr();
        upectPizzu();
        zmizeniPizzy();
    }

    public void pizza()
    {
        if (postupPizzi == 0 && isTouching(Pizza.class) && Greenfoot.isKeyDown("space"))
        {
            setImage("tělo-pizza-right.png");
            postupPizzi = 1;
        }
    }

    public void omacka() {
        if(postupPizzi == 1 && isTouching(Omacka.class) && Greenfoot.isKeyDown("space")) {
            setImage("pizzaOmacka.png");
            postupPizzi = 2;

        }
    }

    public void syr() {
        if(postupPizzi == 2 && isTouching(Syr.class) && Greenfoot.isKeyDown("space")) {
            setImage("pizzaSyr.png");
            postupPizzi = 3;

        }
    }

    public void upectPizzu() {
        if(postupPizzi == 3 && isTouching(Pec.class) && Greenfoot.isKeyDown("space")) {
            setImage("pizzaUpecena.png");
            postupPizzi = 4;

        }
    }
    
    public void zmizeniPizzy()
    {
        if (zd == 1 && Greenfoot.isKeyDown("space") && postupPizzi == 4)
        {
            setImage("tělo-right.png");
            
        }
    }
    
    public void pohyb()
    {
        if(isTouching(Zed.class)){
            zd = 1;
        }
        else{
            zd = 0;
        }
        if(isTouching(Table.class) || isTouching(Pec.class)){
            tb = 1;
        }
        else{
            tb = 0;
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
        if(Greenfoot.isKeyDown("d") && tb == 0){
            setRotation(0);
            move(2);
        }

    }

    

    public void zmenaObrazku()
    {

    }
}

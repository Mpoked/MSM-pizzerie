import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Podlaha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Podlaha extends World
{

    /**
     * Constructor for objects of class Podlaha.
     * 
     */
    public Podlaha()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 500, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Zed zed = new Zed();
        addObject(zed,325,250);

        Zidle zidle = new Zidle();
        addObject(zidle,320,100);

        Zidle zidle2 = new Zidle();
        addObject(zidle2,320,200);

        Zidle zidle3 = new Zidle();
        addObject(zidle3,320,300);

        Zidle zidle4 = new Zidle();
        addObject(zidle4,320,400);

        Pec pec = new Pec();
        addObject(pec,710,40);
        
        addObject(new Table(), 720, 290);

        Chef chef = new Chef();
        addObject(chef,600,250);

        Pizza pizza = new Pizza();
        addObject(pizza,693,460);

        addObject(new Syr() , 693, 322);
        addObject(new Omacka(), 695, 170);

        addObject(new Dvere(0), 44, 24); 
        addObject(new Dvere(270), 25, 235);
        
        Timer timer = new Timer();
        addObject(timer, 420, 20);

        int poziceStolu = 100;
        for (int i = 0; i < 4; i++)
        {
            addObject(new PizzaPlace1(poziceStolu),325,poziceStolu);
            poziceStolu += 100;
        }
        

        int zakaznikCislo = 1;
        for (int i = 0; i < 4; i++)
        {
            addObject(new Zakaznik(zakaznikCislo, timer), 50, 0);
            zakaznikCislo++;
        }
    }
}

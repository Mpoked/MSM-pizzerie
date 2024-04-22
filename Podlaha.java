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
        addObject(zidle,280,100);

        Zidle zidle2 = new Zidle();
        addObject(zidle2,280,200);

        Zidle zidle3 = new Zidle();
        addObject(zidle3,280,300);

        Zidle zidle4 = new Zidle();
        addObject(zidle4,280,400);

        
        
        Pec pec = new Pec();
        addObject(pec,710,40);

        Pec pec2 = new Pec();
        addObject(pec2,710,120);

        Table table = new Table();
        addObject(table,710,200);

        Storage storage = new Storage();
        addObject(storage,710,360);

        
        Chef chef = new Chef();
        addObject(chef,600,250);
        
        
        Pizza pizza = new Pizza();
        addObject(pizza,710,360);
    }
    private int zkCount = 0;
    public void act(){
        zkCount ++;
        if (zkCount == Greenfoot.getRandomNumber(10)+5){
            Zakaznik zak = new Zakaznik();
            addObject(zak,150,0);
            zkCount = 100;
        
        }
     System.out.println(zkCount);

    }
}

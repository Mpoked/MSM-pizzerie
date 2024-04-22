import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zakaznik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zakaznik extends Actor
{
 
       
    private static boolean z1 = false;
    private static boolean z2 = false;
    private static boolean z3 = false;
    private static boolean z4 = false;
    private int sitPlace = Greenfoot.getRandomNumber(1)+1;
    public Zakaznik(){


    }
    public void act()
    {
        posadit();
        
        

        
        
        
    }
    private void posadit(){
        if(sitPlace == 1){
            if(getX() < 280){
                if(getY() > 90){
                setRotation(0);
                move(2);
                }
                else{
                    setRotation(90);    
                    move(5);
                    setRotation(0);
                }
            }
            else{
    
            }
            z1 = true;
        }
        
        if(sitPlace == 2){
            if(getX() < 280){
                if(getY() > 190){
                setRotation(0);
                move(2);
                }
                else{
                    setRotation(90);    
                    move(5);
                    setRotation(0);
                }
            }
            else{
    
            }
            z2 = true;
        }
        
        if(sitPlace == 3){
            if(getX() < 280){
                if(getY() > 290){
                setRotation(0);
                move(2);
                }
                else{
                    setRotation(90);    
                    move(5);
                    setRotation(0);
                }
            }
            else{
    
            }
            z3 = true;
        }
        
        if(sitPlace == 4){
            if(getX() < 280){
                if(getY() > 390){
                setRotation(0);
                move(2);
                }
                else{
                    setRotation(90);    
                    move(5);
                    setRotation(0);
                }
            }
            else{
    
            }
            z4 = true;
        }
    }
}

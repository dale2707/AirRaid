import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Launcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Launcher extends Actor
{
    private int delay = 0; //to give the rocket time to get to the top

    /**
     * Act - do whatever the Launcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
       delay();
    }
    public void move()
    {
    if (Greenfoot.isKeyDown ("A"))
        {
            move (-3);
        }
    if (Greenfoot.isKeyDown("D"))
        {
            move (3);
        }
    }
    private void delay()
    {
        if (delay > 0)
        {
            delay--;
        }
        else
        {
            if(Greenfoot.isKeyDown("space")){
                World airWorld = getWorld();
                //X and Y are screen coordinates of the launcher
                airWorld.addObject(new Rocket(), getX(), getY());
                Greenfoot.playSound("RocketTakeoff.mp3");

                delay = 25;
            }
        }
    }
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        bounceX();
        drop();
    }

    public void bounceX()
    {
        move (3);
        int xCoord = getX();
        if (xCoord <=0 || xCoord >= 599)
        {
            int random = Greenfoot.getRandomNumber (41);
            turn (180);
        }
    }
    public void drop()
    {
    int random = Greenfoot.getRandomNumber (100);
    if(random == 1)
    {
        World airWorld = getWorld();
        airWorld.addObject(new Crate(),getX(),getY());
    }
}
}

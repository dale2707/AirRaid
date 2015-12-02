import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crate extends Actor
{public Crate()
    {
        setRotation(-90);
    }

    public void act()
    {
        move(-2);
        int yCoord =getY();
        if(yCoord >=399)
        {

            AirRaidWorld airWorld =(AirRaidWorld)getWorld();
            airWorld.removeObject(this);
            airWorld.loseLife();

        }
    }
}
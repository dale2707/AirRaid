import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{public Rocket()
   {
       setRotation(270);
       
    }
public void act()
   {
       move(10);
       
   Actor actor = getOneIntersectingObject(Crate.class);
   
   if (actor!=null)
   {
       //World AirRaidWorld=getWorld();
       AirRaidWorld airWorld =(AirRaidWorld)getWorld();
       airWorld.removeObject(actor); //remove crate
       airWorld.removeObject(this); //remove rocket
       airWorld.increaseScore();
       
       
    }
else
    {
        
        actor = getOneIntersectingObject(Plane.class);
        if(actor!=null)
        {
            
            AirRaidWorld airWorld =(AirRaidWorld)getWorld();
            airWorld.removeObject(actor);
            airWorld.removeObject(this);
            airWorld.increaseScore();
        }
        else
        {
            int yCoord =getY();
             if(yCoord<=0)
             {
              World AirRaidWorld=getWorld();
              AirRaidWorld.removeObject(this);
              
              
            }
        }
    }
}
}
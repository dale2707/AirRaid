import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirRaidWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirRaidWorld extends World
{
    private int score = 0;//at the start of the game set score to 0 and lives to 3
    private int lives = 3;
    private StatusBoard scoreBoard;
    /**
     * Constructor for objects of class AirRaidWorld.
     * 
     */
    public AirRaidWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);//create a new world with 600x400 cells with a cell size of 1x1 pixels
        prepare();//add the launcher and plane
        scoreBoard = new StatusBoard();
        addObject(scoreBoard, 50 ,370);
        scoreBoard.updateStatus (score,lives);
    }
    
    private void prepare()
    {
        addObject(new Launcher(), 300, 375);
        addObject(new Plane(), 100, 30);
    }
    public void increaseScore()
    {
        score = score + 1;
        scoreBoard.updateStatus (score,lives);
    }
    public int getScore()
    {
        return score;
    }
    public void loseLife()
    {
        lives = lives -1;
        scoreBoard.updateStatus (score,lives);
        if (lives == 0)//if no lives left
        {
            Greenfoot.stop(); //game over
        }
    }
    
    public int getLives()
    {
        return lives;
    }
    }

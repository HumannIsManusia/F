import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Players extends Actor
{

    /**
     * Act - do whatever the Players wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        int xPoss = this.getX();
        int yPoss = this.getY();
        World wrld = this.getWorld();
        this.move(1);
        
        if (Greenfoot.isKeyDown("space")){
            this.setLocation(xPoss, yPoss-10);
        }
        
        if (xPoss == wrld.getWidth()-1){
            this.setLocation(0, yPoss);
        }
        
        if (yPoss == wrld.getWidth()-1){
            this.setLocation(xPoss, 0);
        }
            }
    }
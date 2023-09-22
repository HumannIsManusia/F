import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class stage1 extends MyWorld
{
    int gravity = 1;
    /**
     * Constructor for objects of class stage1.
     */
    public stage1()
    {
        Players snake = new Players();
        this.addObject(snake, 300, 200);
        this.gravity = 5;
        Players snake2 = new Players();
        this.addObject(snake2, 400, 100);
    }
    public void setGravity(int gravity){
        this.gravity = gravity;
    }
    public int getGravity(int gravity){
        return this.gravity;
    }
    /**
     * 
    */  
    public void act(){
    List<Players> allChars = this.getObjects(Players.class);
    for(Players chara : allChars){
        int xPoss = chara.getX();
        int yPoss = chara.getY();
        chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
    
}

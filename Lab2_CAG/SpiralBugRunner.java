/* 
 * /* 
 * AP(r) Computer Science GridWorld Case Study:
 * SpiralBug object runner
 * Modified by: Christopher Gosnell
 * Date: 10/5/08
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;


public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug(6);
        alice.setColor(Color.ORANGE);   
        world.add(new Location(5, 5), alice);
       
        world.show();
    }
}
/*  
 * AP(r) Computer Science GridWorld Case Study:
 * Modified by: Christopher Gosnell
 *
 * Description: This is the circleBug object which contains te movements of a circle bug. 
 */

import info.gridworld.actor.Bug;

/**
 * A <code>CircleBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class CircleBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public CircleBug(int length)
    {
        steps = 0;
        sideLength = length/2;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            
            steps = -3;
        }
    }
}

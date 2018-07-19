import info.gridworld.actor.Bug;

public class TriangleBug extends Bug
{
    private int steps;
    private int sideLength;
    private int num = 3;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public TriangleBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    
    public void act() {
    		if ((num % 3) == 0) {
    			if (steps < (2 * sideLength) && canMove()) {
        			move();
        			steps++;
        		}
    			else {
    				turn();
    				turn();
    				turn();
    				steps = 0;
    				num++;
    			}
    		}
    		else if (((num - 1) % 3) == 0) {
    			if (steps < sideLength && canMove()) {
        			move();
        			steps++;
        		}
    			else {
    				turn();
    				turn();
    				steps = 0;
    				num++;
    			}
    		}
    		else {
    			if (steps < sideLength && canMove()) {
        			move();
        			steps++;
        		}
    			else {
    				turn();
    				turn();
    				turn();
    				steps = 0;
    				num++;
    			}
    		}
    			
    }
}

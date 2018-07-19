import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

/**
 * A <code>CrabCritter</code> looks at a limited set of neighbors when it eats and moves.
 * <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class KnightCritter extends Critter
{
    public KnightCritter()
    {
        setColor(Color.RED);
    }

    /**
     * A crab gets the actors in the three locations immediately in front, to its
     * front-right and to its front-left
     * @return a list of actors occupying these locations
     */
    public ArrayList<Actor> getActors()
    {
//		MAKES LIST OF THINGS THE CRITTER CAN "EAT"
    	
        ArrayList<Actor> actors = new ArrayList<Actor>();
        
//        KNIGHT CRITTER DOESNT EAT ANYTHING --> COMMENT OUT
        
//        int[] dirs =
//            { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT };
//        for (Location loc : getLocationsInDirections(dirs))
//        {
//            Actor a = getGrid().get(loc);
//            if (a != null)
//                actors.add(a);
//        }

        return actors;
    }

    /**
     * @return list of empty locations immediately to the right and to the left
     */
    
    //says which locations are empty 
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        int[] dirs =
            { Location.LEFT, Location.RIGHT, Location.AHEAD, Location.HALF_CIRCLE};
        for (Location loc : getLocationsInDirections(dirs))
            if (getGrid().get(loc) == null)
                locs.add(loc);
        
        // what^^^^^ (thing : thing)

        return locs;
    }

    /**
     * If the crab critter doesn't move, it randomly turns left or right.
     */
//    ALREADY IN CRITTER CLASS - UNNECESSARY
    
//    public void makeMove(Location loc)
//    {
//        if (loc.equals(getLocation()))
//        {
//            double r = Math.random();
//            int angle;
//            if (r < 0.5)
//                angle = Location.LEFT;
//            else
//                angle = Location.RIGHT;
//            setDirection(getDirection() + angle);
//        }
//        else
//            super.makeMove(loc);
//    }
    
    /**
     * Finds the valid adjacent locations of this critter in different
     * directions.
     * @param directions - an array of directions (which are relative to the
     * current direction)
     * @return a set of valid locations that are neighbors of the current
     * location in the given directions
     */
    
    //finds all locations
    public ArrayList<Location> getLocationsInDirections(int[] directions)
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        
        Location loc = getLocation();
    
        for (int d : directions)
        {
            Location firstLoc = loc.getAdjacentLocation(d);
            Location secondLoc = firstLoc.getAdjacentLocation(d);
//            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            Location neighborleft = secondLoc.getAdjacentLocation(d + Location.LEFT);
            Location neighborright = secondLoc.getAdjacentLocation(Location.RIGHT);
            
            if (gr.isValid(neighborleft))
                locs.add(neighborleft);
            if (gr.isValid(neighborright))
                locs.add(neighborright);
        }
        return locs;
    }    
}

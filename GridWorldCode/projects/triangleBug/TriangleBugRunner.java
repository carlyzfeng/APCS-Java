import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class TriangleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        TriangleBug alice = new TriangleBug(6);
        alice.setColor(Color.ORANGE);
        TriangleBug bob = new TriangleBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}

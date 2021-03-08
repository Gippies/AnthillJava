package patterson.anthill;

import patterson.anthill.group.Colony;

import java.awt.Graphics;

public class Simulation {

    private final Colony colony;

    public Simulation() {
        colony = new Colony();
    }

    public void paint(Graphics g) {
        colony.paint(g);
    }

    public void update(long deltaNanoTime) {
        colony.update(deltaNanoTime);
    }
}

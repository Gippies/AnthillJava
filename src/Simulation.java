import group.Colony;

import java.awt.Graphics;

public class Simulation {

    private Colony colony;

    public Simulation() {
        colony = new Colony();
    }

    public void paint(Graphics g) {
        colony.paint(g);
    }

    public void update() {
        colony.update();
    }
}

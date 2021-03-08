package patterson.anthill;

import patterson.anthill.group.Colony;
import patterson.anthill.plant.Leaf;
import patterson.anthill.util.Constants;
import patterson.anthill.util.Vector2;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulation {

    private final Colony colony;
    private final List<Leaf> leaves;

    public Simulation() {
        Random random = new Random();
        colony = new Colony();
        leaves = new ArrayList<>();
        for (int i = 0; i < Leaf.INITIAL_NUMBER; i++) {
            leaves.add(new Leaf(new Vector2(random.nextFloat() * Constants.SCREEN_WIDTH, random.nextFloat() * Constants.SCREEN_HEIGHT)));
        }
    }

    public void paint(Graphics g) {
        colony.paint(g);
        for (Leaf leaf : leaves) {
            leaf.paint(g);
        }
    }

    public void update(long deltaNanoTime) {
        colony.update(deltaNanoTime);
        for (Leaf leaf : leaves) {
            leaf.update(deltaNanoTime);
        }
    }
}

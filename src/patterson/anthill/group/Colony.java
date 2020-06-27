package patterson.anthill.group;

import patterson.anthill.creature.ant.Ant;
import patterson.anthill.creature.ant.Role;
import patterson.anthill.util.Constants;
import patterson.anthill.util.Vector2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Colony {
    public static final int INITIAL_NUMBER_OF_GATHERERS = 40;
    public static final int INITIAL_NUMBER_OF_DIGGERS = 10;

    private final List<Ant> ants;

    public Colony() {
        ants = new ArrayList<>();

        Role gathererRole = new Role("Gatherer", Color.WHITE);
        for (int i = 0; i < INITIAL_NUMBER_OF_GATHERERS; i++) {
            ants.add(new Ant(new Vector2(Constants.SCREEN_WIDTH / 2.0f, Constants.SCREEN_HEIGHT / 2.0f), gathererRole, 0.0001f));
        }
    }

    public void paint(Graphics g) {
        for (Ant ant : ants) {
            ant.paint(g);
        }
    }

    public void update(long deltaNanoTime) {
        for (Ant ant : ants) {
            ant.update(deltaNanoTime);
        }
    }
}

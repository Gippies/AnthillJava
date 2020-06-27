package group;

import creature.ant.Ant;
import creature.ant.Role;
import util.Constants;
import util.Vector2;

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

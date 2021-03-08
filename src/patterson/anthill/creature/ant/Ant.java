package patterson.anthill.creature.ant;

import patterson.anthill.util.GraphicComponent;
import patterson.anthill.util.Vector2;

import java.awt.Graphics;
import java.util.Random;

public class Ant implements GraphicComponent {
    public static final int WIDTH = 4;
    public static final int HEIGHT = 4;
    public static final double MAX_SEARCH_SECONDS = 0.5;

    private Vector2 position;
    private Vector2 velocity;
    private float speed;
    private final Role role;
    private State state;
    private double searchNanoseconds;
    private final Random random;

    public Ant(Vector2 pos, Role r, float s) {
        position = pos;
        velocity = Vector2.zero();
        role = r;
        speed = s;
        random = new Random();
        state = State.SEARCH;
        searchNanoseconds = random.nextDouble() * MAX_SEARCH_SECONDS * Math.pow(10, 9);
    }

    public void paint(Graphics g) {
        g.setColor(role.getColor());
        g.fillRect((int) position.getX(), (int) position.getY(), WIDTH, HEIGHT);
    }

    public void update(long deltaNanoTime) {
        if (state == State.SEARCH) {
            search(deltaNanoTime);
        }

        position = position.add(velocity);
    }

    private void search(long deltaNanoTime) {
        searchNanoseconds -= deltaNanoTime;
        if (searchNanoseconds <= 0) {
            searchNanoseconds = random.nextDouble() * MAX_SEARCH_SECONDS * Math.pow(10, 9);
            float randX = random.nextFloat() * 2 - 1;
            float randY = random.nextFloat() * 2 - 1;
            Vector2 directionToGo = new Vector2(randX, randY).getNormalizedVector();
            velocity = directionToGo.mul(speed);
        }
    }
}

package creature.ant;

import util.GraphicComponent;
import util.Vector2;

import java.awt.Graphics;
import java.util.Random;

public class Ant implements GraphicComponent {
    public static final int WIDTH = 4;
    public static final int HEIGHT = 4;
    public static final double MAX_SEARCH_SECONDS = 0.01;

    private Vector2 position;
    private Vector2 velocity;
    private float speed;
    private Role role;
    private double searchNanoseconds;

    public Ant(Vector2 pos, Role r, float s) {
        position = pos;
        velocity = Vector2.zero();
        role = r;
        speed = s;
        Random rand = new Random();
        searchNanoseconds = rand.nextDouble() * MAX_SEARCH_SECONDS * Math.pow(10, 9);
    }

    public void paint(Graphics g) {
        g.setColor(role.getColor());
        g.fillRect((int) position.getX(), (int) position.getY(), WIDTH, HEIGHT);
    }

    public void update(long deltaNanoTime) {
        searchNanoseconds -= deltaNanoTime;
        if (searchNanoseconds <= 0) {
            Random rand = new Random();
            searchNanoseconds = rand.nextDouble() * MAX_SEARCH_SECONDS * Math.pow(10, 9);
            float randX = rand.nextFloat() * 2 - 1;
            float randY = rand.nextFloat() * 2 - 1;
            Vector2 directionToGo = new Vector2(randX, randY).getNormalizedVector();
            velocity = directionToGo.mul(speed);
        }


        position = position.add(velocity);
    }
}

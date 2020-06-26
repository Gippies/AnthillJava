package creature.ant;

import util.GraphicComponent;
import util.Vector2;

import java.awt.Graphics;
import java.util.Random;

public class Ant implements GraphicComponent {
    public static final int WIDTH = 2;
    public static final int HEIGHT = 2;

    private Vector2 position;
    private float speed;
    private Role role;

    public Ant(Vector2 pos, Role r, float s) {
        position = pos;
        role = r;
        speed = s;
    }

    public void paint(Graphics g) {
        g.setColor(role.getColor());
        g.fillRect((int) position.getX(), (int) position.getY(), WIDTH, HEIGHT);
    }

    public void update() {
        Random rand = new Random();
        float randX = rand.nextFloat() * 2 - 1;
        float randY = rand.nextFloat() * 2 - 1;
        Vector2 directionToGo = new Vector2(randX, randY).getNormalizedVector();
        Vector2 velocity = directionToGo.mul(speed);

        position = position.add(velocity);
    }
}

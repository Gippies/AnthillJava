package patterson.anthill.plant;

import patterson.anthill.util.GraphicComponent;
import patterson.anthill.util.Vector2;

import java.awt.Color;
import java.awt.Graphics;

public class Leaf implements GraphicComponent {
    public static final int WIDTH = 4;
    public static final int HEIGHT = 4;
    public static final int INITIAL_NUMBER = 50;

    private Vector2 position;

    public Leaf(Vector2 position) {
        this.position = position;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect((int) position.getX(), (int) position.getY(), WIDTH, HEIGHT);
    }

    @Override
    public void update(long d) {

    }
}

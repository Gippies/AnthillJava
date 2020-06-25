package util;

import java.awt.Color;
import java.awt.Graphics;

public interface GraphicComponent {
    Color color = null;
    Vector2 position = null;
    int width = 0;
    int height = 0;
    void paint(Graphics g);
    void update();
}

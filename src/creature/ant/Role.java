package creature.ant;

import java.awt.Color;

public class Role {
    private String name;
    private Color color;

    public Role(String n, Color c) {
        name = n;
        color = c;
    }

    public Color getColor() {
        return color;
    }
}

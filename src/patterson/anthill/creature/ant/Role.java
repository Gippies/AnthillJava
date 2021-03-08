package patterson.anthill.creature.ant;

import java.awt.Color;

public class Role {
    private final String name;
    private final Color color;

    public Role(String n, Color c) {
        name = n;
        color = c;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object.getClass() != this.getClass()) {
            return false;
        }
        Role role = (Role) object;
        return this.name.equals(role.name);
    }
}

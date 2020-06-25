package util;

public class Vector2 {
    private float x, y;
    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + x + "y: " + y;
    }

    public Vector2 add(Vector2 v) {
        return new Vector2(x + v.x, y + v.y);
    }

    public Vector2 sub(Vector2 v) {
        return new Vector2(x - v.x, y - v.y);
    }

    public Vector2 mul(float f) {
        return new Vector2(x * f, y * f);
    }

    public Vector2 div(float f) {
        return new Vector2(x / f, y / f);
    }

    public static Vector2 zero() {
        return new Vector2(0.0f, 0.0f);
    }

    public float getNormal() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vector2 getNormalizedVector() {
        float normal = getNormal();
        if (normal > 0.0) {
            return div(normal);
        }
        else {
            return Vector2.zero();
        }
    }
}

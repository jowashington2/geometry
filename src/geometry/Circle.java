package geometry;

/**
 * Class representing a circle, inheriting from Geometry2D.
 */
public class Circle extends Geometry2D {
    private double radius;

    /**
     * Constructor for Circle.
     * @param radius Radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

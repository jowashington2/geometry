package geometry;

/**
 * Class representing a rectangle, inheriting from Geometry2D.
 */
public class Rectangle extends Geometry2D {
    private double length;
    private double width;

    /**
     * Constructor for Rectangle.
     * @param length Length of the rectangle.
     * @param width Width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}

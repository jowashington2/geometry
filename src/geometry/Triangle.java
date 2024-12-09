package geometry;

/**
 * Class representing a triangle, inheriting from Geometry2D.
 */
public class Triangle extends Geometry2D {
    private double base;
    private double height;

    /**
     * Constructor for Triangle.
     * @param base Base length of the triangle.
     * @param height Height of the triangle.
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ", height=" + height + "]";
    }
}

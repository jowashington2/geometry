package geometry;

/**
 * Class representing a triangular prism, inheriting from Geometry3D.
 */
public class TriangularPrism extends Geometry3D {
    private double base;
    private double height;
    private double length;

    /**
     * Constructor for TriangularPrism.
     * @param base Base length of the triangular prism.
     * @param height Height of the triangular prism.
     * @param length Length of the triangular prism.
     */
    public TriangularPrism(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }

    @Override
    public double getVolume() {
        return 0.5 * base * height * length;
    }

    @Override
    public String toString() {
        return "TriangularPrism[base=" + base + ", height=" + height + ", length=" + length + "]";
    }
}

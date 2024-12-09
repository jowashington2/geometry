package geometry;

/**
 * Class representing a sphere, inheriting from Geometry3D.
 */
public class Sphere extends Geometry3D {
    private double radius;

    /**
     * Constructor for Sphere.
     * @param radius Radius of the sphere.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere[radius=" + radius + "]";
    }
}

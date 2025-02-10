package gr.aueb.cf.pointapp.model;

/**
 * Defines a {@link Point3D} that represents a 3D point.
 * It provides a public API that includes {@link #getDistanceFromOrigin()}
 * for getting the distance from the point to the origin
 *
 * @author jstam
 * @version 0.1
 * @since 0.1
 */

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D() {

    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Gets the distance of a 3D point from the origin.
     *
     * @return  the Euclidean distance of the point to the origin (0, 0, 0)
     */

    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }//end getDistanceFromOrigin()

}

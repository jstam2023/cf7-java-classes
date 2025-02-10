package gr.aueb.cf.ch14.immutable;

public final class Point3DImmutable {
    private ImmutablePoint immutablePoint;
    private int z;

    public Point3DImmutable() {
        immutablePoint = new ImmutablePoint();

    }

    public Point3DImmutable(ImmutablePoint immutablePoint, int z) {
        this.immutablePoint = immutablePoint;
        this.z = z;
    }

    public ImmutablePoint getImmutablePoint() {
        return immutablePoint;
    }

    public void setImmutablePoint(ImmutablePoint immutablePoint) {
        this.immutablePoint = immutablePoint;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

package gr.aueb.cf.ch14;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {
        super();        // constructor chaining
        z = 0;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String pointToString() {
        return super.pointToString() + "(" + z + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z +=10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z +=1;
    }
}

package gr.aueb.cf.ch12.model;
/*
defines a 2-dimension point.

 */

public class Point {
    private static int noOfpoints=0;
    private int x;
    private int y;

    public Point() {
        noOfpoints++;

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getNoOfpoints() {
        return noOfpoints;
    }

    public static void setNoOfpoints(int noOfpoints) {
        Point.noOfpoints = noOfpoints;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

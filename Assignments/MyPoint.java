package Assignments;

public class MyPoint {
    public int x;
    public int y;

    // no-arg constructor: (0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    // distance to given coordinates
    public double distance(int x, int y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // distance to another MyPoint
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // distance to origin
    public double distance() {
        return distance(0,0);
    }
}

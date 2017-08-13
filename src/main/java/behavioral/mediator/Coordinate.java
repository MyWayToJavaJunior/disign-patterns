package behavioral.mediator;

public class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(Coordinate cur, Coordinate delta) {
        this.x = cur.x + delta.x;
        this.y = cur.y + delta.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinate x(int value) {
        this.x = value;
        return this;
    }

    public Coordinate y(int value) {
        this.y = value;
        return this;
    }

    public Coordinate getVector(Coordinate goal) {
        return new Coordinate(toVector(goal.x - this.x), toVector(goal.y - this.y));
    }

    private int toVector(int value) {
        if (value == 0) return 0;
        else if (value > 0) return 1;
        else return -1;
    }

    public boolean compare(Coordinate coordinate) {
        return this.x == coordinate.x && this.y == coordinate.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y +")";
    }
}

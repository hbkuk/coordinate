package coordinate;

import java.util.Objects;

public class Point {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 24;
    private final int x;
    private final int y;

    private Point(int x, int y) {
        validateValue(x);
        validateValue(y);
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    private void validateValue(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new IllegalArgumentException("최소 0 이상, 최대 24 이하만 가능합니다");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getXDifference(Point point) {
        return this.x - point.x;
    }

    public int getYDifference(Point point) {
        return this.y - point.y;
    }
}

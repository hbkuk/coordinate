package coordinate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Line {
    private final Point[] points;

    public Line(Point p1, Point p2) {
        this.points = new Point[]{p1, p2};
    }

    public double getDistance() {
        return Math.sqrt(
                Math.pow(points[0].getXDifference(points[1]), 2) +
                Math.pow(points[0].getYDifference(points[1]), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;

        Set<Point> thisSet = new HashSet<>(Arrays.asList(points));
        Set<Point> lineSet = new HashSet<>(Arrays.asList(line.points));
        return thisSet.equals(lineSet);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}

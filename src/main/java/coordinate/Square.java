package coordinate;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Square {
    public final List<Point> points;

    public Square(List<Point> points) {
        validateSquare(points);
        this.points = points;
    }

    public static Square of(List<Point> points) {
        return new Square(points);
    }

    private void validateSquare(List<Point> points) {
        if (points.size() != 4) {
            throw new IllegalArgumentException("포인트는 4개가 전달되어야 합니다.");
        }
        Set<Integer> xValues = points.stream().map(Point::getX).collect(Collectors.toSet());
        Set<Integer> yValues = points.stream().map(Point::getY).collect(Collectors.toSet());

        if (isHorizontal(xValues) || isPerpendicular(yValues)) {
            throw new IllegalArgumentException("수직 혹은 수평이 맞지 않습니다.");
        }
    }

    public boolean isPerpendicular(Set<Integer> integers) {
        return integers.size() != 2;
    }

    public boolean isHorizontal(Set<Integer> integers) {
        return integers.size() != 2;
    }

    public int getArea() {
        Set<Integer> xValues = points.stream().map(Point::getX).collect(Collectors.toSet());
        Set<Integer> yValues = points.stream().map(Point::getY).collect(Collectors.toSet());

        return (Collections.max(xValues) - Collections.min(xValues)) *
                (Collections.max(yValues) - Collections.min(yValues));
    }
}

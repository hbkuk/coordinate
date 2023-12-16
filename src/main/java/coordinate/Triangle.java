package coordinate;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Triangle {
    private final List<Point> points;

    public Triangle(List<Point> points) {
        if (points.size() != 3) {
            throw new IllegalArgumentException("포인트는 3개가 전달되어야 합니다.");
        }

        Set<Integer> xValues = points.stream().map(Point::getX).collect(Collectors.toSet());
        Set<Integer> yValues = points.stream().map(Point::getY).collect(Collectors.toSet());

        if (xValues.size() != 3 || yValues.size() != 3) {
            throw new IllegalArgumentException("삼각형 모양이 아닙니다.");
        }

        this.points = points;
    }

    public double getArea() {
        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);

        double lineA = a.getDistance(b);
        double lineB = a.getDistance(c);
        double lineC = b.getDistance(c);

        double semiPerimeter = (lineA + lineB + lineC) / 2;

        return Math.round(Math.sqrt(semiPerimeter *
                (semiPerimeter - lineA) * (semiPerimeter - lineB) * (semiPerimeter - lineC)));
    }
}

package coordinate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {

    @Test
    void create() {
        Line line = new Line(Point.of(1, 2), Point.of(2, 3));
        assertEquals(new Line(Point.of(1, 2), Point.of(2, 3)), line);
        assertEquals(new Line(Point.of(2, 3), Point.of(1, 2)), line);
    }

    @Test
    void two_point_distance() {
        Line line = new Line(Point.of(10, 10), Point.of(14, 15));
        assertEquals(6.403124, line.getDistance(), 0.000001);
    }
}

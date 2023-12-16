package coordinate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void create() {
        Point point = Point.of(1, 2);
        assertEquals(Point.of(1, 2), point);
    }

    @DisplayName("좌표는 최소 0 이상, 최대 24 이하까지만 전달되어야 한다.")
    @ParameterizedTest
    @CsvSource(value = {"0:24", "24:0", "0:0", "24:24"}, delimiter = ':')
    void point_valid_value(int x, int y) {
        Point.of(x, y);
    }

    @DisplayName("좌표는 0 미만, 24 초과된 숫자가 전달된다면 예외가 발생한다.")
    @ParameterizedTest
    @CsvSource(value = {"0:25", "25:0", "-1:-1", "25:25"}, delimiter = ':')
    void point_invalid_value(int x, int y) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    Point.of(x, y);
                }).withMessageMatching("최소 0 이상, 최대 24 이하만 가능합니다");
    }

    @Test
    @DisplayName("전달받은 좌표의 X 좌표 차이를 반환한다.")
    void getXDifference() {
        Point p1 = Point.of(1, 10);
        Point p2 = Point.of(5, 10);

        assertEquals(-4, p1.getXDifference(p2));
        assertEquals(0, p1.getYDifference(p2));
    }

    @Test
    @DisplayName("두 점 사이의 거리를 반환한다.")
    void two_point_distance() {
        Point p1 = Point.of(10, 10);
        Point p2 = Point.of(14, 15);
        assertEquals(6.403124, p1.getDistance(p2), 0.000001);
    }
}

package coordinate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    void create() {
        Square square = new Square(Arrays.asList(
                Point.of(10, 10), Point.of(22, 10),
                Point.of(22, 18), Point.of(10, 18)));
    }

    @Test
    @DisplayName("포인트 목록의 사이즈가 4가 아닐 경우, 예외가 발생한다.")
    void validate_square_if_given_point_length_not_4() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new Square(Arrays.asList(
                            Point.of(10, 10), Point.of(22, 10),
                            Point.of(22, 18)));
                })
                .withMessageMatching("포인트는 4개가 전달되어야 합니다.");
    }

    @Test
    @DisplayName("포인트 목록의 x좌표가 수평이 맞지 않는다면, 예외가 발생한다.")
    void validate_square_if_given_not_horizontal() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new Square(Arrays.asList(
                            Point.of(10, 10), Point.of(20, 10),
                            Point.of(22, 18), Point.of(10, 18)));
                })
                .withMessageMatching("수직 혹은 수평이 맞지 않습니다.");
    }

    @Test
    @DisplayName("포인트 목록의 y좌표가 수직이 맞지 않는다면, 예외가 발생한다.")
    void validate_square_if_given_not_perpendicular() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new Square(Arrays.asList(
                            Point.of(10, 10), Point.of(22, 10),
                            Point.of(22, 18), Point.of(10, 20)));
                })
                .withMessageMatching("수직 혹은 수평이 맞지 않습니다.");
    }

    @Test
    @DisplayName("사각형의 넓이를 반환")
    void return_the_area_of_square() {
        Square square = new Square(Arrays.asList(
                Point.of(10, 10), Point.of(22, 10),
                Point.of(22, 18), Point.of(10, 18)));

        assertEquals(96, square.getArea());
    }
}

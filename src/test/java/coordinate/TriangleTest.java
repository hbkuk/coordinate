package coordinate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void create() {
        Triangle triangle = new Triangle(Arrays.asList(
                Point.of(10, 10),
                Point.of(14, 15),
                Point.of(20, 8)
        ));
    }

    @Test
    @DisplayName("포인트 목록의 사이즈가 3이 아닐 경우, 예외가 발생한다.")
    void validate_triangle_if_given_point_lengrth_3() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new Triangle(Arrays.asList(
                            Point.of(10, 10), Point.of(22, 10)));
                })
                .withMessageMatching("포인트는 3개가 전달되어야 합니다.");
    }

    @Test
    @DisplayName("포인트 목록으로 삼각형을 만들 때 형상이 다른 경우, 예외가 발생한다.")
    void validate_triangle_shape() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new Triangle(Arrays.asList(
                            Point.of(10, 10), Point.of(22, 10), Point.of(10, 10)));
                })
                .withMessageMatching("삼각형 모양이 아닙니다.");
    }

    @Test
    @DisplayName("삼각형의 넓이를 반환")
    void return_the_area_of_triangle() {
        Triangle triangle = new Triangle(Arrays.asList(
                Point.of(10, 10),
                Point.of(14, 15),
                Point.of(20, 8)
        ));

        assertEquals(29.0, triangle.getArea());
    }
}

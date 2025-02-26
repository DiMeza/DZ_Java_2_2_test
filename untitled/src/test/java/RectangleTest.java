import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import geometricfigures.Rectangle;
public class RectangleTest {

    @ParameterizedTest
    @CsvSource({
            "1.0, 1.0, 1.0",
            "2.0, 2.0, 4.0",
            "3.0, 4.0, 12.0"
    })
    void shouldCalculateAreaCorrectly(double length, double width, double expectedArea) {
        // Given
        Rectangle rectangle = new Rectangle(length, width);

        // When
        double area = rectangle.calculateArea();

        // Then
        Assertions.assertEquals(expectedArea, area, 0.00001);
    }

    @ParameterizedTest
    @CsvSource({
            "1.0, 1.0, 4.0",
            "2.0, 2.0, 8.0",
            "3.0, 4.0, 14.0"
    })
    void shouldCalculatePerimeterCorrectly(double length, double width, double expectedPerimeter) {
        // Given
        Rectangle rectangle = new Rectangle(length, width);

        // When
        double perimeter = rectangle.calculatePerimeter();

        // Then
        Assertions.assertEquals(expectedPerimeter, perimeter, 0.00001);
    }
}

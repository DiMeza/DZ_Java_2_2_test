import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import geometricfigures.Square;
class SquareTest {

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.0, 10.0})
    void shouldCalculateAreaCorrectly(double side) {
        // Given
        Square square = new Square(side);

        // When
        double area = square.calculateArea();

        // Then
        Assertions.assertEquals(side * side, area, 0.00001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.0, 10.0})
    void shouldCalculatePerimeterCorrectly(double side) {
        // Given
        Square square = new Square(side);

        // When
        double perimeter = square.calculatePerimeter();

        // Then
        Assertions.assertEquals(4 * side, perimeter, 0.00001);
    }
}
import static org.junit.jupiter.api.Assertions.*;

import geometricfigures.Circle;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Circle_test {
    private static final double PI = 3.14159;
    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.0, 10.0})
    void shouldCalculateAreaCorrectly(double radius) {
        // Given
        Circle circle = new Circle(radius);

        // When
        double area = circle.calculateArea();

        // Then
        Assertions.assertEquals(PI * radius * radius, area, 0.00001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.0, 10.0})
    void shouldCalculatePerimeterCorrectly(double radius) {
        // Given
        Circle circle = new Circle(radius);

        // When
        double perimeter = circle.calculatePerimeter();

        // Then
        Assertions.assertEquals(2 * PI * radius, perimeter, 0.00001);
    }
}

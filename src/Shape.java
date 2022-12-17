package src;

public interface Shape {

    default double calculateArea(double radius) {
        return 0;
    }

    default double calculatePerimiter(double r) {
        return 0;
    }
}

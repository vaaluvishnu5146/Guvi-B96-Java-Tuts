public class CalculateArea {

    // Circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Square
    public static double area(int side) {
        return side * side;
    }

    // Rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Triangle
    public static double area(int base, int height) {
        return (double) 1 / 2 * base * height;
    }

}

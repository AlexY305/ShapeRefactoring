package shapes;

public class ShapeFactory {

    public static Shape createTriangle(double height, double base) {
        return new Triangle(height, base);
    }

    public static Shape createRectangle(double height, double width) {
        return new Rectangle(height, width);
    }

    public static Shape createSquare(double side) {
        return new Square(side);
    }

    public static Shape createCircle(double radius) {
        return new Circle(radius);
    }
}

package shapes;

public class ShapeFactory {

    public static Shape createTriangle(double theHeight, double theBase) {
        return new Triangle(theHeight, theBase);
    }

    public static Shape createRectangle(double theHeight, double theWidth) {
        return new Rectangle(theHeight, theWidth);
    }

    public static Shape createSquare(double theSide) {
        return new Square(theSide);
    }

    public static Shape createCircle(double theRadius) {
        return new Circle(theRadius);
    }
}

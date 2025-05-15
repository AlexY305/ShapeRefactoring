import shapes.Shape;
import shapes.ShapeFactory;

import java.util.ArrayList;

public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(ShapeFactory.createTriangle(5, 10));
        shapes.add(ShapeFactory.createRectangle(4, 8));
        shapes.add(ShapeFactory.createSquare(6));
        shapes.add(ShapeFactory.createCircle(3));
        shapes.add(ShapeFactory.createCircle(5));
        shapes.add(ShapeFactory.createSquare(2));

        for (Shape s : shapes) {
            System.out.println("Area of the " + s.getName() + " is " + s.getArea());
        }
    }
}

package shapes;

class Circle extends Shape {
    private final double myRadius;

    Circle(double theRadius) {
        myRadius = theRadius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.PI * myRadius * myRadius;
    }
}

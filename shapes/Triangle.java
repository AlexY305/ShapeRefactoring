package shapes;

class Triangle extends Shape {
    private final double myHeight;
    private final double myBase;

    Triangle(double theHeight, double theBase) {
        myHeight = theHeight;
        myBase = theBase;
    }

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public double getArea() {
        return 0.5 * myHeight * myBase;
    }
}

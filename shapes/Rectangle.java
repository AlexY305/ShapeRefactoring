package shapes;

class Rectangle extends Shape {
    private final double myHeight;
    private final double myWidth;

    Rectangle(double theHeight, double theWidth) {
        myHeight = theHeight;
        myWidth = theWidth;
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return myHeight * myWidth;
    }
}

package shapes;

class Rectangle extends Shape {
    private final double height;
    private final double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return height * width;
    }
}

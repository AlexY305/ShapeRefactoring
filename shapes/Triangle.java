package shapes;

class Triangle extends Shape {
    private final double height;
    private final double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public double getArea() {
        return 0.5 * height * base;
    }
}

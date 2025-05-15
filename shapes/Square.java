package shapes;

class Square extends Shape {
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

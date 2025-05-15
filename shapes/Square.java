package shapes;

class Square extends Shape {
    private final double mySide;

    Square(double theSide) {
        mySide = theSide;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return mySide * mySide;
    }
}

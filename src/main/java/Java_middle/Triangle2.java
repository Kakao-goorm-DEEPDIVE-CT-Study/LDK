package Java_middle;

class Triangle3 extends Shape {
    private double base;
    private double height;

    public Triangle3(double base, double height) {
        super("삼각형");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
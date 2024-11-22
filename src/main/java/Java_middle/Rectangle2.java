package Java_middle;

class Rectangle3 extends Shape {
    private double width;
    private double height;

    public Rectangle3(double width, double height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
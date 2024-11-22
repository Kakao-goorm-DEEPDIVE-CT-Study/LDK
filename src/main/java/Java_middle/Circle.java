package Java_middle;

class Circle3 extends Shape {
    private double radius;

    public Circle3(double radius) {
        super("원");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

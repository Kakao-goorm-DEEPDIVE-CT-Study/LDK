/*
package Java_middle;

// 도형 인터페이스
interface Shape {
    double calculateArea(); // 면적 계산 메서드
}

// 원 클래스
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 사각형 클래스
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// 삼각형 클래스
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// 실행 클래스
public class ShapeTest2 {
    public static void main(String[] args) {
        // Circle 객체 생성 및 면적 출력
        Shape circle = new Circle(5);
        System.out.printf("원의 면적: %.2f\n", circle.calculateArea());

        // Rectangle 객체 생성 및 면적 출력
        Shape rectangle = new Rectangle(4, 7);
        System.out.printf("사각형의 면적: %.2f\n", rectangle.calculateArea());

        // Triangle 객체 생성 및 면적 출력
        Shape triangle = new Triangle(6, 3);
        System.out.printf("삼각형의 면적: %.2f\n", triangle.calculateArea());
    }
}

*/

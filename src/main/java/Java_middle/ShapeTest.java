/*
package Java_middle;

abstract class Shape {
    double area;

    public abstract void CaculateArea();

    public double getArea() {
        return area;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        CaculateArea();
    }

    @Override
    public void CaculateArea() {
        area = Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        CaculateArea();
    }

    @Override
    public void CaculateArea() {
        area = width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        CaculateArea();
    }

    @Override
    public void CaculateArea() {
        area = 0.5 * base * height;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(7, 5);

        System.out.println(shapes[0].area);
        System.out.println(shapes[1].area);
        System.out.println(shapes[2].area);

        for (Shape e : shapes) {
            System.out.printf("면적 = %.0f\n", e.getArea());
        }
    }
}


//abstract class Shape { // 클래스 이름을 대문자로 수정
//    protected String name;
//    protected double area;
//
//    public Shape(String name) {
//        this.name = name;
//    }
//
//    public abstract void calculateArea();
//
//    public double getArea() {
//        return area;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Circle extends Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        super("Circle");
//        this.radius = radius;
//        calculateArea();
//    }
//
//    @Override
//    public void calculateArea() {
//        area = Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        super("Rectangle");
//        this.width = width;
//        this.height = height;
//        calculateArea();
//    }
//
//    @Override
//    public void calculateArea() {
//        area = width * height;
//    }
//}
//
//class Triangle extends Shape {
//    private double base;
//    private double height;
//
//    public Triangle(double base, double height) {
//        super("Triangle");
//        this.base = base;
//        this.height = height;
//        calculateArea();
//    }
//
//    @Override
//    public void calculateArea() {
//        area = 0.5 * base * height;
//    }
//}
//
//public class ShapeTest { // 실행 클래스 이름을 변경
//    public static void main(String[] args) {
//        Shape[] shapes = new Shape[3];
//
//        shapes[0] = new Circle(5);       // 반지름이 5인 원
//        shapes[1] = new Rectangle(4, 6); // 가로 4, 세로 6인 사각형
//        shapes[2] = new Triangle(3, 7);  // 밑변 3, 높이 7인 삼각형
//
//        for (Shape shape : shapes) {
//            System.out.printf("%s의 면적: %.2f\n", shape.getName(), shape.getArea());
//        }
//    }
//}
*/

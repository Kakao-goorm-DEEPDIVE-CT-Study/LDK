package Java_middle;

public class ShapeTest3 {
    public static void main(String[] args) {
        // 도형 객체 배열 생성
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle3(5);           // 반지름 5인 원
        shapes[1] = new Rectangle3(4, 7);    // 가로 4, 세로 7인 사각형
        shapes[2] = new Triangle3(6, 3);     // 밑변 6, 높이 3인 삼각형

        // 각 도형의 면적 출력
        for (Shape shape : shapes) {
            System.out.printf("%s의 면적: %.2f\n", shape.getType(), shape.calculateArea());
        }
    }
}
package Java_middle;

// 도형 인터페이스
interface ShapeInterface {
    double calculateArea(); // 면적 계산 메서드
}

// 도형 추상 클래스
abstract class Shape implements ShapeInterface {
    private String type; // 도형 종류

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // 추상 메서드: 모든 하위 클래스에서 구현해야 함
    public abstract double calculateArea();
}

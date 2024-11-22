package Java_middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 연산자를 키로, 계산 로직을 값으로 가지는 맵 정의
        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();
        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다!");
            }
            return a / b;
        });

        try {
            // 사용자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = scanner.nextDouble();

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            String operator = scanner.next();

            // 연산 수행
            BiFunction<Double, Double, Double> operation = operations.get(operator);
            if (operation != null) {
                double result = operation.apply(num1, num2);
                System.out.printf("결과: %.2f\n", result);
            } else {
                System.out.println("유효하지 않은 연산자입니다!");
            }
        } catch (ArithmeticException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("입력이 잘못되었습니다. 숫자와 연산자를 올바르게 입력하세요.");
        } finally {
            scanner.close();
        }
    }
}

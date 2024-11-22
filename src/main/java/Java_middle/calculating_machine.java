/*
package Java_middle;

import java.util.Scanner;

public class calculating_machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 사용자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            // 연산 수행 및 결과 출력
            double result = calculate(num1, operator, num2);
            System.out.printf("결과: %.2f\n", result);

        } catch (NumberFormatException e) {
            System.out.println("숫자를 올바르게 입력하세요!");
        } catch (ArithmeticException e) {
            System.out.println("수학적 오류: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 연산자입니다. +, -, *, / 중 하나를 입력하세요.");
        } catch (Exception e) {
            System.out.println("알 수 없는 오류가 발생했습니다.");
        } finally {
            scanner.close();
            System.out.println("프로그램이 종료되었습니다.");
        }
    }

    // 계산 로직
    public static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        }
    }
}

*/

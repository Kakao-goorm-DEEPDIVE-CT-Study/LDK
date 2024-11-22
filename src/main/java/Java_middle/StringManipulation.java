package Java_middle;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 문자열 입력받기
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        // 문자열 뒤집기
        String reversed = new StringBuilder(input).reverse().toString();

        // 대소문자 변환
        StringBuilder caseChanged = new StringBuilder();
        for (char c : reversed.toCharArray()) {
            if (Character.isUpperCase(c)) {
                caseChanged.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                caseChanged.append(Character.toUpperCase(c));
            } else {
                caseChanged.append(c); // 알파벳이 아니면 그대로 추가
            }
        }

        // 결과 출력
        System.out.println("뒤집은 문자열: " + reversed);
        System.out.println("대소문자 변환한 문자열: " + caseChanged);

        scanner.close();
    }
}

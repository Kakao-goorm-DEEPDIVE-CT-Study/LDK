package Java_middle;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 배열 크기 입력받기
        System.out.print("배열 크기를 입력하세요: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // 배열의 요소 입력받기
        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // 정렬 전 배열 출력
        System.out.println("정렬 전 배열: " + Arrays.toString(array));

        // Arrays.sort()를 이용한 정렬
        Arrays.sort(array);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(array));

        scanner.close();
    }
}

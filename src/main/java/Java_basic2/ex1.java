package Java_basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 홀수/짝수 판별 프로그램 작성하기
public class ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        else
            System.out.println("홀수입니다.");
    }
}

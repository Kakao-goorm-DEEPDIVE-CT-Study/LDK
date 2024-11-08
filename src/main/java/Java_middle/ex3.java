package Java_middle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {7,1,9,8,4,15,2,5,4,20};

        int sum = 0;
        for (int e : arr) {
            sum += e;
        }

        System.out.println((double) sum / arr.length);
    }
}

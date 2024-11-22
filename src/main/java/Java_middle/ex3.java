package Java_middle;

public class ex3 {
    public static void main(String[] args) {
        int[] arr = {7,1,9,8,4,15,2,5,4,20};

        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.print("평균 = ");
        System.out.println((double) sum / arr.length);
    }
}

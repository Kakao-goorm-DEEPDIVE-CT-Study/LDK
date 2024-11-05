import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("나이 입력 ");
        String a = br.readLine();
        System.out.print("이름 입력 ");
        String b = br.readLine();

        System.out.println("나이:" + a + "\t" + "이름:" + b);
    }
}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        while (true) {

            answer++;
            if (answer * (answer + 1) > N * 2) {
                break;
            }
        }
        System.out.println(answer - 1);

    }
}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int solution=2;
        for (int j = 0; j < N; j++) {
            solution=2*solution-1;
        }
        System.out.println(solution*solution);

    }
}

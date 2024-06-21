package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());

            while (true){
                if(isPrime(num)){
                    System.out.println(num);
                    break;
                }
                num++;

            }
        }
    }

    private static boolean isPrime(long n){
        if (n == 1) return false;


        if (n==2||n == 3) return true;


        if (n % 2 == 0 || n % 3 == 0) return false;

        // 소수는 6*k+1 또는 6*k-1이다. 즉 소수에게 나누어 떨어지는 지 확인하는 경우
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }


        return true;
    }
}

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
                num=num+1;
                if(isPrime(num)){
                    System.out.println(num);
                    break;
                }

            }
        }
    }

    private static boolean isPrime(long num){

    }
}

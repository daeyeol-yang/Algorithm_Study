package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int solution=0;
        int r = 64;

        while (true){
            if(r>n){
                r/=2;
            }else {
                n-=r;
                solution++;
            }
            if(n==0){
                break;
            }
        }
        System.out.println(solution);
    }
}

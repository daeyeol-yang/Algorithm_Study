package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int solution =0;



        while (true){
            if(N%5==0){
                solution+=N/5;
                break;

            }else {
                N-=3;
                solution++;
                if(N<0){
                    solution=-1;
                    break;
                }
            }
        }

        System.out.println(solution);

    }
}

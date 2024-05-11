package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S16910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int testcase = 1; testcase <=T ; testcase++) {
            int count =0;
            sb.append("#").append(testcase).append(" ");
            int N = Integer.parseInt(br.readLine());
            for (int i = -N; i <=N; i++) {
                for (int j = -N; j <=N ; j++) {
                    if(Math.pow(i,2)+Math.pow(j,2)<=Math.pow(N,2)){
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}

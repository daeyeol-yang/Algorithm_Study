package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S9997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <=T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            int time = Integer.parseInt(br.readLine());

            int bun = 2*time;

            int si = bun/60;

            int sibun = bun%60;


            sb.append(si).append(" ").append(sibun).append('\n');
        }
        System.out.print(sb);
    }
}

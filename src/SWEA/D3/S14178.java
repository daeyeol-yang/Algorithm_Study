package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S14178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <=T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            int num = 2*D+1;

            int solution= N%num==0? N/num:N/num+1;
            sb.append(solution).append('\n');
        }
        System.out.println(sb);
    }
}

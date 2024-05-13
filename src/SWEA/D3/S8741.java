package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S8741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T; testcase++) {
            sb.append("#").append(testcase).append(" ");
            String[] s = br.readLine().split(" ");

            for (int i = 0; i < s.length; i++) {

                sb.append(String.valueOf(s[i].charAt(0)).toUpperCase());
            }



            sb.append('\n');

        }
        System.out.println(sb);

    }
}

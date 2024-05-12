package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int testcase = 1; testcase <= T; testcase++) {
            sb.append("#").append(testcase).append(" ");
            int [] arr = new int[5];
            st = new StringTokenizer(br.readLine());
            int sum =0;
            for (int i = 0; i < 5; i++) {
                int score =Integer.parseInt(st.nextToken());
                arr[i]= score<40 ? 40 : score;
                sum+= arr[i];
            }
            sb.append(sum/5).append('\n');
        }

        System.out.println(sb);
    }
}

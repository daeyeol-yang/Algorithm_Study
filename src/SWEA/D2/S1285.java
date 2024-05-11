package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T; testcase++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int count=0;
            int [] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                min=Math.min(Math.abs(arr[i]),min);

            }

            for (int i = 0; i < N; i++) {
                if(Math.abs(arr[i])==min){
                    count++;
                }
            }
            sb.append("#").append(testcase).append(" ").append(min).append(" ").append(count);

        }
        System.out.println(sb);
    }
}

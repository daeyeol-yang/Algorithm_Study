package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S8500 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <=T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[N];
            int sum=0;
            int max=0;
            for (int i = 0; i < N; i++) {
                arr[i]=Integer.parseInt(st.nextToken());
                sum+=arr[i];
                max = Math.max(arr[i],max);
            }

            sb.append(sum+max+N).append('\n');

        }
        System.out.println(sb);
    }
}

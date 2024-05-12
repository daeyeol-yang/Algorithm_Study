package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();

        for (int testcase = 1; testcase <=T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            int N = Integer.parseInt(br.readLine());
            
            int [][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j]= s.charAt(j)-'0';
                }
            }
            int ban = N/2;
            int start =N/2;
            int end = N/2;

            int sum =0;
            for (int i = 0; i < ban; i++) {
                for (int j = start; j <=end ; j++) {
                    sum += arr[i][j];
                }
                    start--;
                    end++;

            }
            start++;
            end--;
            for (int i = ban+1; i <N ; i++) {
                for (int j = start; j <=end ; j++) {
                    sum+=arr[i][j];
                }
                start++;
                end--;

            }

            for (int i = 0; i < N; i++) {
                sum+=arr[ban][i];

            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}

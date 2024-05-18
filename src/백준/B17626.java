package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int []dp = new int[50001];

        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        dp[4]=1;
        for (int i = 2; i <=N ; i++) {
            int min =Integer.MAX_VALUE;
            for (int j = 1; j*j <= i ; j++) {
                min=Math.min(dp[i-j*j]+1,min);
            }
            dp[i]=min;
        }

        System.out.println(dp[N]);

    }
}

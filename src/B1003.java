import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1003 {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp = new int[41][3];


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < 41; j++) {
                dp[j][0]=-1;
            }
            dp[0][0]=0;
            dp[1][0]=1;
            dp[0][1]=1;
            dp[0][2]=0;
            dp[1][1]=0;
            dp[1][2]=1;


            fibonacci(N);
            sb.append(dp[N][1]).append(" ").append(dp[N][2]).append('\n');

        }

        System.out.println(sb);
    }

    static int[] fibonacci(int n){
       if(dp[n][1]==-1||dp[n][2]==-1||dp[n][0]==-1){
           dp[n][0]= fibonacci(n-1)[1]+fibonacci(n-2)[0];
           dp[n][1]= fibonacci(n-1)[1]+fibonacci(n-2)[1];
           dp[n][2]= fibonacci(n-1)[2]+fibonacci(n-2)[2];
       }

        return dp[n];
    }
}

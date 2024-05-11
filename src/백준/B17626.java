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
        int n=3;
        boolean check=false;
        while (Math.pow(n,2)<50000){
            for (int i = 5; i <=50000 ; i++) {


                if(i==(int)(Math.pow(n,2))){
                    check=true;
                    break;
                }
                dp[i]=dp[i-(int)Math.pow((n-1),2)]+1;

            }
            if(check){
                n++;
                check=false;
            }
        }



        System.out.println(dp[N]);
    }
}

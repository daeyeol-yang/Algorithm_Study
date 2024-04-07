package DongBin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result =0;

        while (true){
            if(n%k==0){
                n/=k;
                result++;
            }else {
                n-=1;
                result++;
            }

            if(n==1){
                break;
            }
        }
        System.out.println(result);
    }
}

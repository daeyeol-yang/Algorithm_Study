package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st1.nextToken());
        int P = Integer.parseInt(st1.nextToken());
        int[] arr = new int[6];
        int sum =0;
        for (int i = 0; i < 6; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
            if(arr[i]%T==0){
                sum+=arr[i]/T;
            }else {
                sum+=arr[i]/T+1;

            }

        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum).append('\n');
        sb.append(N/P).append(" ").append(N%P);

        System.out.println(sb);

    }
}

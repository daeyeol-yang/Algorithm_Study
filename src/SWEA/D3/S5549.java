package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            String s = br.readLine();
            int n = s.charAt(s.length()-1)-'0';
            if(n%2==0){

                sb.append("Even").append('\n');
            }else {
                sb.append("Odd").append('\n');
            }
        }
        System.out.println(sb);
    }
}

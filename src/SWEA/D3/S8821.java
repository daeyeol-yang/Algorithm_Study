package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S8821 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            Set<Integer> set = new HashSet<>();
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                int num = s.charAt(i)-'0';
                if(!set.contains(num)){

                    set.add(num);
                }else {
                    set.remove(num);
                }
            }
            sb.append(set.size()).append('\n');
        }
        System.out.println(sb);
    }
}

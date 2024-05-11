package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S13299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] week = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT" };
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            String s = br.readLine();
            for (int j = 0; j < week.length; j++) {
                if(s.equals(week[j])){
                    sb.append("#").append(i).append(" ").append(7-j).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            hashMap.put(String.valueOf(i+1), s);
            hashMap.put(s, String.valueOf(i+1));

        }
        for (int i = 0; i < M; i++) {
            String s = br.readLine();

            if (hashMap.containsKey(s)) {
                sb.append(hashMap.get(s)).append('\n');
            }
        }
        System.out.println(sb);
    }
}

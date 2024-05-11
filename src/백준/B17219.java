package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int T1 = Integer.parseInt(st.nextToken());
        HashMap<String, String> hashMap =new HashMap<>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            hashMap.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T1; i++) {
            st= new StringTokenizer(br.readLine());
            sb.append(hashMap.get(st.nextToken())).append('\n');
        }

        System.out.println(sb);


    }
}

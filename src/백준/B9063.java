package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] n1 = new int[T];
        int[] n2 = new int[T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            n1[i]=Integer.parseInt(st.nextToken());
            n2[i]=Integer.parseInt(st.nextToken());


        }
        Arrays.sort(n1);
        Arrays.sort(n2);

        int solution = (n1[n1.length-1]-n1[0])*(n2[n2.length-1]-n2[0]);

        System.out.println(solution);
    }
}

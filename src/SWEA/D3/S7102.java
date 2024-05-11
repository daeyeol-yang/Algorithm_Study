package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class S7102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T; testcase++) {
            sb.append("#").append(testcase).append(" ");
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            int card1 =Integer.parseInt(st.nextToken());
            int card2 =Integer.parseInt(st.nextToken());

            int [] arr = new int[card1+card2+1];

            for (int i = 1; i < card1 ; i++) {
                for (int j = 1; j <card2 ; j++) {
                    arr[i+j]++;
                }
            }

            int [] arr1 = arr.clone();

            Arrays.sort(arr1);

            int max = arr1[arr1.length-1];

            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==max){
                    sb.append(i+1).append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}

package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int testcase = 1; testcase <=T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            st = new StringTokenizer(br.readLine());
            int arr[] = new int[101];
            int number1 = Integer.parseInt(st.nextToken());
            int number2 = Integer.parseInt(st.nextToken());
            int number3 = Integer.parseInt(st.nextToken());

            arr[number1]++;
            arr[number2]++;
            arr[number3]++;
            int solution=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==1||arr[i]==3){
                    solution=i;
                }
            }
            sb.append(solution).append('\n');

        }
        System.out.println(sb);
    }
}

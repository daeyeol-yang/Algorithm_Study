package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            String [] arr = new String[N];
            for (int j = 0; j < N; j++) {
                arr[j]= st.nextToken();
            }

            if(N>=33){
                sb.append(0).append('\n');
                continue;
            }

            int min = Integer.MAX_VALUE;


            for (int j = 0; j < N; j++) {
                for (int k = j+1; k < N ; k++) {
                    for (int l = k+1; l <N ; l++) {
                        int count=0;
                        for (int m = 0; m < 4; m++) {
                            if(arr[j].charAt(m)!=arr[k].charAt(m)){
                                count++;
                            }
                            if(arr[l].charAt(m)!=arr[k].charAt(m)){
                                count++;
                            }
                            if(arr[j].charAt(m)!=arr[l].charAt(m)){
                                count++;
                            }

                        }
                        min = Math.min(min,count);
                    }
                }
            }
            sb.append(min).append('\n');
        }

        System.out.println(sb);
    }
}

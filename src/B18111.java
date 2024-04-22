import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][]map = new int[N][M];
        int inventory = Integer.parseInt(st.nextToken());
        int max = 0;
        int min = 257;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max,map[i][j]);
                min = Math.min(min,map[i][j]);
            }
        }
        int low_count=Integer.MAX_VALUE;
        int high =0;


        for (int i = min; i <=max ; i++) {
            int count =0;
            int block = inventory;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(i>map[j][k]){
                        count+=i-map[j][k];
                        block-=i-map[j][k];
                    }

                    if(i<map[j][k]){
                        count+=2*(map[j][k]-i);
                        block+=map[j][k]-i;
                    }

                }
            }
            if(block<0){
                continue;
            }

            if(count<=low_count){
                high=i;
                low_count=count;
            }

        }
        StringBuilder sb = new StringBuilder();
        sb.append(low_count).append(" ").append(high);
        System.out.println(sb);


    }

}

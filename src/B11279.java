import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class B11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue queue = new PriorityQueue(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int M  =Integer.parseInt(br.readLine());

            if(M==0){
                if(queue.isEmpty()){
                    sb.append("0").append('\n');
                }else {
                    sb.append(queue.poll()).append('\n');
                }
            }else {
                queue.add(M);
            }
        }
        System.out.println(sb);
    }
}

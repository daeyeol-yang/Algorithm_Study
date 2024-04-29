import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            if(M==0){
                if(priorityQueue.isEmpty()){
                    sb.append(0).append('\n');
                }else{
                    sb.append(priorityQueue.poll()).append('\n');

                }
            }else {
                priorityQueue.add(M);
            }
        }
        System.out.println(sb);
    }
}

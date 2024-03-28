import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Queue queue;
        for (int i = 0; i < T; i++) {
            int solution=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T2 = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            queue = new PriorityQueue();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < T2; j++) {
                int n1 = Integer.parseInt(st.nextToken());
                if(j==n){
                solution=n1;
                }
                queue.offer(n1);

            }
            System.out.println(solved(queue,solution));
        }

    }

    public static int solved(Queue queue, int solution){
        boolean check = false;
        int returnSolution=0;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            if(solution==(int)queue.poll()){
                check=true;
                returnSolution=i;
                break;

            }
        }
        if(check){
            return size-returnSolution;
        }else
            return 0;


    }
}

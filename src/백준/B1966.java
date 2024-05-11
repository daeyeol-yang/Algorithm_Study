package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            LinkedList<int[]> myqueue = new LinkedList();
            for (int j = 0; j < size; j++) {
                myqueue.offer(new int[] {j, Integer.parseInt(st.nextToken())});
            }

            int count1 = 0;

            while (!myqueue.isEmpty()) {
                int[] front = myqueue.poll();
                boolean isMax = true;

                for (int j = 0; j < myqueue.size(); j++) {
                    if (front[1] < myqueue.get(j)[1]) {
                        myqueue.offer(front);

                        for (int k = 0; k < j; k++) {
                            myqueue.offer(myqueue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if (isMax == false) {
                    continue;
                }
                count1++;
                if (front[0] == count) {
                    break;
                }

            }

            sb.append(count1).append('\n');


        }
        System.out.println(sb);
    }
}
